package br.com.silva.carlos.contabilidade;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControllerTeste {
	
	@GetMapping("/")
	public String sayHello() {
		return "Hello!";
	}
}
