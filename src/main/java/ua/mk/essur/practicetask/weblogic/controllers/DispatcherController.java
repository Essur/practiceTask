package ua.mk.essur.practicetask.weblogic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ua.mk.essur.practicetask.weblogic.entities.Dispatcher;
import ua.mk.essur.practicetask.weblogic.entities.Manager;
import ua.mk.essur.practicetask.weblogic.repositories.DispatcherRepository;

import java.util.List;

@Controller
public class DispatcherController {
    private DispatcherRepository dispatcherRepository;

    public DispatcherController(DispatcherRepository dispatcherRepository) {
        this.dispatcherRepository = dispatcherRepository;
    }

    @GetMapping("/dispatchers")
    public String managersPage(Model model){
        List<Dispatcher> dispatchers = dispatcherRepository.findAll();
        model.addAttribute("dispatchers",dispatchers);
        return "views/dispatchers";
    }

    @GetMapping("/dispatchers/{id}")
    public String deleteManger(@PathVariable("id") int id) {
        dispatcherRepository.deleteById(id);
        return "redirect:/dispatchers";
    }

    @PostMapping("/dispatchers/add_dispatcher")
    public String addManager(@RequestParam("dispatcherName") String name,
                             @RequestParam("dispatcherCompany") String company){
        Dispatcher dispatcher = new Dispatcher();
        dispatcher.setDispatcherFullName(name);
        dispatcher.setCompany(company);
        dispatcherRepository.save(dispatcher);
        return "redirect:/dispatchers";
    }
}
