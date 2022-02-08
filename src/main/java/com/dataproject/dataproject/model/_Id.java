package com.dataproject.dataproject.model;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Document
@Data
@AllArgsConstructor @NoArgsConstructor @ToString
public class _Id {
	
	private String $oid;
	
	public _Id() {}
	
	public _Id(String $oid) {
		this.$oid = $oid;
	}

	@Override
	public String toString() {
		return "_Id [$oid=" + $oid + "]";
	}

	public String get$oid() {
		return $oid;
	}

	public void set$oid(String $oid) {
		this.$oid = $oid;
	}
	
	

}
