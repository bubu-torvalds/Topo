package com.mb.topo.service;

import java.util.List;

import com.mb.topo.dto.BoulderDto;
import com.mb.topo.vo.BoulderVo;

public interface BoulderService {

	public BoulderDto createBoulder(BoulderVo boulderVo);
	
	public List<BoulderDto> findAllBoulder();
	
	public BoulderDto findBoulderById(long id);
}
