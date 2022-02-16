package URL;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;
import java.util.Scanner;

public class URLApp {

    // URL de prueba
    // https://www.escuelaing.edu.co:80/es?resource=ofertas/"
    public static void main(String[] args) throws Exception {
        System.out.println("Ingrese una URL:");
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        try {
            URL urlInput = new URL(input);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlInput.openStream()));
        } catch (MalformedURLException e) {
            System.out.println("La URL ingresada está malformada");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
