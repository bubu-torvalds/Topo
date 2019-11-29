package com.mb.topo.service;

import java.util.List;

import org.hibernate.exception.ConstraintViolationException;

import com.mb.topo.dto.ClimberDto;
import com.mb.topo.vo.ClimberVo;

public interface ClimberService {
	
	public ClimberDto createClimber(ClimberVo climberVo) throws ConstraintViolationException;
	
	public List<ClimberDto> findAllClimber();

	public ClimberDto findClimberById(long id);

}
