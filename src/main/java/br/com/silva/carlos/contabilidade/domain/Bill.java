package br.com.silva.carlos.contabilidade.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.*;

@Getter @Setter
@Entity @Builder
@AllArgsConstructor @NoArgsConstructor
//@EqualsAndHashCode(of = "id") @ToString(of = "id")
public class Bill {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String name;
	private String barCode;
	private double value;
	private Date paymentDay;
	private Date paymentLimit;
	
}
