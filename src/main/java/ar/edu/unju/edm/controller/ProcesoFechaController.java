package ar.edu.unju.edm.controller;

import ar.edu.unju.edm.model.ProcesoFecha;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProcesoFechaController {
    
    @GetMapping("/procesoFecha")
    public String procesoFechaForm(Model model) {
        model.addAttribute("procesoFecha", new ProcesoFecha(null, null));
        return "procesoFecha";
    }
    
    @PostMapping("/procesoFecha")
    public String procesoFechaSubmit(@ModelAttribute ProcesoFecha procesoFecha) {
        procesoFecha.compararFechas();
        return "procesoFechaResult";
    }
}