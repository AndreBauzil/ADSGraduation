import java.rmi.*;

/**
 * Iclient
 */
public interface Iclient extends Remote {
    public void enviaMsg(String str) throws RemoteException;
}