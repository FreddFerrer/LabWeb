package com.example.LabWeb.controllers;

import com.example.LabWeb.models.AnalisisModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.LabWeb.repository.ListaRepository;

import java.util.ArrayList;

@RestController
@RequestMapping("/api")
public class ListaController {

    @Autowired
    ListaRepository listaRepository;

    @GetMapping
    public ArrayList<AnalisisModel> obtenerAnalisis() {
        return (ArrayList<AnalisisModel>) listaRepository.findAll();
    }

}
