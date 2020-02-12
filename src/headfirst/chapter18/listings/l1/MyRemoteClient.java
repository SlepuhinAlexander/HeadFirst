package headfirst.chapter18.listings.l1;


import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class MyRemoteClient {
    public static void main(String[] args) {
        new MyRemoteClient().go();
    }

    public void go() {
        try {
            MyRemote service = (MyRemote) LocateRegistry.getRegistry(5000).lookup("Remote_Hello");
            String s = service.sayHello();
            System.out.println(s);
        } catch (RemoteException | NotBoundException e) {
            e.printStackTrace();
        }
    }
}
