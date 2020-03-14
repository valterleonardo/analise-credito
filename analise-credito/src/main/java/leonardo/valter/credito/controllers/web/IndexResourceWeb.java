package leonardo.valter.credito.controllers.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexResourceWeb {
	
	@GetMapping("/")
	public String index() {
		return "redirect:/propostas";
	}
}