package com.dataproject.dataproject.model;

import java.math.BigInteger;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;




@Document("test_collection")
@Getter @Setter
@AllArgsConstructor @NoArgsConstructor @ToString
public class Data{
	
    @Id
    private BigInteger id;
    private _Id $oid;
    private MyData data;
    
    
    
	public Data(BigInteger id, MyData data, _Id $oid) {
		super();
		this.id = id;
		this.$oid = $oid;
		this.data = data;

	}

    
    public BigInteger getId() {
		return id;
	}
	public void setId(BigInteger id) {
		this.id = id;
	}


	public MyData getData() {
		return data;
	}


	public void setData(MyData data) {
		this.data = data;
	}


	public _Id get$oid() {
		return $oid;
	}


	public void set$oid(_Id $oid) {
		this.$oid = $oid;
	}
	
	
	



	
	



}
