package com.prueba_1.controller;

import com.prueba_1.domain.Vehiculo;
import com.prueba_1.service.VehiculoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Eduardo
 */
@Controller
@RequestMapping("/vehiculos")
public class VehiculoController {

    @Autowired
    private VehiculoService vehiculoService;

    @GetMapping("/listado")
    public String listarVehiculos(Model model) {
        List<Vehiculo> vehiculos = vehiculoService.getVehiculos();
        model.addAttribute("vehiculos", vehiculos);
        return "vehiculo/listado";
    }
     @GetMapping
    public String listArboles(Model model) {
        //List<Vehiculo> arboles = vehiculoService.;
        //model.addAttribute("arboles", arboles);
        return "arboles/lista"; // Vista para listar árboles
    }

    @GetMapping("/crearForm")
    public String mostrarFormularioCreacion(Model model) {
        model.addAttribute("vehiculo", new Vehiculo());
        return "crearVehiculo";
    }

    @PostMapping("/crear")
    public String crearVehiculo(@ModelAttribute Vehiculo vehiculo) {
        vehiculoService.save(vehiculo);
        return "redirect:/vehiculos/listado";
    }

}