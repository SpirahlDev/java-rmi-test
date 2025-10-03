package com.school.middleware.td.Banque;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.Connection;

public class BanqueServiceImpl extends UnicastRemoteObject implements BanqueService{

    Connection con;

    protected BanqueServiceImpl() throws RemoteException {
        super();
        //TODO Auto-generated constructor stub
    }

    @Override
    public double getSolde(String accountNumber) throws RemoteException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getSolde'");
    }

    @Override
    public void deposer(String accountNumber, double montant) throws RemoteException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deposer'");
    }
    
}
