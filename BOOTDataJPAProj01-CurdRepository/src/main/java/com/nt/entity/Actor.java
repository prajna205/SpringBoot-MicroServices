package com.nt.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="DATA_JPA_ACTOR")
@Data
public class Actor {
	@Column(name="Actor_Id")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer aid;
	@Column(name="Actor_Name",length = 20)
	private String aname;
	@Column(name="Actor_category",length = 20)
	private String category;
	@Column(name="Mobile_No")
	private long mobNo;
}
