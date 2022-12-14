package ua.mk.essur.practicetask.weblogic.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import ua.mk.essur.practicetask.weblogic.entities.Manager;
import ua.mk.essur.practicetask.weblogic.repositories.ManagerRepository;

import java.util.List;

@Controller
public class MainController {


    @GetMapping({"","/index"})
    public String mainPage(){
        return "index";
    }
}
