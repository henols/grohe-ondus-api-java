package org.grohe.ondus.api.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

public class SenseAppliance extends BaseAppliance {
    public static final int TYPE = 101;

    private Config config;

    public SenseAppliance() {
        super(TYPE);
    }
    public SenseAppliance(String applianceId, Room inRoom) {
    	super(applianceId, inRoom, TYPE);
    }

    public Config getConfig() {
		return config;
	}
    public void setConfig(Config config) {
		this.config = config;
	}
    
    @JsonIgnoreProperties(ignoreUnknown = true)
    public class Config {
        private List<Threshold> thresholds = null;
        public List<Threshold> getThresholds() {
			return thresholds;
		}
        
        public void setThresholds(List<Threshold> thresholds) {
			this.thresholds = thresholds;
		}
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Threshold {
        @JsonProperty("quantity")
        private String quantity;
        @JsonProperty("type")
        private String type;
        @JsonProperty("value")
        private Integer value;
        @JsonProperty("enabled")
        private Boolean enabled;
		public String getQuantity() {
			return quantity;
		}
		public void setQuantity(String quantity) {
			this.quantity = quantity;
		}
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
		public Integer getValue() {
			return value;
		}
		public void setValue(Integer value) {
			this.value = value;
		}
		public Boolean getEnabled() {
			return enabled;
		}
		public void setEnabled(Boolean enabled) {
			this.enabled = enabled;
		}
        
    }
}
