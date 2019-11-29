package com.mb.topo.mappers;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.mb.topo.dto.ClimberDto;
import com.mb.topo.entity.Climber;
import com.mb.topo.vo.ClimberVo;

@Mapper(componentModel = "spring")
public interface ClimberMapper {
	
	@Mappings({
		@Mapping(source = "bouldersDone", target = "boulderDone"),
		@Mapping(source = "routesDone", target = "routeDone")
	})
	ClimberDto climberToClimberDto(Climber climber);
	
	List<ClimberDto> climberListToClimberDtoList(List<Climber> climbers);
	
	@Mappings({
		@Mapping(target = "password", ignore = true), 
		@Mapping(target = "bouldersDone", ignore = true),
		@Mapping(target = "id", ignore = true),
		@Mapping(target = "routesDone", ignore = true)
	})
	Climber climberVoToClimber(ClimberVo climberVo);

}
