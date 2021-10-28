package com.fabnicolato.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fabnicolato.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>{

}
