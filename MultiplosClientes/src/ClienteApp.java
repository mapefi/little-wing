import java.io.IOException;
import java.net.UnknownHostException;

public class ClienteApp {
    public static void main(String[] args) throws UnknownHostException,
            IOException {
        // dispara cliente
        new Cliente("127.0.0.1", 12345).executa();
    }
}