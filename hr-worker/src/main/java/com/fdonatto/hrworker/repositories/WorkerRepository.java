package com.fdonatto.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fdonatto.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>{

}
