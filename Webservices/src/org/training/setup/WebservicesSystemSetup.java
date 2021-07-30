/*
 * Copyright (c) 2020 SAP SE or an SAP affiliate company. All rights reserved.
 */
package org.training.setup;

import static org.training.constants.WebservicesConstants.PLATFORM_LOGO_CODE;

import de.hybris.platform.core.initialization.SystemSetup;

import java.io.InputStream;

import org.training.constants.WebservicesConstants;
import org.training.service.WebservicesService;


@SystemSetup(extension = WebservicesConstants.EXTENSIONNAME)
public class WebservicesSystemSetup
{
	private final WebservicesService WebservicesService;

	public WebservicesSystemSetup(final WebservicesService WebservicesService)
	{
		this.WebservicesService = WebservicesService;
	}

	@SystemSetup(process = SystemSetup.Process.INIT, type = SystemSetup.Type.ESSENTIAL)
	public void createEssentialData()
	{
		WebservicesService.createLogo(PLATFORM_LOGO_CODE);
	}

	private InputStream getImageStream()
	{
		return WebservicesSystemSetup.class.getResourceAsStream("/Webservices/sap-hybris-platform.png");
	}
}
