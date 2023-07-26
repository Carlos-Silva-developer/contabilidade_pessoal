package br.com.silva.carlos.contabilidade.domain;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@Entity
public class Bills implements Serializable{
	
	@Id
	private static final long serialVersionUID = 1L;
	private String name;
	private double value;
	private double taxes;
	private LocalDate paymentDay;
	private LocalDate paymentLimt;
	
}
