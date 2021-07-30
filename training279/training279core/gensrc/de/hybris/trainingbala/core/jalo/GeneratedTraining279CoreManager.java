/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Jun 23, 2021, 12:04:40 PM                   ---
 * ----------------------------------------------------------------
 *  
 * Copyright (c) 2021 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.trainingbala.core.jalo;

import de.hybris.platform.acceleratorservices.constants.AcceleratorServicesConstants;
import de.hybris.platform.acceleratorservices.jalo.email.EmailAttachment;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloSystemException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.jalo.link.Link;
import de.hybris.platform.jalo.media.Media;
import de.hybris.platform.jalo.product.Product;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.JaloGenericCreationException;
import de.hybris.platform.jalo.user.Address;
import de.hybris.platform.jalo.user.Customer;
import de.hybris.platform.jalo.user.User;
import de.hybris.platform.payment.jalo.PaymentTransaction;
import de.hybris.platform.payment.jalo.PaymentTransactionEntry;
import de.hybris.platform.processengine.jalo.BusinessProcess;
import de.hybris.platform.util.OneToManyHandler;
import de.hybris.platform.util.Utilities;
import de.hybris.trainingbala.core.constants.Training279CoreConstants;
import de.hybris.trainingbala.core.jalo.ApparelProduct;
import de.hybris.trainingbala.core.jalo.ApparelSizeVariantProduct;
import de.hybris.trainingbala.core.jalo.ApparelStyleVariantProduct;
import de.hybris.trainingbala.core.jalo.CustomSearchRestrictions;
import de.hybris.trainingbala.core.jalo.CustomerCronJobNew;
import de.hybris.trainingbala.core.jalo.Customers;
import de.hybris.trainingbala.core.jalo.ElectronicsColorVariantProduct;
import de.hybris.trainingbala.core.jalo.LatestProductComponent;
import de.hybris.trainingbala.core.jalo.ManufacturerDetails;
import de.hybris.trainingbala.core.jalo.ManufacturerDetailsEntry;
import de.hybris.trainingbala.core.jalo.NewCustomerCronJob;
import de.hybris.trainingbala.core.jalo.ProductionCompany;
import de.hybris.trainingbala.core.jalo.Testing;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Generated class for type <code>Training279CoreManager</code>.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedTraining279CoreManager extends Extension
{
	/** Relation ordering override parameter constants for ManufacturerToProduct from ((training279core))*/
	protected static String MANUFACTURERTOPRODUCT_SRC_ORDERED = "relation.ManufacturerToProduct.source.ordered";
	protected static String MANUFACTURERTOPRODUCT_TGT_ORDERED = "relation.ManufacturerToProduct.target.ordered";
	/** Relation disable markmodifed parameter constants for ManufacturerToProduct from ((training279core))*/
	protected static String MANUFACTURERTOPRODUCT_MARKMODIFIED = "relation.ManufacturerToProduct.markmodified";
	/**
	* {@link OneToManyHandler} for handling 1:n EMAILATTACHMENT's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<EmailAttachment> BUSINESSPROCESS2EMAILATTACHMENTEMAILATTACHMENTHANDLER = new OneToManyHandler<EmailAttachment>(
	AcceleratorServicesConstants.TC.EMAILATTACHMENT,
	false,
	"businessProcess",
	null,
	false,
	true,
	CollectionType.LIST
	);
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
		Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put("customSEOKeyword", AttributeMode.INITIAL);
		tmp.put("canBeSold", AttributeMode.INITIAL);
		tmp.put("isCount", AttributeMode.INITIAL);
		tmp.put("isTest", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.product.Product", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("isNewCustomer", AttributeMode.INITIAL);
		tmp.put("isNew", AttributeMode.INITIAL);
		tmp.put("isNewBusinessUser", AttributeMode.INITIAL);
		tmp.put("delete", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.user.Customer", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("VATNumber", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.user.Address", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("responseCode", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.payment.jalo.PaymentTransactionEntry", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("responseCode", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.payment.jalo.PaymentTransaction", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("businessProcess", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.acceleratorservices.jalo.email.EmailAttachment", Collections.unmodifiableMap(tmp));
		DEFAULT_INITIAL_ATTRIBUTES = ttmp;
	}
	@Override
	public Map<String, AttributeMode> getDefaultAttributeModes(final Class<? extends Item> itemClass)
	{
		Map<String, AttributeMode> ret = new HashMap<>();
		final Map<String, AttributeMode> attr = DEFAULT_INITIAL_ATTRIBUTES.get(itemClass.getName());
		if (attr != null)
		{
			ret.putAll(attr);
		}
		return ret;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EmailAttachment.businessProcess</code> attribute.
	 * @return the businessProcess
	 */
	public BusinessProcess getBusinessProcess(final SessionContext ctx, final EmailAttachment item)
	{
		return (BusinessProcess)item.getProperty( ctx, Training279CoreConstants.Attributes.EmailAttachment.BUSINESSPROCESS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EmailAttachment.businessProcess</code> attribute.
	 * @return the businessProcess
	 */
	public BusinessProcess getBusinessProcess(final EmailAttachment item)
	{
		return getBusinessProcess( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EmailAttachment.businessProcess</code> attribute. 
	 * @param value the businessProcess
	 */
	public void setBusinessProcess(final SessionContext ctx, final EmailAttachment item, final BusinessProcess value)
	{
		item.setProperty(ctx, Training279CoreConstants.Attributes.EmailAttachment.BUSINESSPROCESS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EmailAttachment.businessProcess</code> attribute. 
	 * @param value the businessProcess
	 */
	public void setBusinessProcess(final EmailAttachment item, final BusinessProcess value)
	{
		setBusinessProcess( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.canBeSold</code> attribute.
	 * @return the canBeSold
	 */
	public Boolean isCanBeSold(final SessionContext ctx, final Product item)
	{
		return (Boolean)item.getProperty( ctx, Training279CoreConstants.Attributes.Product.CANBESOLD);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.canBeSold</code> attribute.
	 * @return the canBeSold
	 */
	public Boolean isCanBeSold(final Product item)
	{
		return isCanBeSold( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.canBeSold</code> attribute. 
	 * @return the canBeSold
	 */
	public boolean isCanBeSoldAsPrimitive(final SessionContext ctx, final Product item)
	{
		Boolean value = isCanBeSold( ctx,item );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.canBeSold</code> attribute. 
	 * @return the canBeSold
	 */
	public boolean isCanBeSoldAsPrimitive(final Product item)
	{
		return isCanBeSoldAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.canBeSold</code> attribute. 
	 * @param value the canBeSold
	 */
	public void setCanBeSold(final SessionContext ctx, final Product item, final Boolean value)
	{
		item.setProperty(ctx, Training279CoreConstants.Attributes.Product.CANBESOLD,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.canBeSold</code> attribute. 
	 * @param value the canBeSold
	 */
	public void setCanBeSold(final Product item, final Boolean value)
	{
		setCanBeSold( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.canBeSold</code> attribute. 
	 * @param value the canBeSold
	 */
	public void setCanBeSold(final SessionContext ctx, final Product item, final boolean value)
	{
		setCanBeSold( ctx, item, Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.canBeSold</code> attribute. 
	 * @param value the canBeSold
	 */
	public void setCanBeSold(final Product item, final boolean value)
	{
		setCanBeSold( getSession().getSessionContext(), item, value );
	}
	
	public ApparelProduct createApparelProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Training279CoreConstants.TC.APPARELPRODUCT );
			return (ApparelProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ApparelProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ApparelProduct createApparelProduct(final Map attributeValues)
	{
		return createApparelProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public ApparelSizeVariantProduct createApparelSizeVariantProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Training279CoreConstants.TC.APPARELSIZEVARIANTPRODUCT );
			return (ApparelSizeVariantProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ApparelSizeVariantProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ApparelSizeVariantProduct createApparelSizeVariantProduct(final Map attributeValues)
	{
		return createApparelSizeVariantProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public ApparelStyleVariantProduct createApparelStyleVariantProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Training279CoreConstants.TC.APPARELSTYLEVARIANTPRODUCT );
			return (ApparelStyleVariantProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ApparelStyleVariantProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ApparelStyleVariantProduct createApparelStyleVariantProduct(final Map attributeValues)
	{
		return createApparelStyleVariantProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public CustomerCronJobNew createCustomerCronJobNew(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Training279CoreConstants.TC.CUSTOMERCRONJOBNEW );
			return (CustomerCronJobNew)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating CustomerCronJobNew : "+e.getMessage(), 0 );
		}
	}
	
	public CustomerCronJobNew createCustomerCronJobNew(final Map attributeValues)
	{
		return createCustomerCronJobNew( getSession().getSessionContext(), attributeValues );
	}
	
	public Customers createCustomers(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Training279CoreConstants.TC.CUSTOMERS );
			return (Customers)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating Customers : "+e.getMessage(), 0 );
		}
	}
	
	public Customers createCustomers(final Map attributeValues)
	{
		return createCustomers( getSession().getSessionContext(), attributeValues );
	}
	
	public CustomSearchRestrictions createCustomSearchRestrictions(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Training279CoreConstants.TC.CUSTOMSEARCHRESTRICTIONS );
			return (CustomSearchRestrictions)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating CustomSearchRestrictions : "+e.getMessage(), 0 );
		}
	}
	
	public CustomSearchRestrictions createCustomSearchRestrictions(final Map attributeValues)
	{
		return createCustomSearchRestrictions( getSession().getSessionContext(), attributeValues );
	}
	
	public ElectronicsColorVariantProduct createElectronicsColorVariantProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Training279CoreConstants.TC.ELECTRONICSCOLORVARIANTPRODUCT );
			return (ElectronicsColorVariantProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ElectronicsColorVariantProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ElectronicsColorVariantProduct createElectronicsColorVariantProduct(final Map attributeValues)
	{
		return createElectronicsColorVariantProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public LatestProductComponent createLatestProductComponent(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Training279CoreConstants.TC.LATESTPRODUCTCOMPONENT );
			return (LatestProductComponent)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating LatestProductComponent : "+e.getMessage(), 0 );
		}
	}
	
	public LatestProductComponent createLatestProductComponent(final Map attributeValues)
	{
		return createLatestProductComponent( getSession().getSessionContext(), attributeValues );
	}
	
	public ManufacturerDetails createManufacturerDetails(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Training279CoreConstants.TC.MANUFACTURERDETAILS );
			return (ManufacturerDetails)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ManufacturerDetails : "+e.getMessage(), 0 );
		}
	}
	
	public ManufacturerDetails createManufacturerDetails(final Map attributeValues)
	{
		return createManufacturerDetails( getSession().getSessionContext(), attributeValues );
	}
	
	public ManufacturerDetailsEntry createManufacturerDetailsEntry(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Training279CoreConstants.TC.MANUFACTURERDETAILSENTRY );
			return (ManufacturerDetailsEntry)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ManufacturerDetailsEntry : "+e.getMessage(), 0 );
		}
	}
	
	public ManufacturerDetailsEntry createManufacturerDetailsEntry(final Map attributeValues)
	{
		return createManufacturerDetailsEntry( getSession().getSessionContext(), attributeValues );
	}
	
	public NewCustomerCronJob createNewCustomerCronJob(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Training279CoreConstants.TC.NEWCUSTOMERCRONJOB );
			return (NewCustomerCronJob)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating NewCustomerCronJob : "+e.getMessage(), 0 );
		}
	}
	
	public NewCustomerCronJob createNewCustomerCronJob(final Map attributeValues)
	{
		return createNewCustomerCronJob( getSession().getSessionContext(), attributeValues );
	}
	
	public ProductionCompany createProductionCompany(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Training279CoreConstants.TC.PRODUCTIONCOMPANY );
			return (ProductionCompany)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ProductionCompany : "+e.getMessage(), 0 );
		}
	}
	
	public ProductionCompany createProductionCompany(final Map attributeValues)
	{
		return createProductionCompany( getSession().getSessionContext(), attributeValues );
	}
	
	public Testing createTesting(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Training279CoreConstants.TC.TESTING );
			return (Testing)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating Testing : "+e.getMessage(), 0 );
		}
	}
	
	public Testing createTesting(final Map attributeValues)
	{
		return createTesting( getSession().getSessionContext(), attributeValues );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.customSEOKeyword</code> attribute.
	 * @return the customSEOKeyword
	 */
	public String getCustomSEOKeyword(final SessionContext ctx, final Product item)
	{
		return (String)item.getProperty( ctx, Training279CoreConstants.Attributes.Product.CUSTOMSEOKEYWORD);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.customSEOKeyword</code> attribute.
	 * @return the customSEOKeyword
	 */
	public String getCustomSEOKeyword(final Product item)
	{
		return getCustomSEOKeyword( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.customSEOKeyword</code> attribute. 
	 * @param value the customSEOKeyword
	 */
	public void setCustomSEOKeyword(final SessionContext ctx, final Product item, final String value)
	{
		item.setProperty(ctx, Training279CoreConstants.Attributes.Product.CUSTOMSEOKEYWORD,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.customSEOKeyword</code> attribute. 
	 * @param value the customSEOKeyword
	 */
	public void setCustomSEOKeyword(final Product item, final String value)
	{
		setCustomSEOKeyword( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.delete</code> attribute.
	 * @return the delete
	 */
	public Boolean isDelete(final SessionContext ctx, final Customer item)
	{
		return (Boolean)item.getProperty( ctx, Training279CoreConstants.Attributes.Customer.DELETE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.delete</code> attribute.
	 * @return the delete
	 */
	public Boolean isDelete(final Customer item)
	{
		return isDelete( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.delete</code> attribute. 
	 * @return the delete
	 */
	public boolean isDeleteAsPrimitive(final SessionContext ctx, final Customer item)
	{
		Boolean value = isDelete( ctx,item );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.delete</code> attribute. 
	 * @return the delete
	 */
	public boolean isDeleteAsPrimitive(final Customer item)
	{
		return isDeleteAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.delete</code> attribute. 
	 * @param value the delete
	 */
	public void setDelete(final SessionContext ctx, final Customer item, final Boolean value)
	{
		item.setProperty(ctx, Training279CoreConstants.Attributes.Customer.DELETE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.delete</code> attribute. 
	 * @param value the delete
	 */
	public void setDelete(final Customer item, final Boolean value)
	{
		setDelete( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.delete</code> attribute. 
	 * @param value the delete
	 */
	public void setDelete(final SessionContext ctx, final Customer item, final boolean value)
	{
		setDelete( ctx, item, Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.delete</code> attribute. 
	 * @param value the delete
	 */
	public void setDelete(final Customer item, final boolean value)
	{
		setDelete( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BusinessProcess.emailAttachment</code> attribute.
	 * @return the emailAttachment
	 */
	public List<EmailAttachment> getEmailAttachment(final SessionContext ctx, final BusinessProcess item)
	{
		return (List<EmailAttachment>)BUSINESSPROCESS2EMAILATTACHMENTEMAILATTACHMENTHANDLER.getValues( ctx, item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BusinessProcess.emailAttachment</code> attribute.
	 * @return the emailAttachment
	 */
	public List<EmailAttachment> getEmailAttachment(final BusinessProcess item)
	{
		return getEmailAttachment( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BusinessProcess.emailAttachment</code> attribute. 
	 * @param value the emailAttachment
	 */
	public void setEmailAttachment(final SessionContext ctx, final BusinessProcess item, final List<EmailAttachment> value)
	{
		BUSINESSPROCESS2EMAILATTACHMENTEMAILATTACHMENTHANDLER.setValues( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BusinessProcess.emailAttachment</code> attribute. 
	 * @param value the emailAttachment
	 */
	public void setEmailAttachment(final BusinessProcess item, final List<EmailAttachment> value)
	{
		setEmailAttachment( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to emailAttachment. 
	 * @param value the item to add to emailAttachment
	 */
	public void addToEmailAttachment(final SessionContext ctx, final BusinessProcess item, final EmailAttachment value)
	{
		BUSINESSPROCESS2EMAILATTACHMENTEMAILATTACHMENTHANDLER.addValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to emailAttachment. 
	 * @param value the item to add to emailAttachment
	 */
	public void addToEmailAttachment(final BusinessProcess item, final EmailAttachment value)
	{
		addToEmailAttachment( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from emailAttachment. 
	 * @param value the item to remove from emailAttachment
	 */
	public void removeFromEmailAttachment(final SessionContext ctx, final BusinessProcess item, final EmailAttachment value)
	{
		BUSINESSPROCESS2EMAILATTACHMENTEMAILATTACHMENTHANDLER.removeValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from emailAttachment. 
	 * @param value the item to remove from emailAttachment
	 */
	public void removeFromEmailAttachment(final BusinessProcess item, final EmailAttachment value)
	{
		removeFromEmailAttachment( getSession().getSessionContext(), item, value );
	}
	
	@Override
	public String getName()
	{
		return Training279CoreConstants.EXTENSIONNAME;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.isCount</code> attribute.
	 * @return the isCount
	 */
	public Integer getIsCount(final SessionContext ctx, final Product item)
	{
		return (Integer)item.getProperty( ctx, Training279CoreConstants.Attributes.Product.ISCOUNT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.isCount</code> attribute.
	 * @return the isCount
	 */
	public Integer getIsCount(final Product item)
	{
		return getIsCount( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.isCount</code> attribute. 
	 * @return the isCount
	 */
	public int getIsCountAsPrimitive(final SessionContext ctx, final Product item)
	{
		Integer value = getIsCount( ctx,item );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.isCount</code> attribute. 
	 * @return the isCount
	 */
	public int getIsCountAsPrimitive(final Product item)
	{
		return getIsCountAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.isCount</code> attribute. 
	 * @param value the isCount
	 */
	public void setIsCount(final SessionContext ctx, final Product item, final Integer value)
	{
		item.setProperty(ctx, Training279CoreConstants.Attributes.Product.ISCOUNT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.isCount</code> attribute. 
	 * @param value the isCount
	 */
	public void setIsCount(final Product item, final Integer value)
	{
		setIsCount( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.isCount</code> attribute. 
	 * @param value the isCount
	 */
	public void setIsCount(final SessionContext ctx, final Product item, final int value)
	{
		setIsCount( ctx, item, Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.isCount</code> attribute. 
	 * @param value the isCount
	 */
	public void setIsCount(final Product item, final int value)
	{
		setIsCount( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.isNew</code> attribute.
	 * @return the isNew
	 */
	public Boolean isIsNew(final SessionContext ctx, final Customer item)
	{
		return (Boolean)item.getProperty( ctx, Training279CoreConstants.Attributes.Customer.ISNEW);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.isNew</code> attribute.
	 * @return the isNew
	 */
	public Boolean isIsNew(final Customer item)
	{
		return isIsNew( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.isNew</code> attribute. 
	 * @return the isNew
	 */
	public boolean isIsNewAsPrimitive(final SessionContext ctx, final Customer item)
	{
		Boolean value = isIsNew( ctx,item );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.isNew</code> attribute. 
	 * @return the isNew
	 */
	public boolean isIsNewAsPrimitive(final Customer item)
	{
		return isIsNewAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.isNew</code> attribute. 
	 * @param value the isNew
	 */
	public void setIsNew(final SessionContext ctx, final Customer item, final Boolean value)
	{
		item.setProperty(ctx, Training279CoreConstants.Attributes.Customer.ISNEW,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.isNew</code> attribute. 
	 * @param value the isNew
	 */
	public void setIsNew(final Customer item, final Boolean value)
	{
		setIsNew( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.isNew</code> attribute. 
	 * @param value the isNew
	 */
	public void setIsNew(final SessionContext ctx, final Customer item, final boolean value)
	{
		setIsNew( ctx, item, Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.isNew</code> attribute. 
	 * @param value the isNew
	 */
	public void setIsNew(final Customer item, final boolean value)
	{
		setIsNew( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.isNewBusinessUser</code> attribute.
	 * @return the isNewBusinessUser
	 */
	public Boolean isIsNewBusinessUser(final SessionContext ctx, final Customer item)
	{
		return (Boolean)item.getProperty( ctx, Training279CoreConstants.Attributes.Customer.ISNEWBUSINESSUSER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.isNewBusinessUser</code> attribute.
	 * @return the isNewBusinessUser
	 */
	public Boolean isIsNewBusinessUser(final Customer item)
	{
		return isIsNewBusinessUser( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.isNewBusinessUser</code> attribute. 
	 * @return the isNewBusinessUser
	 */
	public boolean isIsNewBusinessUserAsPrimitive(final SessionContext ctx, final Customer item)
	{
		Boolean value = isIsNewBusinessUser( ctx,item );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.isNewBusinessUser</code> attribute. 
	 * @return the isNewBusinessUser
	 */
	public boolean isIsNewBusinessUserAsPrimitive(final Customer item)
	{
		return isIsNewBusinessUserAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.isNewBusinessUser</code> attribute. 
	 * @param value the isNewBusinessUser
	 */
	public void setIsNewBusinessUser(final SessionContext ctx, final Customer item, final Boolean value)
	{
		item.setProperty(ctx, Training279CoreConstants.Attributes.Customer.ISNEWBUSINESSUSER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.isNewBusinessUser</code> attribute. 
	 * @param value the isNewBusinessUser
	 */
	public void setIsNewBusinessUser(final Customer item, final Boolean value)
	{
		setIsNewBusinessUser( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.isNewBusinessUser</code> attribute. 
	 * @param value the isNewBusinessUser
	 */
	public void setIsNewBusinessUser(final SessionContext ctx, final Customer item, final boolean value)
	{
		setIsNewBusinessUser( ctx, item, Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.isNewBusinessUser</code> attribute. 
	 * @param value the isNewBusinessUser
	 */
	public void setIsNewBusinessUser(final Customer item, final boolean value)
	{
		setIsNewBusinessUser( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.isNewCustomer</code> attribute.
	 * @return the isNewCustomer
	 */
	public Boolean isIsNewCustomer(final SessionContext ctx, final Customer item)
	{
		return (Boolean)item.getProperty( ctx, Training279CoreConstants.Attributes.Customer.ISNEWCUSTOMER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.isNewCustomer</code> attribute.
	 * @return the isNewCustomer
	 */
	public Boolean isIsNewCustomer(final Customer item)
	{
		return isIsNewCustomer( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.isNewCustomer</code> attribute. 
	 * @return the isNewCustomer
	 */
	public boolean isIsNewCustomerAsPrimitive(final SessionContext ctx, final Customer item)
	{
		Boolean value = isIsNewCustomer( ctx,item );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.isNewCustomer</code> attribute. 
	 * @return the isNewCustomer
	 */
	public boolean isIsNewCustomerAsPrimitive(final Customer item)
	{
		return isIsNewCustomerAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.isNewCustomer</code> attribute. 
	 * @param value the isNewCustomer
	 */
	public void setIsNewCustomer(final SessionContext ctx, final Customer item, final Boolean value)
	{
		item.setProperty(ctx, Training279CoreConstants.Attributes.Customer.ISNEWCUSTOMER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.isNewCustomer</code> attribute. 
	 * @param value the isNewCustomer
	 */
	public void setIsNewCustomer(final Customer item, final Boolean value)
	{
		setIsNewCustomer( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.isNewCustomer</code> attribute. 
	 * @param value the isNewCustomer
	 */
	public void setIsNewCustomer(final SessionContext ctx, final Customer item, final boolean value)
	{
		setIsNewCustomer( ctx, item, Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.isNewCustomer</code> attribute. 
	 * @param value the isNewCustomer
	 */
	public void setIsNewCustomer(final Customer item, final boolean value)
	{
		setIsNewCustomer( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.isTest</code> attribute.
	 * @return the isTest
	 */
	public String getIsTest(final SessionContext ctx, final Product item)
	{
		return (String)item.getProperty( ctx, Training279CoreConstants.Attributes.Product.ISTEST);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.isTest</code> attribute.
	 * @return the isTest
	 */
	public String getIsTest(final Product item)
	{
		return getIsTest( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.isTest</code> attribute. 
	 * @param value the isTest
	 */
	public void setIsTest(final SessionContext ctx, final Product item, final String value)
	{
		item.setProperty(ctx, Training279CoreConstants.Attributes.Product.ISTEST,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.isTest</code> attribute. 
	 * @param value the isTest
	 */
	public void setIsTest(final Product item, final String value)
	{
		setIsTest( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.manufacturerDetails</code> attribute.
	 * @return the manufacturerDetails
	 */
	public Collection<ManufacturerDetails> getManufacturerDetails(final SessionContext ctx, final Product item)
	{
		final List<ManufacturerDetails> items = item.getLinkedItems( 
			ctx,
			false,
			Training279CoreConstants.Relations.MANUFACTURERTOPRODUCT,
			"ManufacturerDetails",
			null,
			false,
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.manufacturerDetails</code> attribute.
	 * @return the manufacturerDetails
	 */
	public Collection<ManufacturerDetails> getManufacturerDetails(final Product item)
	{
		return getManufacturerDetails( getSession().getSessionContext(), item );
	}
	
	public long getManufacturerDetailsCount(final SessionContext ctx, final Product item)
	{
		return item.getLinkedItemsCount(
			ctx,
			false,
			Training279CoreConstants.Relations.MANUFACTURERTOPRODUCT,
			"ManufacturerDetails",
			null
		);
	}
	
	public long getManufacturerDetailsCount(final Product item)
	{
		return getManufacturerDetailsCount( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.manufacturerDetails</code> attribute. 
	 * @param value the manufacturerDetails
	 */
	public void setManufacturerDetails(final SessionContext ctx, final Product item, final Collection<ManufacturerDetails> value)
	{
		item.setLinkedItems( 
			ctx,
			false,
			Training279CoreConstants.Relations.MANUFACTURERTOPRODUCT,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(MANUFACTURERTOPRODUCT_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.manufacturerDetails</code> attribute. 
	 * @param value the manufacturerDetails
	 */
	public void setManufacturerDetails(final Product item, final Collection<ManufacturerDetails> value)
	{
		setManufacturerDetails( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to manufacturerDetails. 
	 * @param value the item to add to manufacturerDetails
	 */
	public void addToManufacturerDetails(final SessionContext ctx, final Product item, final ManufacturerDetails value)
	{
		item.addLinkedItems( 
			ctx,
			false,
			Training279CoreConstants.Relations.MANUFACTURERTOPRODUCT,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(MANUFACTURERTOPRODUCT_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to manufacturerDetails. 
	 * @param value the item to add to manufacturerDetails
	 */
	public void addToManufacturerDetails(final Product item, final ManufacturerDetails value)
	{
		addToManufacturerDetails( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from manufacturerDetails. 
	 * @param value the item to remove from manufacturerDetails
	 */
	public void removeFromManufacturerDetails(final SessionContext ctx, final Product item, final ManufacturerDetails value)
	{
		item.removeLinkedItems( 
			ctx,
			false,
			Training279CoreConstants.Relations.MANUFACTURERTOPRODUCT,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(MANUFACTURERTOPRODUCT_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from manufacturerDetails. 
	 * @param value the item to remove from manufacturerDetails
	 */
	public void removeFromManufacturerDetails(final Product item, final ManufacturerDetails value)
	{
		removeFromManufacturerDetails( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentTransactionEntry.responseCode</code> attribute.
	 * @return the responseCode
	 */
	public String getResponseCode(final SessionContext ctx, final PaymentTransactionEntry item)
	{
		return (String)item.getProperty( ctx, Training279CoreConstants.Attributes.PaymentTransactionEntry.RESPONSECODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentTransactionEntry.responseCode</code> attribute.
	 * @return the responseCode
	 */
	public String getResponseCode(final PaymentTransactionEntry item)
	{
		return getResponseCode( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentTransactionEntry.responseCode</code> attribute. 
	 * @param value the responseCode
	 */
	public void setResponseCode(final SessionContext ctx, final PaymentTransactionEntry item, final String value)
	{
		item.setProperty(ctx, Training279CoreConstants.Attributes.PaymentTransactionEntry.RESPONSECODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentTransactionEntry.responseCode</code> attribute. 
	 * @param value the responseCode
	 */
	public void setResponseCode(final PaymentTransactionEntry item, final String value)
	{
		setResponseCode( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentTransaction.responseCode</code> attribute.
	 * @return the responseCode
	 */
	public String getResponseCode(final SessionContext ctx, final PaymentTransaction item)
	{
		return (String)item.getProperty( ctx, Training279CoreConstants.Attributes.PaymentTransaction.RESPONSECODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentTransaction.responseCode</code> attribute.
	 * @return the responseCode
	 */
	public String getResponseCode(final PaymentTransaction item)
	{
		return getResponseCode( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentTransaction.responseCode</code> attribute. 
	 * @param value the responseCode
	 */
	public void setResponseCode(final SessionContext ctx, final PaymentTransaction item, final String value)
	{
		item.setProperty(ctx, Training279CoreConstants.Attributes.PaymentTransaction.RESPONSECODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentTransaction.responseCode</code> attribute. 
	 * @param value the responseCode
	 */
	public void setResponseCode(final PaymentTransaction item, final String value)
	{
		setResponseCode( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Address.VATNumber</code> attribute.
	 * @return the VATNumber
	 */
	public String getVATNumber(final SessionContext ctx, final Address item)
	{
		return (String)item.getProperty( ctx, Training279CoreConstants.Attributes.Address.VATNUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Address.VATNumber</code> attribute.
	 * @return the VATNumber
	 */
	public String getVATNumber(final Address item)
	{
		return getVATNumber( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Address.VATNumber</code> attribute. 
	 * @param value the VATNumber
	 */
	public void setVATNumber(final SessionContext ctx, final Address item, final String value)
	{
		item.setProperty(ctx, Training279CoreConstants.Attributes.Address.VATNUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Address.VATNumber</code> attribute. 
	 * @param value the VATNumber
	 */
	public void setVATNumber(final Address item, final String value)
	{
		setVATNumber( getSession().getSessionContext(), item, value );
	}
	
}
