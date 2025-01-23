package com.jbk;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Red-Bus")
public class Spring_Boot_Demo {

	@GetMapping("/RoyalBus")
	public String Royal() {
		return "Royal It is  an Sleeper Bus";
	}

	@PostMapping("/JagirdarBus")
	public String Jagirdar() {
		return "Jagirdar It is  an Sleeper Bus";
	}

	@PutMapping("/Shree-Sai")
	public String ShreeSai() {
		return "Shree-Sai is an Seater or Sleeper Bus";
	}

	@DeleteMapping("/Shiv-Shahi")
	public String ShivShahi() {
		return "Shiv-Shahi is an Seater Bus";
	}

}
