package tprmi;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ServeurRMI {
    public static void main(String[] args) {
        try {
        	
            
            CalculatriceImpl calculatrice = new CalculatriceImpl();
            Naming.rebind("rmi://localhost:1099/SD",calculatrice);
          
            
            
            System.out.println("Serveur prêt");
        } catch (Exception e) {
            System.err.println(  e.getMessage());
            e.printStackTrace();
        }
    }
}