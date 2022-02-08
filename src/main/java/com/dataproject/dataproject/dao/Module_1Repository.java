package com.dataproject.dataproject.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.dataproject.dataproject.model.Module_1;
import com.dataproject.dataproject.model.MyData;

public interface Module_1Repository extends MongoRepository<Module_1, Long> {
	
	public MyData findByModulesn(double modulesn);

}
