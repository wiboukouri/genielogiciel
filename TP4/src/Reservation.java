import java.util.ArrayList;
import java.util.Date;

public class Reservation {

	public Date date;
	
	public Double identifiant;
	
	public String etat;
	
	ArrayList<Client> clients;
	
	Vol vol;

	ArrayList<Passager> passagers;
	
	public Reservation(Date date, Double identifiant, String etat, ArrayList<Client> clients, Vol vol,
			ArrayList<Passager> passagers) {
		this.date = date;
		this.identifiant = identifiant;
		this.etat = etat;
		this.clients = clients;
		this.vol = vol;
		this.passagers = passagers;
	}
	
	public Reservation(Date date, Double identifiant) {
		// TODO Auto-generated constructor stub
		this.date = date;
		this.identifiant = identifiant;
	}

	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Double getIdentifiant() {
		return identifiant;
	}
	public void setIdentifiant(Double identifiant) {
		this.identifiant = identifiant;
	}
	public String getEtat() {
		return etat;
	}
	public void setEtat(String etat) {
		this.etat = etat;
	}
	public ArrayList<Client> getClients() {
		return clients;
	}
	public void setClients(ArrayList<Client> clients) {
		this.clients = clients;
	}

	public Vol getVol() {
		return vol;
	}
	public void setVol(Vol vol) {
		this.vol = vol;
	}
	public ArrayList<Passager> getPassagers() {
		return passagers;
	}
	public void setPassagers(ArrayList<Passager> passagers) {
		this.passagers = passagers;
	}
	public String toString() {
		return "Reservation [date=" + date + ", identifiant=" + identifiant + ", etat=" + etat + ", clients=" + clients
				+ ", vol=" + vol + ", passagers=" + passagers + "]";
	}
	
	public void annuler() {
		
		this.etat= "annulee";
		
		System.out.println("la reservation id :" + identifiant + " est annulee");
	}
	
	public void confirmer() {
		
		this.etat= "confirmee";
		System.out.println("la reservation id : " + identifiant + " est confirmee");

	}
	
	public void payer() {
		
		this.etat= "payee";
		System.out.println("la reservation id : " + identifiant + " est payee");

	}
}
