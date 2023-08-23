package Retos;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class Reto2ConsumoApi {

    public static void main(String[] args) {
        try {
            //solicitar una peticion -- https://http.dog/101.json
            URL url = new URL("https://http.dog/101.json");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.connect();

            //peticion correcta?

            int responseCode = connection.getResponseCode();
            if (responseCode != 200) {
                throw new RuntimeException("Ocurrio un error al conectarse a la API" + responseCode);
            } else {
                StringBuilder infoStringBuilder = new StringBuilder();
                Scanner scanner = new Scanner(url.openStream());

                while (scanner.hasNext()) {
                    infoStringBuilder.append(scanner.nextLine());
                }
                scanner.close();
                System.out.println(infoStringBuilder);
            }
        }
        catch (Exception excep) {
            excep.printStackTrace();
        }


        //Abrir scanner

        //print datos
    }
}
