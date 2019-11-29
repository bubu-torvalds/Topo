package com.mb.topo.ressource;

import java.net.URI;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.mb.topo.dto.ClimberDto;
import com.mb.topo.service.ClimberService;
import com.mb.topo.vo.ClimberVo;

@Component
@Path("/climbers")
public class ClimberRessource {
	
	@Autowired
	private ClimberService climberService;
	
	@POST
    @Produces("application/json")
    @Consumes("application/json")
	public Response createClimber(@RequestBody ClimberVo climberVo) {
		
		ClimberDto result =  climberService.createClimber(climberVo);
		return Response.created(URI.create("/" + result.getId())).build();
	}

	@GET
	@Produces("application/json")
	public Response findAllClimber() {
		
		List<ClimberDto> results = this.climberService.findAllClimber();
		return Response.ok(results).build();
		
	}

	@GET
	@Produces("application/json")
	@Path("/{id}")
	public Response findClimberById(@PathVariable long id) {
		
		ClimberDto result = climberService.findClimberById(id);
		
		if (result == null) {
			return Response.noContent().build();
		} 
		
		result = climberService.findClimberById(id);
		
		return Response.ok(result).build();
	}

}
