package com.example.LabWeb.controllers;

import com.example.LabWeb.models.AnalisisModel;
import com.example.LabWeb.services.ListaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/api")
public class ListaController {

    @Autowired
    ListaService listaService;

    @GetMapping("/analisis")
    public List<AnalisisModel> getAnalisis() {
        return listaService.getAllAnalisis();
    }























}
