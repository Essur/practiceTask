package ua.mk.essur.practicetask.weblogic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ua.mk.essur.practicetask.weblogic.entities.Client;
import ua.mk.essur.practicetask.weblogic.entities.Dispatcher;
import ua.mk.essur.practicetask.weblogic.repositories.ClientRepository;

import java.util.List;

@Controller
public class ClientsController {
    private ClientRepository clientRepository;

    public ClientsController(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @GetMapping("/clients")
    public String managersPage(Model model){
        List<Client> clients = clientRepository.findAll();
        model.addAttribute("clients",clients);
        return "views/clients";
    }

    @GetMapping("/clients/{id}")
    public String deleteManger(@PathVariable("id") int id) {
        clientRepository.deleteById(id);
        return "redirect:/clients";
    }

    @PostMapping("/clients/add_client")
    public String addManager(@RequestParam("clientName") String clientName,
                             @RequestParam("clientCardNumber") String cardNumber){
        Client client = new Client();
        client.setClientFullName(clientName);
        client.setClientCard(cardNumber);
        clientRepository.save(client);
        return "redirect:/clients";
    }
}
