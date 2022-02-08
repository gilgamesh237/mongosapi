package com.dataproject.dataproject.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Document
@Data
@AllArgsConstructor @NoArgsConstructor @ToString
public class Time {
	
	@DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss") 
    private Date date;
	
	public Time() {}
	
	public Time(Date date) {
		super();
		this.date = date;
	}


	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Time [time=" + date + "]";
	}
	
	

}
