package trip.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;


@Entity
public class Contact {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	//attributes
	private long id;
	private String name;
	private String phone;
	private String takingTrip;
	@Autowired
	private Destination destination;
	
	//no args
	public Contact() {
		super();
		this.takingTrip="uncertain";
	}
	
	//1 arg
	public Contact(String name) {
		super();
		this.name = name;
	}

	//3 args
	public Contact(String name, String phone, String takingTrip) {
		super();
		this.name = name;
		this.phone = phone;
		this.takingTrip = takingTrip;
	}

	//all args
	public Contact(long id, String name, String phone, String takingTrip) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.takingTrip = takingTrip;
	}

	//getters and setters
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getTakingTrip() {
		return takingTrip;
	}

	public void setTakingTrip(String takingTrip) {
		this.takingTrip = takingTrip;
	}

	public Destination getDestination() {
		return destination;
	}

	public void setDestination(Destination destination) {
		this.destination = destination;
	}

	@Override
	public String toString() {
		return "Contact [id=" + id + ", name=" + name + ", phone=" + phone + ", takingTrip=" + takingTrip
				+ ", destination=" + destination + "]";
	}
	
}
