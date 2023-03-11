package com.example.LabWeb.services;

import com.example.LabWeb.models.AnalisisModel;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public interface ListaService {

    List<AnalisisModel> getAllAnalisis();

}
