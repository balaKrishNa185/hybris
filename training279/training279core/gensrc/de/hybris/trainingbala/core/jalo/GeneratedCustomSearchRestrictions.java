/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Jun 23, 2021, 12:04:40 PM                   ---
 * ----------------------------------------------------------------
 *  
 * Copyright (c) 2021 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.trainingbala.core.jalo;

import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.security.Principal;
import de.hybris.platform.jalo.type.SearchRestriction;
import de.hybris.trainingbala.core.constants.Training279CoreConstants;
import java.util.Collection;
import java.util.Collections;

/**
 * Generated class for type {@link de.hybris.trainingbala.core.jalo.CustomSearchRestrictions CustomSearchRestrictions}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedCustomSearchRestrictions extends SearchRestriction
{
	/** Qualifier of the <code>CustomSearchRestrictions.supportGroups</code> attribute **/
	public static final String SUPPORTGROUPS = "supportGroups";
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CustomSearchRestrictions.supportGroups</code> attribute.
	 * @return the supportGroups
	 */
	public Collection<Principal> getSupportGroups(final SessionContext ctx)
	{
		Collection<Principal> coll = (Collection<Principal>)getProperty( ctx, SUPPORTGROUPS);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CustomSearchRestrictions.supportGroups</code> attribute.
	 * @return the supportGroups
	 */
	public Collection<Principal> getSupportGroups()
	{
		return getSupportGroups( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CustomSearchRestrictions.supportGroups</code> attribute. 
	 * @param value the supportGroups
	 */
	public void setSupportGroups(final SessionContext ctx, final Collection<Principal> value)
	{
		setProperty(ctx, SUPPORTGROUPS,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CustomSearchRestrictions.supportGroups</code> attribute. 
	 * @param value the supportGroups
	 */
	public void setSupportGroups(final Collection<Principal> value)
	{
		setSupportGroups( getSession().getSessionContext(), value );
	}
	
}
