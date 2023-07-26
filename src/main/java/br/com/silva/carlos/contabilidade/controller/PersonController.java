package br.com.silva.carlos.contabilidade.controller;

import br.com.silva.carlos.contabilidade.controller.response.ListPersonResponse;
import br.com.silva.carlos.contabilidade.service.ListPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Service
@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private ListPersonService listPersonService;
    
}
