package com.mb.topo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.mb.topo.entity.Climber;

@Repository
public interface ClimberRepository extends JpaRepository<Climber, Long> {

	public List<Climber> findAll();

	public Climber findOneById(@Param("id") long id);
	
	public Climber findOneByUserName(@Param("userName") String userName);
	
}
