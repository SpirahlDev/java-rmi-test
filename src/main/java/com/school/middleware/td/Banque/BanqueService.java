package com.school.middleware.td.Banque;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface BanqueService extends Remote{

    double getSolde(String accountNumber) throws RemoteException;
    void deposer(String accountNumber, double montant) throws RemoteException;
}
