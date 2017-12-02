package Exercise11.TEST;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class aaa {
    public static void main(String[] args) throws IOException {

        String url = "http://www.nbrb.by/API/ExRates/Rates?Periodicity=0";

        URL obj = new URL(url);
        HttpURLConnection connection = (HttpURLConnection) obj.openConnection();

        connection.setRequestMethod("GET");

        BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();
        String s = response.toString();

        System.out.println(s);


        String pattern = "\\b[145]\\b";
        String text = s;
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(text);
        while (m.find()){
            System.out.print(m.group());

        }


    }
}
