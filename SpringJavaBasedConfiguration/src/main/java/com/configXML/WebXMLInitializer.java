package com.configXML;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebXMLInitializer extends AbstractAnnotationConfigDispatcherServletInitializer
{

	@Override
	protected Class<?>[] getRootConfigClasses() 
	{
		return new Class [] {MyDispatcherServletConfiguration.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() 
	{
		/*return new Class [] {MyDispatcherServletConfiguration.class};*/
		return null;
	}

	@Override
	protected String[] getServletMappings()
	{
		return new String [] {"/"};
	}

}
