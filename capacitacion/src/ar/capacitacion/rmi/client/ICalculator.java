package ar.capacitacion.rmi.client;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * @author dan
 * 
 */
public interface ICalculator extends Remote {

	long addition(long a, long b) throws RemoteException;

	long subtraction(long a, long b) throws RemoteException;;

	long multiplication(long a, long b) throws RemoteException;;

	long division(long a, long b) throws RemoteException;;

}
