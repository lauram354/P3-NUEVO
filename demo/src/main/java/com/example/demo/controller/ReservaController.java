package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.repositorio.reservaRepository;


@Controller
public class ReservaController {

    @Autowired
    private reservaRepository reservasRepository;

    @GetMapping("/reservas")
    public String obtenerTodasLasReservas(Model model) {
        model.addAttribute("reservas", reservasRepository.findAllReservas());
        return "reservas";
    }

    @GetMapping("/tiposhabitaciones")
    public String obtenerTodasLosTiposHabis(Model model) {
        model.addAttribute("tiposhabitaciones", reservasRepository.getTipohabis());
        return "tiposhabitaciones";
    }

    @GetMapping("/habitaciones")
    public String obtenerTodasLasHabis(Model model) {
        model.addAttribute("habitaciones", reservasRepository.getHabis());
        return "habitaciones";
    }

    @GetMapping("/servicios")
    public String obtenerTodosLosServicios(Model model) {
        model.addAttribute("servicios", reservasRepository.getConsumosServicios());
        return "servicios";
    }



}
