package com.training.message;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("random-message")
public class RandomMessagesApplication {

	private static String[] messages= {
			"A very warm welcome to you! It is lovely to have you among us!", 
			"Welcome! We are honored to receive you like your presence is crucial!",
			"Congratulation for being a part of our group. We would like to welcome you to our team and extremely happy to have you as one of us.",
			"Sometimes all you need is an awesome guest to make you feel complete in the family. I am really glad to see you. Welcome to my sweet home!",
			"Welcome on board! Our pleasant greetings go out to you on your arrival!"
	};
	
	public static void main(String[] args) {
		SpringApplication.run(RandomMessagesApplication.class, args);
	}
	
	@GetMapping
	public String getMessage() {
		int index = MyRandom.getRandomNumberUsingNextInt(0, 4);
		return messages[index];
	}

}
