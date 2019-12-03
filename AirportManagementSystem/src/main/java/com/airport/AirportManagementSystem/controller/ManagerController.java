package com.airport.AirportManagementSystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class ManagerController {


	@Autowired
	AdminService adminService;
	
		@RequestMapping("/toRegisterManager")
	    public String display(Model model)
	    {
			model.addAttribute("manager",new Manager());
			return "/registerManagerForm";
	    }
		
		@RequestMapping(value="/registerManager",method=RequestMethod.POST)
		public ModelAndView addEmployee(@ModelAttribute("admin")Manager manager)
		{
			
		   adminService.addManager(manager);
			ModelAndView model1=new ModelAndView("/registerManagerSuccess");
			return model1;
		}
	
}
