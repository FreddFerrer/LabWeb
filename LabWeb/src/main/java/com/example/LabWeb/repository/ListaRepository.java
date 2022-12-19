package com.example.LabWeb.repository;

import com.example.LabWeb.models.AnalisisModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ListaRepository extends JpaRepository<AnalisisModel, Long> {

}
