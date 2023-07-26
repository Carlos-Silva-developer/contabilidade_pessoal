package br.com.silva.carlos.contabilidade.domain;

import java.io.Serializable;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor 
@AllArgsConstructor
public class Person implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@SuppressWarnings("unused")
	private String name;
	private List<Double> income;
	private List<Double> outcome;
	
	

	)
