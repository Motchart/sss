package core;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.ResponseBody;

public class Get {
	public static void main(String[] args) throws Exception{
		OkHttpClient client = new OkHttpClient();
		Request request = new Request.Builder().url("http://localhost:8888/api/ip").get().build();
		ResponseBody response = client.newCall(request).execute().body();
		System.out.println(response.string());
	}
}