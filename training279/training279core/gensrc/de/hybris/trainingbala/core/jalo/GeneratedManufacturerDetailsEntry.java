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
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem ManufacturerDetailsEntry}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedManufacturerDetailsEntry extends GenericItem
{
	/** Qualifier of the <code>ManufacturerDetailsEntry.name</code> attribute **/
	public static final String NAME = "name";
	/** Qualifier of the <code>ManufacturerDetailsEntry.savingTime</code> attribute **/
	public static final String SAVINGTIME = "savingTime";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(NAME, AttributeMode.INITIAL);
		tmp.put(SAVINGTIME, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ManufacturerDetailsEntry.name</code> attribute.
	 * @return the name
	 */
	public String getName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ManufacturerDetailsEntry.name</code> attribute.
	 * @return the name
	 */
	public String getName()
	{
		return getName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ManufacturerDetailsEntry.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ManufacturerDetailsEntry.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final String value)
	{
		setName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ManufacturerDetailsEntry.savingTime</code> attribute.
	 * @return the savingTime
	 */
	public Date getSavingTime(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, SAVINGTIME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ManufacturerDetailsEntry.savingTime</code> attribute.
	 * @return the savingTime
	 */
	public Date getSavingTime()
	{
		return getSavingTime( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ManufacturerDetailsEntry.savingTime</code> attribute. 
	 * @param value the savingTime
	 */
	public void setSavingTime(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, SAVINGTIME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ManufacturerDetailsEntry.savingTime</code> attribute. 
	 * @param value the savingTime
	 */
	public void setSavingTime(final Date value)
	{
		setSavingTime( getSession().getSessionContext(), value );
	}
	
}
