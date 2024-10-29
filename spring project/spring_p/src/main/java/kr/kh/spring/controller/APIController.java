package kr.kh.spring.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class APIController {
	
	@GetMapping("/api/test")
	public String apiTest() {
		
		return "/apiTest";
	}
	
	private static final String serviceKey = "yokZLTATxLSYExFfHZfEWjWDoB6g9Q0fIcgD3rXjIO0bvc7AB5H5QIDdggjBlOqvGMj7ouM7SWGAU24hcvDOEQ%3D%3D";
	
	@ResponseBody
	@PostMapping(value="/api/test", produces="application/text; charset=UTF-8;")
	public String tsunamiShelter() throws IOException {
       
		System.out.println("controller call");
       
        String strSrch = "3";
        String resultType = "json";
        String url = "http://ws.bus.go.kr/api/rest/busRouteInfo/getBusRouteList"
                    + "?serviceKey=" + serviceKey
                    + "&strSrch=" + strSrch
                    + "&resultType=" + resultType;
        
		URL requestUrl = new URL(url);
		HttpURLConnection urlConnection = (HttpURLConnection) requestUrl.openConnection();
		urlConnection.setRequestMethod("GET");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
		String responseText = "";
		String line;
		while ((line = br.readLine()) != null) {
		    responseText += line;
		}
		br.close();
		urlConnection.disconnect();
		
		return "testApi";
	}
}
