package headfirst.chapter18.listings.l4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.util.Arrays;

public class ServiceBrowser {
    private JPanel mainPanel;
    private JComboBox<Object> serviceList;
    private ServiceServer server;

    public static void main(String[] args) {
        new ServiceBrowser().buildGUI();
    }

    public void buildGUI() {
        JFrame frame = new JFrame("RMI Browser");
        mainPanel = new JPanel();
        frame.getContentPane().add(BorderLayout.CENTER, mainPanel);
        serviceList = new JComboBox<>(getServicesList());
        frame.getContentPane().add(BorderLayout.NORTH, serviceList);
        serviceList.addActionListener(new MyListListener());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(700, 250, 500, 500);
        frame.setVisible(true);
    }

    private void loadService(String serviceSelection) {
        try {
            Service service = server.getService(serviceSelection);
            mainPanel.removeAll();
            mainPanel.add(service.getGuiPanel());
            mainPanel.validate();
            mainPanel.repaint();
        } catch (RemoteException e) {
            e.printStackTrace();
        }

    }

    private Object[] getServicesList() {
        Object[] services = null;
        try {
            server = (ServiceServer) LocateRegistry.getRegistry(5000).lookup("ServiceServer");
        } catch (RemoteException | NotBoundException | ClassCastException e) {
            e.printStackTrace();
        }
        try {
            assert server != null;
            services = server.getServiceList();
        } catch (RemoteException | ClassCastException | NullPointerException e) {
            e.printStackTrace();
        }
        return services;
    }

    private class MyListListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            String selection = (String) serviceList.getSelectedItem();
            loadService(selection);
        }
    }
}
