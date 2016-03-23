package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProdutoController {
	@RequestMapping ("/produtos")
	public String todos() {
		return "produtos";
	}
}