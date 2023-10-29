package com.sheryians.major.controller;

import org.springframework.sterotype.Controller;
@Controller

public class AdminController {
	@GetMapping("/admin")
	
	public String adminHome() {
		return "adminHome";
	}
	
   @GetMapping("/admin/categories")
	
	public String getCat() {
		return "categories";
	}
   
   @GetMapping("/admin/categories/add")
   public String getCatAdd()
   {
	   return "categoriesAdd";
   }

}
 