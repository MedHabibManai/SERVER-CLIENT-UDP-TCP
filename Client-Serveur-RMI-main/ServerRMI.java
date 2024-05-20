import java.rmi.*;
import java.rmi.server.*;

public class StringConversionServer extends UnicastRemoteObject implements StringConversion {
    public StringConversionServer() throws RemoteException {
        super();
    }

    @Override
    public String convertToUpperCase(String str) throws RemoteException {
        return str.toUpperCase();
    }

    public static void main(String args[]) {
        try {
            StringConversionServer obj = new StringConversionServer();
            Naming.rebind("StringConversionServer", obj);
            System.out.println("Serveur RMI prêt.");
        } catch (Exception e) {
            System.out.println("Erreur : " + e);
        }
    }
}
