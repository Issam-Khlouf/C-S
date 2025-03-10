package tprmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Calculatrice extends Remote {
    int addition(int a, int b) throws RemoteException;
    int soustraction(int a, int b) throws RemoteException;
    int multiplication(int a, int b) throws RemoteException;
    int division(int a, int b) throws RemoteException;
}