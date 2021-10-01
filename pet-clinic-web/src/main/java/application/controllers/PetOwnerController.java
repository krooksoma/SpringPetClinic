package application.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import petdata.services.OwnerService;

@RequestMapping("/owners")
@Controller
public class PetOwnerController {
    private final OwnerService ownerService;

    public PetOwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @RequestMapping({"","/", "/index", "/index.html"})
    public String listPetOwner(Model model){
        model.addAttribute("owners", ownerService.findAll());
        return "owners/index";
    }
}
