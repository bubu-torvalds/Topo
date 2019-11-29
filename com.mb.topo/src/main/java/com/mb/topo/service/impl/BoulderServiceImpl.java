package com.mb.topo.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mb.topo.dto.BoulderDto;
import com.mb.topo.entity.Boulder;
import com.mb.topo.mappers.BoulderMapper;
import com.mb.topo.repositories.BoulderRepository;
import com.mb.topo.service.BoulderService;
import com.mb.topo.vo.BoulderVo;

@Service
@Transactional
public class BoulderServiceImpl implements BoulderService {

	@Autowired
	private BoulderRepository boulderRepository;
	
	@Autowired
	private BoulderMapper boulderMapper;
	
	@Override
	public BoulderDto createBoulder(BoulderVo boulderVo) {
		Boulder boulder = boulderMapper.boulderVoToBoulder(boulderVo);
		return boulderMapper.boulderToBoulderDto(boulderRepository.save(boulder));
	}

	@Override
	public List<BoulderDto> findAllBoulder() {
		List<Boulder> boulders = boulderRepository.findAll();
		return boulderMapper.boulderListToBoulderDtoList(boulders);
	}

	@Override
	public BoulderDto findBoulderById(long id) {
		Boulder boulder = boulderRepository.findOneById(id);
		return boulderMapper.boulderToBoulderDto(boulder);
	}

}
