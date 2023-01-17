package com.example.LabWeb.controllers;

import com.example.LabWeb.models.AnalisisModel;
import com.example.LabWeb.services.ListaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/")
public class ListaController {

    @Autowired
    ListaService listaService;

    @GetMapping("/analisis")
    public ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("analisisLista", listaService.getAllAnalisis());
        return modelAndView;
    }

    @GetMapping("/analisis/{id}")
    public Optional<AnalisisModel> obtenerById(@PathVariable("id") Long id) {
        return listaService.getAnalisisById(id);
    }

}
