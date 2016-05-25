package br.com.ghlabs.recursos;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import org.springframework.web.bind.annotation.PathVariable;

import br.com.ghlabs.model.Cliente;

@Path("/api/v1/clientes")
public class ClienteRecurso {

	static List<Cliente> clientes = new ArrayList<>();
	
	static{

		Cliente c1 = new Cliente();;
		c1.setNome("Joao");
		c1.setIdade(20);
		
		Cliente c2 = new Cliente();;
		c2.setNome("Maria");
		c2.setIdade(25);
		
		List<Cliente> clientes = new ArrayList<>();
		clientes.add(c1);
		clientes.add(c2);
		
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Cliente> todos()
	{
		return clientes;	
	}
	
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Cliente obterPorId( @PathParam("id") 
							   int id ) {

		Cliente c1 = new Cliente();
		c1.setNome("Jose");
		c1.setIdade(40 + id);
		return c1;
		
	} 
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response criar(Cliente cliente){
		clientes.add(cliente);
		
		URI uri = UriBuilder.fromPath("/api/v1/clientes/{id}")
							.build("1");
		
		return Response.created(uri)
					  .entity(cliente)
					  .build();
	}
	
	
	
	
}
