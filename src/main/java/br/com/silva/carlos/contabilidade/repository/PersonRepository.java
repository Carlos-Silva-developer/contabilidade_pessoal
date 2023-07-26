package br.com.silva.carlos.contabilidade.repository;

import br.com.silva.carlos.contabilidade.domain.Person;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PersonRepository extends JpaRepository<Person, Long> {

    Page<Person> listAll();

}
