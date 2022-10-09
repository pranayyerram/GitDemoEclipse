package _9_BrokenLinks;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class VerifyBrokenLink {
	
	int validLink = 0;
	int invalidLink = 0;
	
	public void verifyBrokenLinks(String LinkURL) {
		try {
			URL url=new URL(LinkURL);
			HttpURLConnection httpConnect=(HttpURLConnection) url.openConnection();
			httpConnect.connect();
			
			int resCode=httpConnect.getResponseCode();
			
			if(resCode>=400) {
				System.out.println(LinkURL+" is a broken link --- "+httpConnect.getResponseMessage()+" --- "+httpConnect.getResponseCode());
				invalidLink +=1;
			}
			else {
				System.out.println(LinkURL+" is a valid link --- "+httpConnect.getResponseMessage()+" --- "+httpConnect.getResponseCode());
				validLink +=1;
			}
			
			httpConnect.disconnect();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
}
