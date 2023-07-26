package br.com.silva.carlos.contabilidade.domain;

import java.util.List;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter @Setter
@NoArgsConstructor 
@AllArgsConstructor
@Entity
@Builder
@EqualsAndHashCode(of = "id") @ToString(of = "id")
public class Person {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private List<Profit> income;
	private List<Bill> outcome;


}
