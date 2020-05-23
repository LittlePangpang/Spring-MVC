package com.s1626022055.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.s1626022055.po.Customer;

@Controller
public class CustomerController {
	private static Integer id=0;
	/**
	 * 向客户页面跳转
	 */
	@RequestMapping("/toCustomer")
	public String toRegister() {
		return "addCustomer";
	}

	/**
	 * 添加客户信息
	 */
	@RequestMapping("/addCustomer")
	public String registerUser(Customer customer, Model model) {
		customer.setId(id++);
	    model.addAttribute("customer", customer);

		return "showCustomer";
	}
}
