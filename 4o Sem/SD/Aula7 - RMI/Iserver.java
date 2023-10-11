
import java.rmi.*;

/**
 * Iserver
 */
public interface Iserver extends Remote {
    public void enviaParaServidor(String str) throws RemoteException;
    public void enviarRefParaServidor(Iclient client) throws RemoteException;
    
}