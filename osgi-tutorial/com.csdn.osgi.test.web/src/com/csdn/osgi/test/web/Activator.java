package com.csdn.osgi.test.web;

import java.util.Dictionary;
import java.util.Hashtable;

import javax.servlet.Servlet;

import org.eclipse.equinox.jsp.jasper.JspServlet;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import org.osgi.service.http.HttpService;

import com.csdn.osgi.web.servlet.TestServlet;

public class Activator implements BundleActivator {

	
	public void start(BundleContext bundleContext) throws Exception {
		
		ServiceReference serviceReference = bundleContext.getServiceReference(HttpService.class.getName());
		HttpService service = (HttpService) bundleContext.getService(serviceReference);
		
		// 注册Servlet
		Servlet testServlet = new TestServlet();
		Dictionary<String, String> initparams = new Hashtable<String, String>();
	    initparams.put("load-on-startup", "1");
	    initparams.put("servlet-name", "testServlet");
	    
		service.registerServlet("/testServlet.do", testServlet, initparams, null);
		
		Dictionary jspParams = new Hashtable<String, String>();
		JspServlet jspServlet = new JspServlet(bundleContext.getBundle(), "/WebContent/jsp", "/jsp");
		service.registerServlet("/jsp", jspServlet, jspParams, null);
		
		service.registerResources("/img", "/WebContent/img", null);
	}
	
	
	public void stop(BundleContext bundleContext) throws Exception {
		System.out.println("Goodbye World!!");
	}

}
