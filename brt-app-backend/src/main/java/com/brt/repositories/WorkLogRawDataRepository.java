package com.brt.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brt.model.WorkLogRawData;

public interface WorkLogRawDataRepository extends JpaRepository<WorkLogRawData, Long>{

}
