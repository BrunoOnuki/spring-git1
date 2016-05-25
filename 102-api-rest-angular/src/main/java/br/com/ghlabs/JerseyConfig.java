package br.com.ghlabs;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

import br.com.ghlabs.recursos.ClienteRecurso;

@Configuration
public class JerseyConfig 
	extends ResourceConfig {

	
	public JerseyConfig()
	{
		register(ClienteRecurso.class);
	}
	
}
