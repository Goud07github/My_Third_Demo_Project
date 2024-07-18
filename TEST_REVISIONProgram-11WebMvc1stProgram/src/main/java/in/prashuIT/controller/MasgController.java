package in.prashuIT.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MasgController {
	
	@GetMapping("/come")
	public ModelAndView masg2() {
		ModelAndView mvn = new ModelAndView();
		mvn.addObject("msg2","WelcomePageConfiguration to DummyEncoder village");
		mvn.setViewName("index");
		return mvn;
		
	}
	@GetMapping("/welcome")
	public ModelAndView masg1() {
		ModelAndView mvn = new ModelAndView();
		mvn.addObject("msg1", "Hello, Good morning");
		mvn.setViewName("index");
		return mvn;
	}

}