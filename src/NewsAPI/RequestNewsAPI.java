package NewsAPI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;


class RequestNewsAPI {

	private String apiKey;
	
	public RequestNewsAPI() {
		// TODO Auto-generated constructor stub
		apiKey = "d3c316bbacc14785bb044d3993630980";		
		
	}
	
	public String GetNews(String params) throws IOException {
		
		String resp = "";
        
		URL newsAPI = new URL("https://newsapi.org/v2/" + params+"&apiKey="+apiKey);

		URLConnection newsConnection = newsAPI.openConnection();
	
		System.out.println(newsAPI.getFile());
		
		newsConnection.setConnectTimeout(5000); 
		newsConnection.setReadTimeout(5000);
     	      
		newsConnection.setRequestProperty("Content-Type", "application/json");
     	 
		BufferedReader in = new BufferedReader(new InputStreamReader(newsConnection.getInputStream()));
		      
		resp = in.readLine();
		        
		in.close();
		        
		return resp;
	}

}
