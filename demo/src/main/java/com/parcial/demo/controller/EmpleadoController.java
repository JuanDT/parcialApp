package com.parcial.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.parcial.demo.model.Empleado;
@Controller
public class EmpleadoController {
    
    @GetMapping("empleado")
    public String mostrarFormulario(Empleado empleado) {        
        return "formulario";
    }

    @PostMapping("/empleado")
    public String enviarFormulario(@Valid Empleado empleado, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "formulario";
        }

        model.addAttribute("empleado", empleado);
        return "resultado";
    }
}
