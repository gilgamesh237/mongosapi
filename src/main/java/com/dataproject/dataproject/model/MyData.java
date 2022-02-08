package com.dataproject.dataproject.model;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Document
@Data
@AllArgsConstructor @NoArgsConstructor @ToString
public class MyData {
	
	private BatteryData batteryData;
    private Module_1 module_1;
    private Time time;
    
    public MyData(BatteryData batteryData, Module_1 module_1, Time time) {
		super();
		this.batteryData = batteryData;
		this.module_1 = module_1;
		this.time = time;
	}

	@Override
	public String toString() {
		return "MyData [batteryData=" + batteryData + ", module_1=" + module_1 + ", time=" + time + "]";
	}

	public BatteryData getBatteryData() {
		return batteryData;
	}

	public void setBatteryData(BatteryData batteryData) {
		this.batteryData = batteryData;
	}

	public Module_1 getModule_1() {
		return module_1;
	}

	public void setModule_1(Module_1 module_1) {
		this.module_1 = module_1;
	}

	public Time getTime() {
		return time;
	}

	public void setTime(Time time) {
		this.time = time;
	}
    
    

}
