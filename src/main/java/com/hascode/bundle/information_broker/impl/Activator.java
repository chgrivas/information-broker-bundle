package com.hascode.bundle.information_broker.impl;

import java.util.Properties;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

import com.hascode.bundle.information_broker.api.InformationBroker;

public class Activator implements BundleActivator{

	private ServiceRegistration registration;
	
	public void start(BundleContext ctx) throws Exception {
		registration = ctx.registerService(
				InformationBroker.class.getName(),
				new InformationBrokerImpl(),
				new Properties());
		System.out.println("InformationBroker service registered...");
	}

	public void stop(BundleContext ctx) throws Exception {
		registration.unregister();
		System.out.println("InformationBroker service unregistered...");
	}
}
