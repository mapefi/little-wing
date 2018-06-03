import java.io.IOException;

public class ServidorApp {
    public static void main(String[] args) throws IOException {
        new Servidor(12345).executa();
    }
}