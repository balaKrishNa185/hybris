/*
 *  
 * Copyright (c) 2021 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.trainingbala.core.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import de.hybris.trainingbala.core.constants.Training279CoreConstants;
import org.apache.log4j.Logger;

public class Training279CoreManager extends GeneratedTraining279CoreManager
{
	@SuppressWarnings("unused")
	private static final Logger log = Logger.getLogger( Training279CoreManager.class.getName() );
	
	public static final Training279CoreManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (Training279CoreManager) em.getExtension(Training279CoreConstants.EXTENSIONNAME);
	}
	
}
