
import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.ArrayList;


class Test{

    public static void main(String args[]){
    
            ZonedDateTime d1 = ZonedDateTime.parse("2019-10-20T12:30:38.492+05:30[Asia/Calcutta]");
            ZonedDateTime d2 = ZonedDateTime.parse("2019-10-20T18:50:16.492+05:30[Asia/Tokyo]");
            
            Vol vol1 = new Vol("AB20",d1,d2);
            
  
            Date d3 = new Date();
            Date d4 = new Date();
            
            Reservation Reservation1 = new Reservation(d3,100.112);
            Reservation Reservation2 = new Reservation(d4,212.221);
            
            Client C1 = new Client("wiaam","Client1", "CB", "client1@gmail.com") ;
            Client C2 = new Client("zineb","Client2", "Paypal", "client2@gmail.com") ;

            ArrayList Clients = new ArrayList();
                Clients.add(C1);
                Clients.add(C2);
 
            Passager p1 = new Passager("wiaam1","Passager1@gmail.com") ;
            Passager p2 = new Passager("zineb1","Passager2@gmail.com") ;

            ArrayList <Passager> Passagers = new ArrayList<Passager>();
                Passagers.add(p1);
                Passagers.add(p2);


            System.out.print("   ---------- Bienvenu dans le vol :" + vol1.getIdentifiant() + " --------- \n");
            vol1.toString();
            System.out.println("\n");
            vol1.duree();    
            System.out.print("\n l'etat de vol : ");     
            vol1.ouvrir();
            vol1.fermer();
            
            System.out.println("\n");
        
              
            System.out.println("\t la Reservation : " + Reservation1.getIdentifiant() );
            System.out.print("\n la date Reservation  :"+ d3);
            System.out.println("\n");
            System.out.print(C1);
            System.out.println("\n");
            System.out.print("\n le Paiement :  ");
            Reservation1.payer();
            System.out.println("\n");
            System.out.print("l'etat :  ");
            
            Reservation1.annuler();
            System.out.println("\n");
            System.out.println("\n");
           
           
          
            System.out.println("\t la Reservation : " + Reservation2.getIdentifiant() );
            System.out.print("\n la Date Reservation  :"+ d4);
            System.out.println("\n");
            System.out.print(C2);
            System.out.println("\n");
            System.out.print("le Paiement :  ");
            Reservation2.payer();
            System.out.print("\n l'etat :  ");
            Reservation2.confirmer();
            System.out.println("\n");
            System.out.print("Les passagers  : \n");
            System.out.println(Passagers);
 
            


        }
}
