package com.mb.topo.mappers;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.mb.topo.dto.SiteDto;
import com.mb.topo.entity.Site;
import com.mb.topo.vo.SiteVo;

@Mapper(componentModel = "spring")
public interface SiteMapper {

	SiteDto siteToSiteDto(Site site);

	List<SiteDto> siteListToSiteDtoList(List<Site> sites);
	
	@Mapping(target = "id", ignore = true)
	Site siteVoToSite(SiteVo siteVo);

}
