package com.v1.backAgro.models.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProviderDto {
		private String companyName;
		private int cuit ;
		private String street;
		private String city;
		private String state;
		private String we;
		private String mail;
		private String contact;
}
