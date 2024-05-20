import java.rmi.*;

public interface StringConversion extends Remote {
    public String convertToUpperCase(String str) throws RemoteException;
}
