package com.example.LabWeb.services;

import com.example.LabWeb.models.AnalisisModel;
import com.example.LabWeb.repository.ListaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class ListaServiceImpl implements ListaService{

    @Autowired
    ListaRepository listaRepository;

    @Override
    public ArrayList<AnalisisModel> getAllAnalisis() {
        return (ArrayList<AnalisisModel>) listaRepository.findAll();
    }

    @Override
    public Optional<AnalisisModel> getAnalisisById(Long id) {
        return listaRepository.findById(id);
    }
}
