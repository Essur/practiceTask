package ua.mk.essur.practicetask.weblogic.service;

import lombok.Data;
import org.springframework.stereotype.Service;
import ua.mk.essur.practicetask.weblogic.repositories.ClientRepository;
import ua.mk.essur.practicetask.weblogic.repositories.DispatcherRepository;
import ua.mk.essur.practicetask.weblogic.repositories.DriverRepository;
import ua.mk.essur.practicetask.weblogic.repositories.ManagerRepository;

@Service
@Data
public class RepositoryService {
    private ClientRepository clientRepository;
    private DispatcherRepository dispatcherRepository;
    private DriverRepository driverRepository;
    private ManagerRepository managerRepository;


}
