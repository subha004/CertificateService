package com.subha.CertificateService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class CertificateService {

	@Autowired
	private CertificateRepository repo;

	// Inserting a Record
	public void save(Certificate cert) 
	{
		repo.save(cert);
	}
}
