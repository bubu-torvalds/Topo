package com.mb.topo.mappers;

import java.util.List;

import org.mapstruct.Mapper;

import com.mb.topo.dto.BoulderDto;
import com.mb.topo.entity.Boulder;
import com.mb.topo.vo.BoulderVo;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface BoulderMapper {

	BoulderDto boulderToBoulderDto(Boulder boulder);

	List<BoulderDto> boulderListToBoulderDtoList(List<Boulder> boulders);

	@Mapping(target = "id", ignore = true)
	Boulder boulderVoToBoulder(BoulderVo boulderVo);

	List<Boulder> boulderVoListToBoulderList(List<BoulderVo> bouldersVo);

}
