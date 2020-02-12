package headfirst.chapter18.listings.l4;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.HashMap;

public class ServiceServerImplementation extends UnicastRemoteObject implements ServiceServer {
    static Registry registry;

    static {
        try {
            registry = LocateRegistry.createRegistry(5000);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    HashMap<String, Service> serviceList;

    protected ServiceServerImplementation() throws RemoteException {
        setUpServices();
    }

    public static void main(String[] args) {
        try {
            registry.bind("ServiceServer", new ServiceServerImplementation());
        } catch (RemoteException | AlreadyBoundException e) {
            e.printStackTrace();
        }
        System.out.println("Remote service is running");
    }

    private void setUpServices() {
        serviceList = new HashMap<>();
        serviceList.put("Dice Rolling Service", new DiceRollingService());
        serviceList.put("Day of the Week Service", new DayOfTheWeekService());
        serviceList.put("Visual Music Service", new VisualMusicService());
    }

    @Override
    public Object[] getServiceList() throws RemoteException {
        System.out.println("in remote");
        return serviceList.keySet().toArray();
    }

    @Override
    public Service getService(Object serviceKey) throws RemoteException {
        return serviceList.get(serviceKey);
    }
}
