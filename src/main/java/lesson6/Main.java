package lesson6;


import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;


public class Main {
        public static void main(String[] args) throws IOException {
            URLConnection urlConnection = new URL("http://dataservice.accuweather.com/forecasts/v1/daily/5day/295212?apikey=mB5zlqw9aR1eAABssRFEVyGriW2GmSEH&metric=true").openConnection();

            try (InputStream inputStream = urlConnection.getInputStream();) {
                int c;
                while ((c = inputStream.read()) != -1) {
                    System.out.print((char) c);
                }
            }

            System.out.println();
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++");


        }
}
