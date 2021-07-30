/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Jun 23, 2021, 12:04:40 PM                   ---
 * ----------------------------------------------------------------
 *  
 * Copyright (c) 2021 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.trainingbala.core.jalo;

import de.hybris.platform.cms2.jalo.contents.components.SimpleCMSComponent;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.trainingbala.core.constants.Training279CoreConstants;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.trainingbala.core.jalo.LatestProductComponent LatestProductComponent}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedLatestProductComponent extends SimpleCMSComponent
{
	/** Qualifier of the <code>LatestProductComponent.no0fLatestProduct</code> attribute **/
	public static final String NO0FLATESTPRODUCT = "no0fLatestProduct";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(SimpleCMSComponent.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(NO0FLATESTPRODUCT, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LatestProductComponent.no0fLatestProduct</code> attribute.
	 * @return the no0fLatestProduct
	 */
	public Integer getNo0fLatestProduct(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, NO0FLATESTPRODUCT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LatestProductComponent.no0fLatestProduct</code> attribute.
	 * @return the no0fLatestProduct
	 */
	public Integer getNo0fLatestProduct()
	{
		return getNo0fLatestProduct( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LatestProductComponent.no0fLatestProduct</code> attribute. 
	 * @return the no0fLatestProduct
	 */
	public int getNo0fLatestProductAsPrimitive(final SessionContext ctx)
	{
		Integer value = getNo0fLatestProduct( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LatestProductComponent.no0fLatestProduct</code> attribute. 
	 * @return the no0fLatestProduct
	 */
	public int getNo0fLatestProductAsPrimitive()
	{
		return getNo0fLatestProductAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LatestProductComponent.no0fLatestProduct</code> attribute. 
	 * @param value the no0fLatestProduct
	 */
	public void setNo0fLatestProduct(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, NO0FLATESTPRODUCT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LatestProductComponent.no0fLatestProduct</code> attribute. 
	 * @param value the no0fLatestProduct
	 */
	public void setNo0fLatestProduct(final Integer value)
	{
		setNo0fLatestProduct( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LatestProductComponent.no0fLatestProduct</code> attribute. 
	 * @param value the no0fLatestProduct
	 */
	public void setNo0fLatestProduct(final SessionContext ctx, final int value)
	{
		setNo0fLatestProduct( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LatestProductComponent.no0fLatestProduct</code> attribute. 
	 * @param value the no0fLatestProduct
	 */
	public void setNo0fLatestProduct(final int value)
	{
		setNo0fLatestProduct( getSession().getSessionContext(), value );
	}
	
}
