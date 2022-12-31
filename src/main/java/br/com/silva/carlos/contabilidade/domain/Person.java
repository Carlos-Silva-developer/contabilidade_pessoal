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
	private List<Profit> income;
	private List<Bills> outcome;
	
	

	public Double calculateIncome() {		
		double returnValue = 0;		
		
		for (Double double1 : income) {
			returnValue += double1;
		}		
		
		return returnValue;
	}
	
	public Double calculateOutcome() {		
		double returnValue = 0;		
		
		for (Double double1 : outcome) {
			returnValue += double1;
		}		
		
		return returnValue;
	}

	public Double calculateProfit() {
		return calculateIncome() - calculateOutcome();
	}
}
