package com.mypack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

	FortuneService fortuneService;
	@Autowired
	public void CricketCoach(FortuneService fService)
	{
		fortuneService=fService;
	}
	public String getDailyWorkOut() {
	
		fortuneService.getDailyFortune();
		return "Run for 30 minutes.";
	}

}
