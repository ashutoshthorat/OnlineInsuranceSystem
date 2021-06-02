package com.bridgelabz.insurancesystem.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Entity
@Table(name = "insurance_details")
@Data
public class InsuranceCreateEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long Id;
	
//	@JsonIgnore()
//	@ManyToMany(cascade = CascadeType.ALL) 
//	private List<UserEntity> user;
	
	@ElementCollection
	@CollectionTable(name = "user_data" ,joinColumns = @JoinColumn(name = "Id"))
	@Column(name = "userid")
	private List<Long> userID;
	@ElementCollection
	@CollectionTable(name = "insurance_table" ,joinColumns = @JoinColumn(name = "Id"))
	@Column(name = "insuranceid")
	private List<Long> insuranceID;
//	@JsonIgnore()
//	@ManyToMany(cascade = CascadeType.ALL) 
//	private List<InsuranceCreateEntity> insurance;
	
	
}
