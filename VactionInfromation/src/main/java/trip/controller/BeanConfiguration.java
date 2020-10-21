package trip.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import trip.beans.Contact;
import trip.beans.Destination;


@Configuration
public class BeanConfiguration {
	
	@Bean
	public Contact contact() {
		
		Contact bean = new Contact();
		bean.setName("Jeffrey");
		bean.setPhone("444-444-4444");
		bean.setTakingTrip("yes");
		return bean;
		
	}

	@Bean
	public Destination destination() {
		
		Destination bean = new Destination("USA", "CO", "Denver");
		return bean;
	}
}
