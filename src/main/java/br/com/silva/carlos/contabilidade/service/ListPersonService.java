package br.com.silva.carlos.contabilidade.service;

import br.com.silva.carlos.contabilidade.controller.response.ListPersonResponse;
import br.com.silva.carlos.contabilidade.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ListPersonService {

    @Autowired
    private PersonRepository personRepository;

//    public List<ListPersonResponse> listPerson() {
//        //TODO
//    }
}