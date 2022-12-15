package ua.mk.essur.practicetask.weblogic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ua.mk.essur.practicetask.weblogic.entities.Driver;
import ua.mk.essur.practicetask.weblogic.entities.Manager;
import ua.mk.essur.practicetask.weblogic.repositories.DriverRepository;

import java.util.List;

@Controller
public class DriverController {
    private DriverRepository driverRepository;

    public DriverController(DriverRepository driverRepository) {
        this.driverRepository = driverRepository;
    }
    @GetMapping("/drivers")
    public String managersPage(Model model){
        List<Driver> drivers = driverRepository.findAll();
        model.addAttribute("drivers",drivers);
        return "views/drivers";
    }
    @GetMapping("/drivers/{id}")
    public String deleteManger(@PathVariable("id") int id) {
        driverRepository.deleteById(id);
        return "redirect:/drivers";
    }

    @PostMapping("/drivers/add_driver")
    public String addManager(@RequestParam("driverName") String driverName,
                             @RequestParam("driverCompany") String driverCompany,
                             @RequestParam("carName") String carName,
                             @RequestParam("carNumber") String carNumber,
                             @RequestParam("numberOfDriverDocuments") String numberOfDriverDoc){
        Driver driver = new Driver();
        driver.setDriverFullName(driverName);
        driver.setCompany(driverCompany);
        driver.setCarName(carName);
        driver.setCarNumber(carNumber);
        driver.setNumberOfDriverDocuments(numberOfDriverDoc);
        driverRepository.save(driver);
        return "redirect:/drivers";
    }
}
