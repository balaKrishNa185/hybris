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
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem Customers}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedCustomers extends GenericItem
{
	/** Qualifier of the <code>Customers.customerCreated</code> attribute **/
	public static final String CUSTOMERCREATED = "customerCreated";
	/** Qualifier of the <code>Customers.name</code> attribute **/
	public static final String NAME = "name";
	/** Qualifier of the <code>Customers.phone</code> attribute **/
	public static final String PHONE = "phone";
	/** Qualifier of the <code>Customers.newCustomer</code> attribute **/
	public static final String NEWCUSTOMER = "newCustomer";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(CUSTOMERCREATED, AttributeMode.INITIAL);
		tmp.put(NAME, AttributeMode.INITIAL);
		tmp.put(PHONE, AttributeMode.INITIAL);
		tmp.put(NEWCUSTOMER, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customers.customerCreated</code> attribute.
	 * @return the customerCreated
	 */
	public Date getCustomerCreated(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, CUSTOMERCREATED);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customers.customerCreated</code> attribute.
	 * @return the customerCreated
	 */
	public Date getCustomerCreated()
	{
		return getCustomerCreated( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customers.customerCreated</code> attribute. 
	 * @param value the customerCreated
	 */
	public void setCustomerCreated(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, CUSTOMERCREATED,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customers.customerCreated</code> attribute. 
	 * @param value the customerCreated
	 */
	public void setCustomerCreated(final Date value)
	{
		setCustomerCreated( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customers.name</code> attribute.
	 * @return the name
	 */
	public String getName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customers.name</code> attribute.
	 * @return the name
	 */
	public String getName()
	{
		return getName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customers.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customers.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final String value)
	{
		setName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customers.newCustomer</code> attribute.
	 * @return the newCustomer
	 */
	public Boolean isNewCustomer(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, NEWCUSTOMER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customers.newCustomer</code> attribute.
	 * @return the newCustomer
	 */
	public Boolean isNewCustomer()
	{
		return isNewCustomer( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customers.newCustomer</code> attribute. 
	 * @return the newCustomer
	 */
	public boolean isNewCustomerAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isNewCustomer( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customers.newCustomer</code> attribute. 
	 * @return the newCustomer
	 */
	public boolean isNewCustomerAsPrimitive()
	{
		return isNewCustomerAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customers.newCustomer</code> attribute. 
	 * @param value the newCustomer
	 */
	public void setNewCustomer(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, NEWCUSTOMER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customers.newCustomer</code> attribute. 
	 * @param value the newCustomer
	 */
	public void setNewCustomer(final Boolean value)
	{
		setNewCustomer( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customers.newCustomer</code> attribute. 
	 * @param value the newCustomer
	 */
	public void setNewCustomer(final SessionContext ctx, final boolean value)
	{
		setNewCustomer( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customers.newCustomer</code> attribute. 
	 * @param value the newCustomer
	 */
	public void setNewCustomer(final boolean value)
	{
		setNewCustomer( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customers.phone</code> attribute.
	 * @return the phone
	 */
	public Long getPhone(final SessionContext ctx)
	{
		return (Long)getProperty( ctx, PHONE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customers.phone</code> attribute.
	 * @return the phone
	 */
	public Long getPhone()
	{
		return getPhone( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customers.phone</code> attribute. 
	 * @return the phone
	 */
	public long getPhoneAsPrimitive(final SessionContext ctx)
	{
		Long value = getPhone( ctx );
		return value != null ? value.longValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customers.phone</code> attribute. 
	 * @return the phone
	 */
	public long getPhoneAsPrimitive()
	{
		return getPhoneAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customers.phone</code> attribute. 
	 * @param value the phone
	 */
	public void setPhone(final SessionContext ctx, final Long value)
	{
		setProperty(ctx, PHONE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customers.phone</code> attribute. 
	 * @param value the phone
	 */
	public void setPhone(final Long value)
	{
		setPhone( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customers.phone</code> attribute. 
	 * @param value the phone
	 */
	public void setPhone(final SessionContext ctx, final long value)
	{
		setPhone( ctx,Long.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customers.phone</code> attribute. 
	 * @param value the phone
	 */
	public void setPhone(final long value)
	{
		setPhone( getSession().getSessionContext(), value );
	}
	
}
