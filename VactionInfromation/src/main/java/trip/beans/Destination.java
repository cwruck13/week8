package trip.beans;

import javax.persistence.Embeddable;

@Embeddable
public class Destination {
	
	//attributes
	private String country;
	private String state;
	private String city;
	
	//no args
	public Destination() {
		super();
	}

	//all args
	public Destination(String country, String state, String city) {
		super();
		this.country = country;
		this.state = state;
		this.city = city;
	}

	//getters and setters
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Destination [country=" + country + ", state=" + state + ", city=" + city + "]";
	}

}
