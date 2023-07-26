package br.com.silva.carlos.contabilidade.controller.response;

import br.com.silva.carlos.contabilidade.domain.Bills;
import br.com.silva.carlos.contabilidade.domain.Profit;
import lombok.*;

import java.util.List;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class ListPersonResponse {

    private Long id;
    private String name;
    private List<Profit> income;
    private List<Bills> outcome;
    
}
