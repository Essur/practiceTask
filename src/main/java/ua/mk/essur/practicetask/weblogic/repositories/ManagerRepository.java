package ua.mk.essur.practicetask.weblogic.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.mk.essur.practicetask.weblogic.entities.Manager;

public interface ManagerRepository extends JpaRepository<Manager, Long> {
}