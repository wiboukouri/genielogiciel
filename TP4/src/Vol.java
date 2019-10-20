import java.text.SimpleDateFormat;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Date;

public class Vol {

	
	private String identifiant;

	private ZonedDateTime depart;
	
	private ZonedDateTime arrivee;
	
	ArrayList<Reservation> reservations;

	public Vol(String identifiant, ZonedDateTime depart, ZonedDateTime arrivee) {

		this.identifiant = identifiant;
		this.depart = depart;
		this.arrivee = arrivee;
	}

	public String getIdentifiant() {
		return identifiant;
	}

	public void setIdentifiant(String identifiant) {
		this.identifiant = identifiant;
	}

	public ZonedDateTime getDepart() {
		return depart;
	}

	public void setDepart(ZonedDateTime depart) {
		this.depart = depart;
	}

	public ZonedDateTime getArrivee() {
		return arrivee;
	}

	public void setArrivee(ZonedDateTime arrivee) {
		this.arrivee = arrivee;
	}

	public ArrayList<Reservation> getReservations() {
		return reservations;
	}
	

	public void setReservations(ArrayList<Reservation> reservations) {
		this.reservations = reservations;
	}
	
	  @Override
	public String toString() {
		return "Vol [identifiant=" + identifiant + ", depart=" + depart + ", arrivee=" + arrivee  + "]";
	}
	  
	  
	    public void duree(){
	        System.out.println("la duree de vol est " + this.depart.until(this.arrivee, ChronoUnit.HOURS)+ " heures.");

	    }

	public void ouvrir() { //date depart > date serveur 
		
		ZonedDateTime current = null;
		current = ZonedDateTime.now();
		
	  if (current.isBefore(depart))
		  
		  System.out.println("le vol est ouvert");
	  
	  		
	  }
	 
	public void fermer() { // date depart < date serveur 
		ZonedDateTime current = null;
		current = ZonedDateTime.now();
		
	  if (current.isAfter(depart))
		  
		  System.out.println("le vol est ferme");
	}
}
