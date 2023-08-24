package com.rutuj;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

public class IntroToGradle {
    public static void main(String[] args) {
        Request request = new Request.Builder().url("https://jsonplaceholder.typicode.com/posts/2").build();
        try{
            OkHttpClient client = new OkHttpClient();
            Response response = client.newCall(request).execute();
            System.out.println(response.body().toString());
        } catch (IOException exception){
            exception.printStackTrace();
        }
    }
}
