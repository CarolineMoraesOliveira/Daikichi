package com.caroline.daikichi.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/daikichi")
public class DaikichiController {
	
	@RequestMapping ("")
	public String index () {
		return "Hello! we always have a message to your heart";
	}
	@RequestMapping ("/monday")
	public String monday () {
			return "There is no way to happiness, happiness is the way";
	}	
	@RequestMapping ("/tuesday")
	public String tuesday () {
			return "The noblest pleasure is the joy of understanding";
	}
	@RequestMapping ("/wednesday")
	public String wednesday () {
			return "All our knowledge has its origins in our perceptions";
	}
	@RequestMapping ("/thursday")
			public String thursday () {
					return "The greatest deception men suffer is from their own opinions";
	}
	@RequestMapping("/travel/{country}")
	    public String travel (@PathVariable ("country") String country) {
	    	return "Congratulations! You will soon travel to "+country; 
	}
	@RequestMapping("/lotto/{num}")
    public String lotto (@PathVariable ("num") Integer num) {
		if (num%2==0) {
			return "You will take a grand journey in the near future, but be weary of tempting offers";
		}
			return "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends";
	}
}

