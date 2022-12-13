package ua.mk.essur.practicetask.weblogic.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.mk.essur.practicetask.weblogic.entities.Driver;

public interface DriverRepository extends JpaRepository<Driver, Integer> {
}