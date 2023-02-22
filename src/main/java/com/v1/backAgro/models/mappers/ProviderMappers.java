package com.v1.backAgro.models.mappers;

import com.v1.backAgro.models.dto.ProviderDto;
import com.v1.backAgro.models.entity.Provider;
import org.mapstruct.Mapper;

import java.util.List;
@Mapper(componentModel = "spring")
public interface ProviderMappers {

		ProviderDto toProviderDto(Provider provider);
		Provider toProvider(ProviderDto providerDto);
		List<ProviderDto> listToProvider (List<Provider> providerList);



}
