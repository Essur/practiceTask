package ua.mk.essur.practicetask.weblogic.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.mk.essur.practicetask.weblogic.entities.Dispatcher;

public interface DispatcherRepository extends JpaRepository<Dispatcher, Integer> {
}