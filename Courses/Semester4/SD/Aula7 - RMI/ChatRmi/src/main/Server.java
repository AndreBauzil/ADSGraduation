import java.util.Scanner;
import java.rmi.*;
import java.rmi.server.*;
import java.rmi.registry.*;
import java.io.*;

public class Server extends UnicastRemoteObject implements IServer{
	private IClient client;
	final static String HOST_URL = "rmi://127.0.0.1/RefObjetoRemoto";
	public Server() throws RemoteException{
		try{
			System.setProperty("java.rmi.server.hostname","127.0.0.1");
			LocateRegistry.createRegistry(Registry.REGISTRY_PORT);
			Naming.bind(HOST_URL, this);
			Scanner s = new Scanner(System.in);
			while(true){
				String string = s.nextLine();
				client.enviarMsg(string);
			}

		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	public static void main(String args[]){
		try{
			Server server = new Server();		
		}
		catch(Exception e){
			
		}
		
	}
	public void enviarMsg(String s) throws RemoteException{
		System.out.println(s);
	}
	public void enviarRefClient(IClient c) throws RemoteException{
		this.client = c;
	}
}