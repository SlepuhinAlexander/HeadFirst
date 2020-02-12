package headfirst.chapter18.listings.l1;


import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {
    public MyRemoteImpl() throws RemoteException {
    }

    public static void main(String[] args) {
        try {
            MyRemote service = new MyRemoteImpl();
            Registry registry = LocateRegistry.createRegistry(5000);
            registry.bind("Remote_Hello", service);
        } catch (RemoteException | AlreadyBoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String sayHello() throws RemoteException {
        return "Server says 'hello'";
    }
}