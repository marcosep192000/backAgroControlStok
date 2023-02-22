package com.v1.backAgro.models.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Provider {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "id", nullable = false)
	private Long id;
	private String companyName;
	private int cuit ;
	private String street;
	private String city;
	private String state;
	private String we;
	private String mail;
	private String contact;


}
