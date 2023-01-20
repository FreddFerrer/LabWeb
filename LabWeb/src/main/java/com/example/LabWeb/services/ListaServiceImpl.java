package com.example.LabWeb.services;

import com.example.LabWeb.models.AnalisisModel;
import com.example.LabWeb.repository.ListaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ListaServiceImpl implements ListaService{

    @Autowired
    ListaRepository listaRepository;

    private List<String> listaAnalisis = new ArrayList<>();

    @Override
    public ArrayList<AnalisisModel> getAllAnalisis() {
        return (ArrayList<AnalisisModel>) listaRepository.findAll();
    }

    @Override
    public Optional<AnalisisModel> getAnalisisById(Long id) {
        return listaRepository.findById(id);
    }

    @Override
    public List<String> getListaAnalisis() {
        return listaAnalisis;
    }

    @Override
    public void agregarAnalisis(String string) {
        listaAnalisis.add(string);
    }


}
