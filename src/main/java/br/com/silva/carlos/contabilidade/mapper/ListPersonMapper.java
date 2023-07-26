package br.com.silva.carlos.contabilidade.mapper;

import br.com.silva.carlos.contabilidade.controller.response.ListPersonResponse;
import br.com.silva.carlos.contabilidade.domain.Person;

public class ListPersonMapper {

    public static ListPersonResponse toResponse(Person person) {
        return ListPersonResponse.builder()
                .id(person.getId())
                .name(person.getName())
                .income(person.getIncome())
                .outcome(person.getOutcome())
                .build();
    }
}
