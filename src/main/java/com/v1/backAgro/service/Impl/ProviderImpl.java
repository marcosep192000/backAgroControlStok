package com.v1.backAgro.service.Impl;

import com.v1.backAgro.models.dto.ProviderDto;
import com.v1.backAgro.models.entity.Provider;
import com.v1.backAgro.models.mappers.ProviderMappers;
import com.v1.backAgro.repository.ProviderRepository;
import com.v1.backAgro.service.IProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProviderImpl implements IProvider {
	@Autowired
	ProviderRepository repository;
	@Autowired
	ProviderMappers mappers;
	@Override
	public void  create(ProviderDto providerDto) {
		Provider provider = repository.save(mappers.toProvider(providerDto));
	}
	@Override
	public List<Provider> AllProviders() {
		return repository.findAll();
	}

}
