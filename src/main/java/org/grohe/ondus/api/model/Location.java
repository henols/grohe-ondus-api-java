package org.grohe.ondus.api.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@JsonIgnoreProperties(ignoreUnknown = true)
@EqualsAndHashCode(of = "id")
public class Location {
    public int id;
    public String name;
    public int type;
    public String role;
    public String timezone;
    @JsonProperty("emergency_shutdown_enable")
    public boolean emergencyShutdownEnable;
    public Address address;

    public Location() {
    }

    public Location(int id) {
        this.id = id;
    }


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getTimezone() {
		return timezone;
	}

	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}

	public boolean isEmergencyShutdownEnable() {
		return emergencyShutdownEnable;
	}

	public void setEmergencyShutdownEnable(boolean emergencyShutdownEnable) {
		this.emergencyShutdownEnable = emergencyShutdownEnable;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
    
}
