package tprmi;

import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;

public class CalculatriceImpl extends UnicastRemoteObject implements Calculatrice {

    protected CalculatriceImpl() throws RemoteException {
        super();
    }

    @Override
    public int addition(int a, int b) throws RemoteException {
        return a + b;
    }

    @Override
    public int soustraction(int a, int b) throws RemoteException {
        return a - b;
    }

    @Override
    public int multiplication(int a, int b) throws RemoteException {
        return a * b;
    }

    @Override
    public int division(int a, int b) throws RemoteException {
        if (b == 0) throw new RemoteException("Division par zéro impossible !");
        return a / b;
    }
}