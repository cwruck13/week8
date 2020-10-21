package trip;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import trip.beans.Contact;
import trip.beans.Destination;
import trip.controller.BeanConfiguration;
import trip.repository.ContactRepository;


@SpringBootApplication
public class VactionInfromationApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(VactionInfromationApplication.class, args);
		
		/*
		 * ApplicationContext appContext = new
		 * AnnotationConfigApplicationContext(BeanConfiguration.class);
		 * 
		 * Contact c = appContext.getBean("contact", Contact.class);
		 * 
		 * System.out.println(c.toString());
		 */
	}
	
	@Autowired
	ContactRepository repo;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		//Using an existing bean
		Contact c = appContext.getBean("contact", Contact.class);
		c.setTakingTrip("no");
		repo.save(c);
		
		//create a bean to use
		Contact co = new Contact("Joe Bob","333-333-3333", "no");
		Destination d = new Destination("Europe", "Italy", "Venice");
		co.setDestination(d);
		repo.save(co);
		
		List<Contact> allMyContacts = repo.findAll();
		for(Contact people: allMyContacts) {
			System.out.println(people.toString());
			
		//System.out.println(c.toString());
	}

		
		//closes the ApplicationContext resource leak - not imperative to add but nice to clean it up
				((AbstractApplicationContext) appContext).close();
	}
}
