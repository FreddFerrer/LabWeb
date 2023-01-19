package com.example.LabWeb.controllers;

import com.example.LabWeb.models.AnalisisModel;
import com.example.LabWeb.repository.ListaRepository;
import com.example.LabWeb.services.ListaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
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

    @Autowired
    ListaRepository listaRepository;

    @GetMapping("/analisis")
    public ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("analisisLista", listaService.getAllAnalisis());
        return modelAndView;
    }

    @GetMapping("/{id}")
    public ModelAndView obtenerById(@PathVariable("id") Long id) {
        ModelAndView modelAndView = new ModelAndView("index");
        AnalisisModel analisisSeleccionado = listaRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("nope"));
        double precioUnitario = analisisSeleccionado.getPrecio();
        modelAndView.addObject("mostrarAnalisis", analisisSeleccionado);
        System.out.println("funciona");

        return modelAndView;
    }

}
