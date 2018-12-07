package org.grohe.ondus.api.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SenseGuardApplianceData extends BaseApplianceData {
    @JsonProperty("data")
    public Data data;

    public SenseGuardApplianceData() {
        super( SenseGuardAppliance.TYPE);
    }
    
    public SenseGuardApplianceData(String applianceId, BaseAppliance appliance) {
    	super(applianceId, appliance, SenseGuardAppliance.TYPE);
    }

    
    public Data getData() {
		return data;
	}
    
    public void setData(Data data) {
		this.data = data;
	}
    
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Data {
        @JsonProperty("measurement")
        public List<Measurement> measurement = null;
        public List<Measurement> getMeasurement() {
			return measurement;
		}
        
        public void setMeasurement(List<Measurement> measurement) {
			this.measurement = measurement;
		}
    }

    @Getter
    @Setter
    @NoArgsConstructor
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Measurement {
        @JsonProperty("timestamp")
        public String timestamp;
        @JsonProperty("flowrate")
        public Integer flowrate;
        @JsonProperty("pressure")
        public Float pressure;
        @JsonProperty("temperature_guard")
        public Float temperatureGuard;
		public String getTimestamp() {
			return timestamp;
		}
		public void setTimestamp(String timestamp) {
			this.timestamp = timestamp;
		}
		public Integer getFlowrate() {
			return flowrate;
		}
		public void setFlowrate(Integer flowrate) {
			this.flowrate = flowrate;
		}
		public Float getPressure() {
			return pressure;
		}
		public void setPressure(Float pressure) {
			this.pressure = pressure;
		}
		public Float getTemperatureGuard() {
			return temperatureGuard;
		}
		public void setTemperatureGuard(Float temperatureGuard) {
			this.temperatureGuard = temperatureGuard;
		}
        
    }
}
