package ca.httpbrainvision.brainvision.retrofit;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Jesse on 2016-10-03.
 */
public class customAdapter {

    public static final String BASE_URL = "https://api.acrossor.com/";
    //  public static final String BASE_URL = "http://api.dev.acrossor.com/";


        static OkHttpClient httpClient = new OkHttpClient();
        static  Gson gson = new GsonBuilder()
                .setDateFormat("yyyy'-'MM'-'dd'T'HH':'mm':'ss'.'SSS'Z'")
                .create();
         static Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .client(httpClient)
                .build();

    private static services public_apiservice = retrofit.create(services.class);


    public static services  get_publicAPI( ){
        return public_apiservice;
    }
}
