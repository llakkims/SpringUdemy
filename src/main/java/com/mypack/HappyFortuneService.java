package com.mypack;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

	public void getDailyFortune() {
		System.out.println("Happy day!! luck is on your way.");

	}

}
