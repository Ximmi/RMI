
import java.io.IOException;
import java.rmi.NotBoundException;

public class RMIClientMain {

    public static void main(String[] args) {
        try {
            RmiCommunicationClient wsc = new RmiCommunicationClient();

            int suma = wsc.getSuma(1, 1);
            int resta = wsc.getResta(1, 1);
            int mult = wsc.getMultiplicacion(1, 1);
            int div = wsc.getDivision(1, 1);
            System.out.println(" resultado de la suma por el servidor: " + suma);
            System.out.println(" resultado de la resta por el servidor: " + resta);
            System.out.println(" resultado de la multiplicacion por el servidor: " + mult);
            System.out.println(" resultado de la division por el servidor: " + div);

        } catch (NotBoundException | IOException ex) {
            System.err.println("Connection error the server is not responding.");
        }
    }
}
