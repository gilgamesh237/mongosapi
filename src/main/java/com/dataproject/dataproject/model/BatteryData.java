package com.dataproject.dataproject.model;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.Data;


@Document
@Data
@AllArgsConstructor @NoArgsConstructor @ToString
public class BatteryData {

	private double voltage;
    private double outputVoltage;
    
	public BatteryData(double voltage, double outputVoltage) {
		super();

		this.voltage = voltage;
		this.outputVoltage = outputVoltage;
    }

	@Override
	public String toString() {
		return "BatteryData [voltage=" + voltage + ", outputVoltage=" + outputVoltage + "]";
	}

	public double getVoltage() {
		return voltage;
	}
	public void setVoltage(double voltage) {
		this.voltage = voltage;
	}
	public double getOutputVoltage() {
		return outputVoltage;
	}
	public void setOutputVoltage(double outputVoltage) {
		this.outputVoltage = outputVoltage;
	}


}
