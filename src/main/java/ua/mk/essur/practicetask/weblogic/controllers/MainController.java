package ua.mk.essur.practicetask.weblogic.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import ua.mk.essur.practicetask.weblogic.entities.Manager;
import ua.mk.essur.practicetask.weblogic.repositories.ManagerRepository;
import ua.mk.essur.practicetask.weblogic.service.RepositoryService;

import java.util.List;

@Controller
public class MainController {
    @Autowired
    private ManagerRepository managerRepository;

    /*private RepositoryService repositoryService;

    public MainController(RepositoryService repositoryService) {
        this.repositoryService = repositoryService;
    }*/

    @GetMapping("")
    public String mainPage(){
        return "index";
    }

    @GetMapping("/managers")
    public String managersPage(Model model){
        List<Manager> managers = managerRepository.findAll();
        model.addAttribute("managers",managers);
        return "views/managers";
    }
}
