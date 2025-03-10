package tprmi;
import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ClientRMI {
    public static void main(String[] args) {
        try {
            
            Registry registry = LocateRegistry.getRegistry("localhost", 1099);

            
            Calculatrice calculatrice = (Calculatrice) Naming.lookup("rmi://localhost:109\r\n"+ " 9/SD");
            
    
            System.out.println("Addition : " + calculatrice.addition(10, 5));
            System.out.println("Soustraction : " + calculatrice.soustraction(10, 5));
            System.out.println("Multiplication : " + calculatrice.multiplication(10, 5));
            System.out.println("Division : " + calculatrice.division(10, 5));
        } catch (Exception e) {
            System.err.println("Erreur client : " + e.getMessage());
            e.printStackTrace();
        }
    }
}