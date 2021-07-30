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
import java.util.List;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem Testing}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedTesting extends GenericItem
{
	/** Qualifier of the <code>Testing.id</code> attribute **/
	public static final String ID = "id";
	/** Qualifier of the <code>Testing.language</code> attribute **/
	public static final String LANGUAGE = "language";
	/** Qualifier of the <code>Testing.samples</code> attribute **/
	public static final String SAMPLES = "samples";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(ID, AttributeMode.INITIAL);
		tmp.put(LANGUAGE, AttributeMode.INITIAL);
		tmp.put(SAMPLES, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Testing.id</code> attribute.
	 * @return the id
	 */
	public Integer getId(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, ID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Testing.id</code> attribute.
	 * @return the id
	 */
	public Integer getId()
	{
		return getId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Testing.id</code> attribute. 
	 * @return the id
	 */
	public int getIdAsPrimitive(final SessionContext ctx)
	{
		Integer value = getId( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Testing.id</code> attribute. 
	 * @return the id
	 */
	public int getIdAsPrimitive()
	{
		return getIdAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Testing.id</code> attribute. 
	 * @param value the id
	 */
	public void setId(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, ID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Testing.id</code> attribute. 
	 * @param value the id
	 */
	public void setId(final Integer value)
	{
		setId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Testing.id</code> attribute. 
	 * @param value the id
	 */
	public void setId(final SessionContext ctx, final int value)
	{
		setId( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Testing.id</code> attribute. 
	 * @param value the id
	 */
	public void setId(final int value)
	{
		setId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Testing.language</code> attribute.
	 * @return the language
	 */
	public List<String> getLanguage(final SessionContext ctx)
	{
		List<String> coll = (List<String>)getProperty( ctx, LANGUAGE);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Testing.language</code> attribute.
	 * @return the language
	 */
	public List<String> getLanguage()
	{
		return getLanguage( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Testing.language</code> attribute. 
	 * @param value the language
	 */
	public void setLanguage(final SessionContext ctx, final List<String> value)
	{
		setProperty(ctx, LANGUAGE,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Testing.language</code> attribute. 
	 * @param value the language
	 */
	public void setLanguage(final List<String> value)
	{
		setLanguage( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Testing.samples</code> attribute.
	 * @return the samples
	 */
	public Map<Integer,String> getAllSamples(final SessionContext ctx)
	{
		Map<Integer,String> map = (Map<Integer,String>)getProperty( ctx, SAMPLES);
		return map != null ? map : Collections.EMPTY_MAP;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Testing.samples</code> attribute.
	 * @return the samples
	 */
	public Map<Integer,String> getAllSamples()
	{
		return getAllSamples( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Testing.samples</code> attribute. 
	 * @param value the samples
	 */
	public void setAllSamples(final SessionContext ctx, final Map<Integer,String> value)
	{
		setProperty(ctx, SAMPLES,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Testing.samples</code> attribute. 
	 * @param value the samples
	 */
	public void setAllSamples(final Map<Integer,String> value)
	{
		setAllSamples( getSession().getSessionContext(), value );
	}
	
}
