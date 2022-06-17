package com.usman.controller;

import java.net.URI;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RedirectController {

	
	@GetMapping("/ZeeNews")
	public ResponseEntity<Object> getZeeNew() {
		
		
		return ResponseEntity.status(HttpStatus.FOUND).location(URI.create("https://zeenews.india.com/")).build() ;
		
		
	}
	
	
	@GetMapping("/Zee5")
	public ResponseEntity<Object> getZee5() {
		
		
		return ResponseEntity.status(HttpStatus.FOUND).location(URI.create("https://www.zee5.com/?utm_source=GoogleSearch&utm_medium=Mark_CPA&utm_campaign=Search_SVOD_ZEE5-Brand-ZEE5-Only-Ex-Performance&utm_term=zee%205&utm_content=Brand-ZEE5-Only-Ex-ETA&gclid=Cj0KCQjwzLCVBhD3ARIsAPKYTcTlDXShnSgOgOkyvKN-1WGKNhObl3uz3RLO9QQ8NZIYK1Vjw6PbPk4aAlYcEALw_wcB&gclsrc=aw.ds")).build() ;
		
		
	}
	
	
	@GetMapping("/ZeeC")
	public ResponseEntity<Object> getCorporate() {
		
		
		return ResponseEntity.status(HttpStatus.FOUND).location(URI.create("https://www.zee.com/")).build() ;
		
		
	}
	
	@GetMapping("/ZeeSports")
	public ResponseEntity<Object> getSports() {
		
		
		return ResponseEntity.status(HttpStatus.FOUND).location(URI.create("https://www.espn.in/")).build() ;
		
		
	}
	
	
	
	
}
