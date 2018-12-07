package org.grohe.ondus.api.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SenseApplianceData extends BaseApplianceData {
    @JsonProperty("data")
    public Data data;

    public SenseApplianceData() {
        super(SenseAppliance.TYPE);
    }
    public SenseApplianceData(String applianceId, BaseAppliance appliance) {
    	super(applianceId, appliance, SenseAppliance.TYPE);
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
        @JsonProperty("temperature")
        public Float temperature;
        @JsonProperty("humidity")
        public Float humidity;
		public String getTimestamp() {
			return timestamp;
		}
		public void setTimestamp(String timestamp) {
			this.timestamp = timestamp;
		}
		public Float getTemperature() {
			return temperature;
		}
		public void setTemperature(Float temperature) {
			this.temperature = temperature;
		}
		public Float getHumidity() {
			return humidity;
		}
		public void setHumidity(Float humidity) {
			this.humidity = humidity;
		}
        
    }
}
