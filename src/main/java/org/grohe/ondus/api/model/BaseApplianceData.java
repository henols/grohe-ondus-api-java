package org.grohe.ondus.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeInfo(use = Id.NAME,
include = JsonTypeInfo.As.PROPERTY,
property = "type")
@JsonSubTypes({
@Type(value = SenseApplianceData.class, name = "101"),
@Type(value = SenseGuardApplianceData.class, name = "103"),
})
@EqualsAndHashCode(of = "applianceId")
public class BaseApplianceData {
    @JsonProperty("appliance_id")
    public String applianceId;
    @JsonProperty("type")
    public Integer type;
    @JsonIgnore
    public BaseAppliance appliance;

    public BaseApplianceData(String applianceId, BaseAppliance appliance, Integer type) {
        this.applianceId = applianceId;
        this.appliance = appliance;
		this.type = type;
    }

	public BaseApplianceData(Integer type) {
		this.type = type;
	}

	public String getApplianceId() {
		return applianceId;
	}

	public void setApplianceId(String applianceId) {
		this.applianceId = applianceId;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public BaseAppliance getAppliance() {
		return appliance;
	}

	public void setAppliance(BaseAppliance appliance) {
		this.appliance = appliance;
	}
	
}
