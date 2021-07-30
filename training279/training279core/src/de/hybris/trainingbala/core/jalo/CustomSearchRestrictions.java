package de.hybris.trainingbala.core.jalo;

import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.flexiblesearch.FlexibleSearch;
import de.hybris.platform.jalo.flexiblesearch.FlexibleSearchException;
import de.hybris.platform.jalo.security.Principal;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.SearchRestriction;
import de.hybris.platform.jalo.type.TypeManager;
import org.apache.log4j.Logger;


import java.util.*;

public class CustomSearchRestrictions extends SearchRestriction {

    public static final Logger log=Logger.getLogger(CustomSearchRestrictions.class);


    @Override
    protected Item createItem(SessionContext ctx, ComposedType type, ItemAttributeMap atts) throws JaloBusinessException, JaloInvalidParameterException {
         super.createItem(ctx, type, atts);
        Set missing = new HashSet();
        if (!checkMandatoryAttribute("principal", atts, missing) | !checkMandatoryAttribute("restrictedType", atts, missing) | !checkMandatoryAttribute("query", atts, missing) | !checkMandatoryAttribute("supportGroups",atts,missing)) {
            throw new JaloInvalidParameterException("missing params " + missing + " , got " + atts, 0);
        } else {
            checkUniqueCodeTypePrincipal((Principal)atts.get("principal"), (ComposedType)atts.get("restrictedType"), (String)atts.get("code"),(Collection<Principal>)atts.get("supportGroups"));
            this.checkRestrictionQuery((ComposedType)atts.get("restrictedType"), (String)atts.get("query"),(Collection<Principal>)atts.get("supportGroups"));
            return this.createEntity((Principal)atts.get("principal"), (ComposedType)atts.get("restrictedType"), (String)atts.get("query"), (String)atts.get("code"), (Boolean)atts.get("active"));
        }
    }

        protected void checkRestrictionQuery(ComposedType restrictedType, String query,Collection<Principal> supportGroups) throws JaloInvalidParameterException {
            if (restrictedType == null) {
                throw new JaloInvalidParameterException("restricted type cannot be NULL", 0);
            } else if (query == null) {
                throw new JaloInvalidParameterException("query cannot be NULL", 0);
            }else if(supportGroups==null){
                throw new JaloInvalidParameterException("supportGroups cannot be NULL",0);
            } else if ("".equals(query.trim())) {
                throw new JaloInvalidParameterException("query cannot be empty", 0);
            } else {
                try {
                    this.getSession().getFlexibleSearch().checkQuery("SELECT {item:" + Item.PK + "} FROM {" + restrictedType.getCode() + " AS " + "item" + "} WHERE " + query, true);
                } catch (FlexibleSearchException var4) {
                    throw new JaloInvalidParameterException(var4, var4.getErrorCode());
                }
            }
        }



    private void checkUniqueCodeTypePrincipal(Principal principal, ComposedType type, String code, Collection<Principal> supportGroups) {

        Map params = new HashMap();
        params.put("type", type);
        params.put("code", code.toLowerCase());
        params.put("principal", principal);
        params.put("supportGroups",supportGroups);
        String searchRestrictionCode = TypeManager.getInstance().getComposedType(CustomSearchRestrictions.class).getCode();
        List rows = FlexibleSearch.getInstance().search("SELECT {" + Item.PK + "} " + "FROM {" + searchRestrictionCode + "} " + "WHERE " + "{" + "restrictedType" + "} IN ({{SELECT {restrictedType) From {"+searchRestrictionCode+"} WHERE {"+supportGroups+"}=?supportGroups}}) AND " + "LOWER( {" + "code" + "} ) = ?code" + " AND " + "{" + "principal" + "}=?principal ", params, Collections.singletonList(SearchRestriction.class), true, true, 0, -1).getResult();
        log.info("Custom search restriction class is called......................");
        if (!rows.isEmpty()) {
            throw new JaloInvalidParameterException("SearchRestriction not unique: code '" + code + "' type '" + type.getCode() + "' principal '" + principal.getPK() + "' is not unique", 0);
        }
    }
    }



