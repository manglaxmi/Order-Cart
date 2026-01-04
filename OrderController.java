package com;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

	@GetMapping("/getorder")
	public ResponseEntity<?> getOrderDetails() {
		
		return  new ResponseEntity("Iphones = 50, redmi=30,realme=25" , HttpStatus.OK);
	}
}
