package application.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import petdata.services.VeterinarianService;


@Controller
public class VeterinarianController {

    public final VeterinarianService vetService;

    public VeterinarianController(VeterinarianService vetService) {
        this.vetService = vetService;
    }

    @RequestMapping({"/vets","vet/index", "/vets/index.html", "/vets.html"})
    public String listVeterinarians(Model model){
        model.addAttribute("veterinarians", vetService.findAll());
        return "veterinarians/index";
    }
}
