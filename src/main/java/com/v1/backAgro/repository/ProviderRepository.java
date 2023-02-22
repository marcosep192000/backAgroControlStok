package com.v1.backAgro.repository;

import com.v1.backAgro.models.dto.ProviderDto;
import com.v1.backAgro.models.entity.Provider;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProviderRepository extends JpaRepository<Provider, Long> {




}