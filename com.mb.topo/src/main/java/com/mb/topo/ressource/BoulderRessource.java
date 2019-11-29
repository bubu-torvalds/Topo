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
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mb.topo.dto.BoulderDto;
import com.mb.topo.service.BoulderService;
import com.mb.topo.vo.BoulderVo;

@Component
@Path("/boulders")
public class BoulderRessource {

	@Autowired
	private BoulderService boulderService;
	
	@POST
    @Produces("application/json")
    @Consumes("application/json")
	@Path("/boulders")
	public Response createBoulder(@RequestBody BoulderVo boulderVo) {
		
		BoulderDto result = boulderService.createBoulder(boulderVo);		
		return Response.created(URI.create("/" + result.getId())).build();
	}
	
	@GET
	@Produces("application/json")
	@Path("/boulders")
	public Response findAllBoulder() {
		
		List<BoulderDto> results = this.boulderService.findAllBoulder();
		return Response.ok(results).build();
		
	}
	
	@GET
	@Produces("application/json")
	@Path("/boulders/{id}")
	public Response findBoulderById(@PathVariable long id) {
		
		BoulderDto result = null;
		
		if (boulderService.findBoulderById(id) == null) {
			return Response.noContent().build();
		} 
		
		result = boulderService.findBoulderById(id);
		
		return Response.ok(result).build();
	}
}
