package com.v1.backAgro.repository;

import com.v1.backAgro.models.entity.Provider;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProviderRepository extends JpaRepository<Provider, Long> {
}