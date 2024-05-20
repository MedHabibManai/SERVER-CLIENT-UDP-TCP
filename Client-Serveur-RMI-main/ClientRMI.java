import java.rmi.*;

public class StringConversionClient {
    public static void main(String args[]) {
        try {
            StringConversion stub = (StringConversion) Naming.lookup("rmi://localhost/StringConversionServer");
            String result = stub.convertToUpperCase("hello world");
            System.out.println("Résultat de la conversion : " + result);
        } catch (Exception e) {
            System.out.println("Erreur : " + e);
        }
    }
}
