package com.example.LabWeb.services;

import com.example.LabWeb.models.AnalisisModel;
import com.example.LabWeb.repository.ListaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ListaService {

    @Autowired
    ListaRepository listaRepo;

    public ArrayList<AnalisisModel> obtenerAnalisis(){
        return (ArrayList<AnalisisModel>) listaRepo.findAll();
    }
}
