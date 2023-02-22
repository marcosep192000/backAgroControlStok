package com.v1.backAgro.controller;

import com.v1.backAgro.models.dto.ProviderDto;
import com.v1.backAgro.service.Impl.ProviderImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/provider")
public class providerController {
	@Autowired
	ProviderImpl repository ;
@GetMapping("/all-provider")
	ResponseEntity<ProviderDto>allProvider()
{

	return new ResponseEntity(repository.AllProviders(), HttpStatus.ACCEPTED);

}
	@PostMapping("/create-provider")
    public 	ResponseEntity<?> createProvider( @Valid  @RequestBody ProviderDto providerDto)
	{
		 repository.create(providerDto);

		return new ResponseEntity("gurardad", HttpStatus.ACCEPTED);

	}
}
