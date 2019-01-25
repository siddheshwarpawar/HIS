package com.his.ar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.his.ar.model.UserModel;
import com.his.ar.service.ARService;
import com.his.util.ArConstants;

/**
 * @author nit This is controller
 */
@Controller
public class ARController {

	@Autowired(required = true)
	public ARService service;

	@RequestMapping(name = "/userReg", method = RequestMethod.GET)
	public String userRegister(Model model) {
		UserModel userModel = new UserModel();
		model.addAttribute("formModel", userModel);
		return "registrationPage";
	}

	@RequestMapping(name = "/userReg", method = RequestMethod.POST)
	public String registerUser(@ModelAttribute("formModel") UserModel userModel, Model model) {
		// Use service
		int count = service.saveUser(userModel);
		if (count != 0) {
			model.addAttribute(ArConstants.SUCCESS, ArConstants.SUCCESS_MSG);
		} else {
			model.addAttribute(ArConstants.ERROR, ArConstants.ERROR_MSG);
		}
		// LVN
		return "resultPage";
	}
}// class
