package edu.upc.eetac.dsa.sgalceran.beeter_project.api;

import org.glassfish.jersey.linking.DeclarativeLinkingFeature;
import org.glassfish.jersey.server.ResourceConfig;

public class BeeterApplication  extends ResourceConfig {

	public BeeterApplication() {
		super();
		register(DeclarativeLinkingFeature.class);
	}
}