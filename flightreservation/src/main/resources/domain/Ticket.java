package domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Ticket {

	@Id @GeneratedValue
	private int ticketId;
	private int ticketNumber;
	private String Status;
	private String routing;
	priate String fairType;
	
	@OneToOne
	private Flight flight;
	
	
	
	
}
