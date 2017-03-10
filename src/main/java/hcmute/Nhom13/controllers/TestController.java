package hcmute.Nhom13.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {

	@RequestMapping("/G13.html")
	public ModelAndView firstPage() {
		return new ModelAndView("G13");
	}

}
