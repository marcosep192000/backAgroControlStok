package com.v1.backAgro.service;

import com.v1.backAgro.models.dto.ProviderDto;
import com.v1.backAgro.models.entity.Provider;

import java.util.List;

public interface IProvider {
	void create(ProviderDto providerDto);
	List<ProviderDto> AllProviders();
	void   update(ProviderDto providerDto,Long id);
}
