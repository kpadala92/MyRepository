package com.brt.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.brt.model.WorkLogRawData;
import com.brt.repositories.WorkLogRawDataRepository;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/")//brt-app
public class WorkLogRawDataController {
	@Autowired
	private WorkLogRawDataRepository workLogRawDataRepository;
@RequestMapping("/getWorkLogData")
 public ResponseEntity<WorkLogRawData> getWorkLogData(){
	List<WorkLogRawData> workLogData=null;
	try {
		Thread.sleep(1000);
		 workLogData = workLogRawDataRepository.findAll();
		//workLogData=new ArrayList<>();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 //System.out.println(workLogData);
	 
	 return new ResponseEntity(workLogData,HttpStatus.OK);
 }
}
