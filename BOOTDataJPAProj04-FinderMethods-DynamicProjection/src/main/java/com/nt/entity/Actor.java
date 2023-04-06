package com.nt.entity;

import org.hibernate.annotations.DynamicInsert;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name="DATA_JPA_ACTOR")
@Data
@AllArgsConstructor
@RequiredArgsConstructor
@NoArgsConstructor
//@DynamicInsert(true)
public class Actor {
	@Column(name="Actor_Id")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer aid;
	@Column(name="Actor_Name",length = 20)
	@NonNull
	private String aname;
	@Column(name="Actor_category",length = 20)
	@NonNull
	private String category;
	@Column(name="Mobile_No")
	@Transient
	@NonNull
	private Long mobileNo;
}
