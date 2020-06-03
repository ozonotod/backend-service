package io.lkmx.template.services;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class AppointmentService {

	@GetMapping("/ping")
	public String ping() {
		log.info("Pong");
		return "pong";
	}
	
	@Scheduled(cron = "*/5 * * * * *")
	public void yeah() {
		log.info("HELL YEAH!! - " + new Date());
	}

}
