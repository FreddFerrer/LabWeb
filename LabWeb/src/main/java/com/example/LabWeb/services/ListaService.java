package com.example.LabWeb.services;

import com.example.LabWeb.models.AnalisisModel;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public interface ListaService {

    ArrayList<AnalisisModel> getAllAnalisis();

    Optional<AnalisisModel> getAnalisisById(Long id);



}
