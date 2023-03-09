package com.example.LabWeb.services;

import com.example.LabWeb.models.AnalisisModel;
import com.example.LabWeb.repository.IAnalisisDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ListaServiceImpl implements ListaService{

    @Autowired
    IAnalisisDAO listaRepository;
    AnalisisModel analisisModel;

    @Override
    @Transactional(readOnly = true)
    public List<AnalisisModel> getAllAnalisis() {
        return (List<AnalisisModel>) listaRepository.findAll();
    }






}
