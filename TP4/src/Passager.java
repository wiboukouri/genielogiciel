import java.util.ArrayList;

public class Passager {
private String nom;
private String contact;

ArrayList<Reservation> reservations;

public String getNom() {
	return nom;
}

public void setNom(String nom) {
	this.nom = nom;
}

public String getContact() {
	return contact;
}

public void setContact(String contact) {
	this.contact = contact;
}

public Passager(String nom, String contact) {
	this.nom = nom;
	this.contact = contact;
}

public Passager(String nom, String contact, ArrayList<Reservation> reservations) {
	super();
	this.nom = nom;
	this.contact = contact;
	this.reservations = reservations;
}

public ArrayList<Reservation> getReservations() {
	return reservations;
}

public void setReservations(ArrayList<Reservation> reservations) {
	this.reservations = reservations;
}

@Override
public String toString() {
	return "Passager [nom=" + nom + ", contact=" + contact  + "]";
}


}
