package com.example.LabWeb.repository;

import com.example.LabWeb.models.AnalisisModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAnalisisDAO extends CrudRepository<AnalisisModel, Long> {
}
