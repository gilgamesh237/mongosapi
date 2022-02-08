package com.dataproject.dataproject.controller;
import java.util.List;

import com.dataproject.dataproject.dao.DataRepository;
import com.dataproject.dataproject.dao.Module_1Repository;
import com.dataproject.dataproject.model.Data;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@CrossOrigin("*")
@RestController	
@RequestMapping("/api") 
public class DataController {
    private Logger logger = LoggerFactory.getLogger(DataController.class);
    
@Autowired
private DataRepository dataRepository;

@Autowired
private Module_1Repository m;


//
@GetMapping(value = "/")
public List<Data> getAlldatas(){
   logger.info("Getting all datas.");
   System.out.println(dataRepository.findAll());
   return dataRepository.findAll();
}

/*@GetMapping(value = "/{modulesn}")
public Double getDataById(@PathVariable double modulesn){
   logger.info("Getting data with Serial N: {}", modulesn);
   return  m.findBymodulesn(modulesn);
}*/

//
@PostMapping(value = "/create")
public Data addData(@RequestBody Data data) {
   logger.info("Saving data.");
   return dataRepository.save(data);
}

//
@PutMapping(value = "/update/{dataId}")
public Data updateData(@PathVariable String dataId, @RequestBody Data data) {
   logger.info("Updating data with ID: {}", dataId);
   return  dataRepository.save(data);
}

//
@DeleteMapping(value = "/delete/{dataId}")
public void deleteData(@PathVariable Long dataId) {
   logger.info("Deleting data with ID: {}", dataId);
   dataRepository.deleteById(dataId);
}





}
