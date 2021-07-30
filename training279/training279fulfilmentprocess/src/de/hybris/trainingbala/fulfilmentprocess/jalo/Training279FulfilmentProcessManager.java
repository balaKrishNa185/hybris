/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.trainingbala.fulfilmentprocess.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import de.hybris.trainingbala.fulfilmentprocess.constants.Training279FulfilmentProcessConstants;

public class Training279FulfilmentProcessManager extends GeneratedTraining279FulfilmentProcessManager
{
	public static final Training279FulfilmentProcessManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (Training279FulfilmentProcessManager) em.getExtension(Training279FulfilmentProcessConstants.EXTENSIONNAME);
	}
	
}
