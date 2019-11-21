package com.crgap.forum.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class AppController {

	@RequestMapping(value = { "/" }, method = RequestMethod.GET)
	public String homePage(Model model) {
		return "home";
	}

	@RequestMapping(value = { "/products" }, method = RequestMethod.GET)
	public String productsPage(Model model) {
		return "products";
	}

	@RequestMapping(value = { "/contactus" }, method = RequestMethod.GET)
	public String contactUsPage(Model model) {
		return "contactus";
	}
}