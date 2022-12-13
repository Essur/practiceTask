package ua.mk.essur.practicetask.weblogic.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.mk.essur.practicetask.weblogic.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Integer> {
}