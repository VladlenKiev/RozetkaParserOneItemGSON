import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by admin on 07.06.2017.
 */
public class Parser {
    public static ItemJSON getGSON(String cod){
        String query="http://rozetka.com.ua/recent_recommends/action=getGoodsDetailsJSON/?goods_ids="+cod;
        String line;
        ItemJSON itemJSON=new ItemJSON();
        Gson gson = new GsonBuilder().create();
        HttpURLConnection httpURLConnection=responseHTTP(query);
        BufferedReader br= null;

        try {
            br = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));

            while ((line=br.readLine())!=null) {
                itemJSON=gson.fromJson(line,ItemJSON.class);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return itemJSON;
    }

    private static HttpURLConnection responseHTTP(String query){
        try {
            HttpURLConnection httpURLConnection =(HttpURLConnection) new URL(query).openConnection();
            return httpURLConnection;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
