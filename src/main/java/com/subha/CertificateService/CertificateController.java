package com.subha.CertificateService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CertificateController {

	@Autowired
	private CertificateService service;
	
	@PostMapping("/certificateservice")
	public void add(@RequestBody Certificate cert)
	{
		service.save(cert);
	}
}
