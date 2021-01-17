package ma.emsi.devoir.commerce.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ma.emsi.devoir.commerce.services.services.IProductService;

@Controller
@RequestMapping("/article")
public class ArticleController {

	@Autowired
	private IProductService iProductService;
	
	@GetMapping("/")
	public String findAll(Model model) {
		model.addAttribute("articles", iProductService.findAll());
		return "article/list";
	}

}
