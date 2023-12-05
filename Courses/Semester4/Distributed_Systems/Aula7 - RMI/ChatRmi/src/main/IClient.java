import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IClient extends Remote{
	public void enviarMsg(String s) throws RemoteException;
}