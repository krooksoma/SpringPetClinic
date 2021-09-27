package application.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PetOwnerController {

    @RequestMapping({"/petowner", "pet-owner/index", "pet-owner/index.html"})
    public String petOwner(){
        return "pet-owner/index";
    }
}
