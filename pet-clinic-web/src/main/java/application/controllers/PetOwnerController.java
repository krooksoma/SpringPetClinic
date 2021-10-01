package application.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/pet-owner")
@Controller
public class PetOwnerController {

    @RequestMapping({"","/", "/index", "/index.html"})
    public String petOwner(){
        return "pet-owner/index";
    }
}
