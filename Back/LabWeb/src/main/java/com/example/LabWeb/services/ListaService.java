package com.example.LabWeb.services;

import com.example.LabWeb.models.AnalisisModel;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public interface ListaService {

    List<AnalisisModel> getAllAnalisis();

}
