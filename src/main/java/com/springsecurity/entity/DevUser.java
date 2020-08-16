package com.springsecurity.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="transaction")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class DevUser {

	@Id
	@GeneratedValue
	int userId;
	int invoiceId;
	String invoiceDate;
	double amount;
}
