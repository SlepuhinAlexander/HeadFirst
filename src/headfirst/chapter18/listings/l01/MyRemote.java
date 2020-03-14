package headfirst.chapter18.listings.l01;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MyRemote extends Remote {
    String sayHello() throws RemoteException;
}
