import java.rmi.*;
import java.rmi.registry.*;
import java.rmi.server.*;
import java.util.*;

public class Server extends UnicastRemoteObject implements Iserver {
    private Iclient client;

    public Server() throws RemoteException {
        try {
            LocateRegistry.createRegistry(Registry.REGISTRY_PORT);
            Naming.bind("rmi://127.0.0.1/ObjetoRemoto", this);
            Scanner s = new Scanner(System.in);
            while(true){
                String str = s.nextLine();
                client.enviaMsg(str);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enviaParaServidor(String str) throws RemoteException {
        System.out.println(str);
    }
    public void enviarRefParaServidor(Iclient client) throws RemoteException {
        this.client = client;
    }
    
    // Main
    public static void main(String[] args) {
        try {
            Server s = new Server();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}