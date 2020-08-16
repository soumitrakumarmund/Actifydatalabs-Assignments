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
@Table(name="business")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class BusinessUser {

	@Id
	@GeneratedValue
	int id;
	String YTD;
	String MTD;
}
