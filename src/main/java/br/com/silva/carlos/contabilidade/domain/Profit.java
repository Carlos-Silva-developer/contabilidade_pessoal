package br.com.silva.carlos.contabilidade.domain;

import java.io.Serializable;
import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class Profit implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private String name;
	private Double value;
	private LocalDate incomeDay;
	private String source;
	
}
