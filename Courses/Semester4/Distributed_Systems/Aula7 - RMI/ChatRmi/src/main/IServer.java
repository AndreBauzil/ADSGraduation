import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IServer extends Remote{
	public void enviarMsg(String s) throws RemoteException;
	public void enviarRefClient(IClient c) throws RemoteException;
}