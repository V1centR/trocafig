package br.com.javaevan.controller;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import br.com.javaevan.service.StickerService;

@RestController
@RequestMapping("/test")
public class FigurinhasContoller {
	
//	@Autowired
//	StickerService stickerService;
	
	@GetMapping("/countrys")
	public String stikersPerCountry(@RequestBody String stickersCountry) {
		
//		String jsonData = jsonAuth.toString();
		
		//stickerService.findAll();
		
//		System.out.println("REQUEST:::" + stickersCountry);
//		
//		
//		JSONObject response = new JSONObject(stickerService.findAll());
//		
//		System.out.println(response);
		
		
		
		return "{\"test\" : \"ok\"}";
		
	}
	
	@GetMapping("/sticker")
	public String stikersPerCode(@RequestBody String stickerCode) {
		
		// hash test DEdU6kqlbuoVF6I75vXv
		
//		String jsonData = jsonAuth.toString();
//		JSONObject loginData = new JSONObject(jsonData);
		
		return "";
		
	}

}
