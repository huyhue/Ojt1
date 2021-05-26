package com.fpt.soft.form;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import lombok.Data;

@Data
@Component
public class BookingForm implements Serializable{
	private String name;
	
	private String agree;
	private String sms;
	
	private String phoneSub;
	private String phone;
	
	private String mobileSub;
	private String mobile;
	
	private String email;
	private String emailSub;
	
	private String address;
	private Date dateStart;
	private Date dateEnd;

	private Date dateBooking;
	
	private int person;
	private String content;
	private boolean status;
}
