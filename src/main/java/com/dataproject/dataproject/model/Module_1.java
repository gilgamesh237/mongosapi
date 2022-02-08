package com.dataproject.dataproject.model;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.Data;


@Document
@Data
@AllArgsConstructor @NoArgsConstructor @ToString
public class Module_1 {

	
	//private long id;
	
	private double modulesn;
    private double current;
    private double soh;
    private double soc;
    private double temperature_sensor;
    private double temperature_uc;
    
	public Module_1(
			double modulesn, 
			double current, 
			double soh, 
			double soc, 
			double temperature_sensor, 
			double temperature_uc) 
	{
	super();
		this.modulesn = modulesn;
		this.current = current;
		this.soh = soh;
		this.soc = soc;
		this.temperature_sensor = temperature_sensor;
		this.temperature_uc = temperature_uc;
	}
    
	
	

	public double getModulesn() {
		return modulesn;
	}
	public void setModulesn(double modulesn) {
		this.modulesn = modulesn;
	}
	public double getCurrent() {
		return current;
	}
	public void setCurrent(double current) {
		this.current = current;
	}
	public double getSoh() {
		return soh;
	}
	public void setSoh(double soh) {
		this.soh = soh;
	}
	public double getSoc() {
		return soc;
	}
	public void setSoc(double soc) {
		this.soc = soc;
	}
	public double getTemperature_sensor() {
		return temperature_sensor;
	}
	public void setTemperature_sensor(double temperature_sensor) {
		this.temperature_sensor = temperature_sensor;
	}
	public double getTemperature_uc() {
		return temperature_uc;
	}
	public void setTemperature_uc(double temperature_uc) {
		this.temperature_uc = temperature_uc;
	}


}
