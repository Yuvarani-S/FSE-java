package com.cognizant.taskmanager.repository;

import org.springframework.data.repository.CrudRepository;

import com.cognizant.taskmanager.dao.ParentTask;

public interface ParentTaskRepository extends CrudRepository<ParentTask, Integer> {

}
