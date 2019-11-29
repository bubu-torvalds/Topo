package com.mb.topo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.mb.topo.entity.Boulder;

@Repository
public interface BoulderRepository extends JpaRepository<Boulder, Long>{
	
	public List<Boulder> findAll();
	
	public Boulder findOneById(@Param("id") long id);
	
}
