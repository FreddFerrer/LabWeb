package com.example.LabWeb.controllers;

import com.example.LabWeb.models.AnalisisModel;
import com.example.LabWeb.services.ListaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.ArrayList;

@RestController
@RequestMapping("/api")
public class ListaController {

    @Autowired
    ListaService listaService;

    @GetMapping
    public ArrayList<AnalisisModel> obtenerAnalisis() {
        return listaService.obtenerAnalisis();
    }

}
