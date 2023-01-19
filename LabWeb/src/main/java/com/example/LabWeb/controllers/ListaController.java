package com.example.LabWeb.controllers;

import com.example.LabWeb.models.AnalisisModel;
import com.example.LabWeb.repository.ListaRepository;
import com.example.LabWeb.services.ListaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


import java.util.*;

@Controller
@RequestMapping("/")

public class ListaController {

    @Autowired
    ListaService listaService;

    @Autowired
    ListaRepository listaRepository;

    ModelAndView modelAndView = new ModelAndView("index");

    @GetMapping("/analisis")
    public ModelAndView index() {
        List<AnalisisModel> listaAnalisis = listaService.getAllAnalisis();
        modelAndView.addObject("analisisLista", listaAnalisis);
        return modelAndView;
    }

    @GetMapping("/{id}")
    public ModelAndView obtenerById(@PathVariable("id") Long id) {
        AnalisisModel analisisSeleccionado = listaRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("nope"));
        double precioUnitario = analisisSeleccionado.getPrecio();
        modelAndView.addObject("mostrarAnalisis", analisisSeleccionado);
        System.out.println("funciona");

        return modelAndView;
    }
















}
