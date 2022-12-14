package ua.mk.essur.practicetask.weblogic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import ua.mk.essur.practicetask.weblogic.entities.Manager;
import ua.mk.essur.practicetask.weblogic.repositories.ManagerRepository;

import java.util.List;

@Controller
public class ManagerController {
    private ManagerRepository managerRepository;

    public ManagerController(ManagerRepository managerRepository) {
        this.managerRepository = managerRepository;
    }

    @GetMapping("/managers")
    public String managersPage(Model model){
        List<Manager> managers = managerRepository.findAll();
        model.addAttribute("managers",managers);
        return "views/managers";
    }
    @GetMapping("/managers/{id}")
    public String deleteManger(@PathVariable("id") long id) {
        managerRepository.deleteById(id);
        return "redirect:/managers";
    }
}
