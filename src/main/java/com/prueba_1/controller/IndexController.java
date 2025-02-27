package com.prueba_1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author Eduardo
 */
@Controller
public class IndexController {

    @GetMapping("/")
    public String mostrarInicio() {
        return "index";
    }
}