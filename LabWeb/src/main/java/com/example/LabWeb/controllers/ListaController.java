package com.example.LabWeb.controllers;

import com.example.LabWeb.models.AnalisisModel;
import com.example.LabWeb.services.ListaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


import java.util.*;

@Controller
@RequestMapping("/")

public class ListaController {

    @Autowired
    ListaService listaService;


    ModelAndView modelAndView = new ModelAndView("index");

    @GetMapping("/analisis")
    public ModelAndView index() {
        AnalisisModel analisis = new AnalisisModel();
        ArrayList<AnalisisModel> listaAnalisis = listaService.getAllAnalisis();
        modelAndView.addObject("analisisLista", listaAnalisis);
        modelAndView.addObject("mostrarAnalisis", analisis);
        return modelAndView;
    }


    @PostMapping("/agregar-analisis")
    public @ResponseBody List<String> agregarString(@RequestBody String string, ModelAndView modelAndView) {
        listaService.agregarAnalisis(string);
        modelAndView.addObject("mostrarAnalisis", listaService.getAllAnalisis());
        System.out.println("funciona agregar");
        return listaService.getListaAnalisis();
    }


















}
