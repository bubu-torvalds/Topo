package com.mb.topo.mappers;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.mb.topo.dto.RouteDto;
import com.mb.topo.entity.Route;
import com.mb.topo.vo.RouteVo;

@Mapper
public interface RouteMapper {

	RouteDto routeToRouteDto(Route route);
	
	List<RouteDto> routeListToRouteListDto(List<Route> routes);
	
	@Mapping(target = "id", ignore = true)
	Route routeVoToRoute(RouteVo routeVo);

	List<Route> routeVoListToRouteList(List<RouteVo> routesVo);
	
}
