package br.com.felipesilva.batch.repositories;

import br.com.felipesilva.batch.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PersonRepository extends JpaRepository<Person, UUID> {
}
