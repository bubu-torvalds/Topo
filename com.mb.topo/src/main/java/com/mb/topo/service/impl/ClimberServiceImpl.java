package com.mb.topo.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.exception.ConstraintViolationException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mb.topo.dto.ClimberDto;
import com.mb.topo.entity.Climber;
import com.mb.topo.mappers.ClimberMapper;
import com.mb.topo.repositories.ClimberRepository;
import com.mb.topo.service.ClimberService;
import com.mb.topo.vo.ClimberVo;

@Service
@Transactional
public class ClimberServiceImpl implements ClimberService {
	
	private static final Logger logger = LoggerFactory.getLogger(ClimberServiceImpl.class);
	
	@Autowired
	private ClimberRepository climberRepository;
	
	@Autowired
	private ClimberMapper climberMapper;
	
	@Override
	public ClimberDto createClimber(ClimberVo climberVo) throws ConstraintViolationException {
		Climber climber = climberMapper.climberVoToClimber(climberVo);		
		return climberMapper.climberToClimberDto(climberRepository.save(climber));
	}

	@Override
	public List<ClimberDto> findAllClimber() {
		List<Climber> climbers = climberRepository.findAll();		
		return climberMapper.climberListToClimberDtoList(climbers);		
	}

	@Override
	public ClimberDto findClimberById(long id) {		
		Climber climber = climberRepository.findOneById(id);		
		return climberMapper.climberToClimberDto(climber);
	}

}
