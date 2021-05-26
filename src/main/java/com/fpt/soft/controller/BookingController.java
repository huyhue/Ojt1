package com.fpt.soft.controller;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.time.LocalDateTime;    
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.text.SimpleDateFormat;  
import java.util.Date;

import com.fpt.soft.form.BookingForm;
import com.fpt.soft.form.DepartmentForm;
import com.fpt.soft.model.Booking;
import com.fpt.soft.service.BookingService;

@RequestMapping("/booking")
@Controller
public class BookingController {
	@Autowired
	private BookingService bookingService;
	
	@GetMapping("")
	public String view(@ModelAttribute("booking") BookingForm bo) {
		return "user/booking";
	}
	
	@PostMapping("/save")
	public String save(@ModelAttribute("booking") BookingForm bo) {
//		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
//		System.out.println(formatter.format(date)); 
		
	    Date date = new Date();  
		Booking b = new Booking(bo.getName(),bo.getPhoneSub()+bo.getPhone(),bo.getMobileSub()+bo.getMobile(), bo.getEmail()+bo.getEmailSub(), 
				bo.getAddress(), bo.getDateStart(),bo.getDateEnd(), date, bo.getPerson(), bo.getContent());

		bookingService.save(b);
		System.out.println("Agree: " + bo.getAgree()+" SMS: "+bo.getSms());
		return "redirect:/booking";
	}
}
