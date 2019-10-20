import java.util.ArrayList;

public class Client {

	private String nom;
	private String paiement;
	private String contact;
	private String reference;

	ArrayList<Reservation> reservations;
	
	public Client() {
		
	}

	public Client(String nom, String paiement, String contact, String reference) {

		this.nom = nom;
		this.paiement = paiement;
		this.contact = contact;
		this.reference = reference;
	}

	public Client(String nom, String paiement, String contact, String reference, ArrayList<Reservation> reservations) {
		this.nom = nom;
		this.paiement = paiement;
		this.contact = contact;
		this.reference = reference;
		this.reservations = reservations;
	}


	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPaiement() {
		return paiement;
	}

	public void setPaiement(String paiement) {
		this.paiement = paiement;
	}
	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public ArrayList<Reservation> getReservations() {
		return reservations;
	}

	public void setReservations(ArrayList<Reservation> reservations) {
		this.reservations = reservations;
	}

	@Override
	public String toString() {
		return "Client [nom=" + nom + ", paiement=" + paiement + ", contact=" + contact + ", reference=" + reference + "]";
	}
	
	
}
