package com.je.notification;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class ProductNotifyScheduler {

	@Autowired
	private EventNotificationService eventNotificationService;
	
	@Scheduled(initialDelay = 3000,fixedDelayString = "30000")
	public void scheduleEvents() {
		log.info("Starting the Sechuler to process the events");
		eventNotificationService.processChangeNotification();
	}
}
