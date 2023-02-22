package com.v1.backAgro.models.mappers;

import com.v1.backAgro.models.dto.ProviderDto;
import com.v1.backAgro.models.entity.Provider;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

import java.sql.ClientInfoStatus;
import java.util.List;
@Mapper(componentModel = "spring")
public interface ProviderMappers {

		ProviderDto toProviderDto(Provider provider);
		Provider toProvider(ProviderDto providerDto);
		List<ProviderDto> listToProvider (List<Provider> providerList);



		@BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
		void updateProvider(ProviderDto providerDto, @MappingTarget Provider provider);


}
