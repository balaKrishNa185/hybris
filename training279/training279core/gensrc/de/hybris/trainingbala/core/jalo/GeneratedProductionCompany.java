/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Jun 23, 2021, 12:04:40 PM                   ---
 * ----------------------------------------------------------------
 *  
 * Copyright (c) 2021 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.trainingbala.core.jalo;

import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.trainingbala.core.constants.Training279CoreConstants;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem ProductionCompany}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedProductionCompany extends GenericItem
{
	/** Qualifier of the <code>ProductionCompany.did</code> attribute **/
	public static final String DID = "did";
	/** Qualifier of the <code>ProductionCompany.dname</code> attribute **/
	public static final String DNAME = "dname";
	/** Qualifier of the <code>ProductionCompany.dcountry</code> attribute **/
	public static final String DCOUNTRY = "dcountry";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(DID, AttributeMode.INITIAL);
		tmp.put(DNAME, AttributeMode.INITIAL);
		tmp.put(DCOUNTRY, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductionCompany.dcountry</code> attribute.
	 * @return the dcountry
	 */
	public String getDcountry(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DCOUNTRY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductionCompany.dcountry</code> attribute.
	 * @return the dcountry
	 */
	public String getDcountry()
	{
		return getDcountry( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductionCompany.dcountry</code> attribute. 
	 * @param value the dcountry
	 */
	public void setDcountry(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DCOUNTRY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductionCompany.dcountry</code> attribute. 
	 * @param value the dcountry
	 */
	public void setDcountry(final String value)
	{
		setDcountry( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductionCompany.did</code> attribute.
	 * @return the did
	 */
	public Integer getDid(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, DID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductionCompany.did</code> attribute.
	 * @return the did
	 */
	public Integer getDid()
	{
		return getDid( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductionCompany.did</code> attribute. 
	 * @return the did
	 */
	public int getDidAsPrimitive(final SessionContext ctx)
	{
		Integer value = getDid( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductionCompany.did</code> attribute. 
	 * @return the did
	 */
	public int getDidAsPrimitive()
	{
		return getDidAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductionCompany.did</code> attribute. 
	 * @param value the did
	 */
	public void setDid(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, DID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductionCompany.did</code> attribute. 
	 * @param value the did
	 */
	public void setDid(final Integer value)
	{
		setDid( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductionCompany.did</code> attribute. 
	 * @param value the did
	 */
	public void setDid(final SessionContext ctx, final int value)
	{
		setDid( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductionCompany.did</code> attribute. 
	 * @param value the did
	 */
	public void setDid(final int value)
	{
		setDid( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductionCompany.dname</code> attribute.
	 * @return the dname
	 */
	public String getDname(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductionCompany.dname</code> attribute.
	 * @return the dname
	 */
	public String getDname()
	{
		return getDname( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductionCompany.dname</code> attribute. 
	 * @param value the dname
	 */
	public void setDname(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductionCompany.dname</code> attribute. 
	 * @param value the dname
	 */
	public void setDname(final String value)
	{
		setDname( getSession().getSessionContext(), value );
	}
	
}
