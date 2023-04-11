package com.nt.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "DATA_JPA_ACCOUNT")
public class Account {
	@Id
	private Long acno;
	private String holdername;
	private Double amount;
}
