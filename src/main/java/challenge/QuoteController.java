package challenge;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/")
public class QuoteController {

	@Autowired
	private QuoteService service;

	@GetMapping("/v1/quote")
	@ResponseBody
	public Quote getQuote(){
		return service.getQuote();
	}

	@GetMapping("/v1/quote/{actor}")
	@ResponseBody
	public Quote getQuoteByActor(@PathVariable String actor){
		return service.getQuoteByActor(actor);
	}
}