/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Jun 23, 2021, 12:04:40 PM                   ---
 * ----------------------------------------------------------------
 *  
 * Copyright (c) 2021 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.trainingbala.core.jalo;

import de.hybris.platform.cronjob.jalo.CronJob;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.trainingbala.core.constants.Training279CoreConstants;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.cronjob.jalo.CronJob NewCustomerCronJob}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedNewCustomerCronJob extends CronJob
{
	/** Qualifier of the <code>NewCustomerCronJob.noOfDaysToConsider</code> attribute **/
	public static final String NOOFDAYSTOCONSIDER = "noOfDaysToConsider";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(CronJob.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(NOOFDAYSTOCONSIDER, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NewCustomerCronJob.noOfDaysToConsider</code> attribute.
	 * @return the noOfDaysToConsider
	 */
	public Integer getNoOfDaysToConsider(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, NOOFDAYSTOCONSIDER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NewCustomerCronJob.noOfDaysToConsider</code> attribute.
	 * @return the noOfDaysToConsider
	 */
	public Integer getNoOfDaysToConsider()
	{
		return getNoOfDaysToConsider( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NewCustomerCronJob.noOfDaysToConsider</code> attribute. 
	 * @return the noOfDaysToConsider
	 */
	public int getNoOfDaysToConsiderAsPrimitive(final SessionContext ctx)
	{
		Integer value = getNoOfDaysToConsider( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NewCustomerCronJob.noOfDaysToConsider</code> attribute. 
	 * @return the noOfDaysToConsider
	 */
	public int getNoOfDaysToConsiderAsPrimitive()
	{
		return getNoOfDaysToConsiderAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NewCustomerCronJob.noOfDaysToConsider</code> attribute. 
	 * @param value the noOfDaysToConsider
	 */
	public void setNoOfDaysToConsider(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, NOOFDAYSTOCONSIDER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NewCustomerCronJob.noOfDaysToConsider</code> attribute. 
	 * @param value the noOfDaysToConsider
	 */
	public void setNoOfDaysToConsider(final Integer value)
	{
		setNoOfDaysToConsider( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NewCustomerCronJob.noOfDaysToConsider</code> attribute. 
	 * @param value the noOfDaysToConsider
	 */
	public void setNoOfDaysToConsider(final SessionContext ctx, final int value)
	{
		setNoOfDaysToConsider( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NewCustomerCronJob.noOfDaysToConsider</code> attribute. 
	 * @param value the noOfDaysToConsider
	 */
	public void setNoOfDaysToConsider(final int value)
	{
		setNoOfDaysToConsider( getSession().getSessionContext(), value );
	}
	
}
