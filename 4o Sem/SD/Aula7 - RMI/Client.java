import java.rmi.*;
import java.rmi.server.*;
import java.util.Scanner;

public class Client extends UnicastRemoteObject implements Iclient {
    private Iserver server;
    
    public Client() throws RemoteException {
        try {
            server = (Iserver) Naming.lookup("rmi://127.0.0.1/ObjetoRemoto");
            server.enviarRefParaServidor(this);

            Scanner s = new Scanner(System.in);
            while(true){
                String str = s.nextLine();
                server.enviaParaServidor(str);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enviaMsg(String str) throws RemoteException {
        System.out.println(str);
    }
    
    public static void main(String[] args) {
        try {
            Client c = new Client();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
