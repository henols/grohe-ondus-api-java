package org.grohe.ondus.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@JsonIgnoreProperties(ignoreUnknown = true)
@EqualsAndHashCode(of = "applianceId")
public class ApplianceCommand {
	@JsonProperty("appliance_id")
	public String applianceId;
	public Integer type;
	public Command command;
	@JsonIgnore
	private SenseGuardAppliance appliance = new SenseGuardAppliance();

	public ApplianceCommand() {
	}

	public ApplianceCommand(SenseGuardAppliance forAppliance) {
		this.appliance = forAppliance;
		this.applianceId = forAppliance.getApplianceId();
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

	public Command getCommand() {
		return command;
	}

	public void setCommand(Command command) {
		this.command = command;
	}

	public SenseGuardAppliance getAppliance() {
		return appliance;
	}

	public void setAppliance(SenseGuardAppliance appliance) {
		this.appliance = appliance;
	}

	@JsonIgnoreProperties(ignoreUnknown = true)
	public static class Command {
		@JsonProperty("measure_now")
		public Boolean measureNow;
		@JsonProperty("buzzer_on")
		public Boolean buzzerOn;
		@JsonProperty("buzzer_sound_profile")
		public Integer buzzerSoundProfile;
		@JsonProperty("valve_open")
		public Boolean valveOpen;
		@JsonProperty("temp_user_unlock_on")
		public Boolean tempUserUnlockOn;

		public Boolean getMeasureNow() {
			return measureNow;
		}

		public void setMeasureNow(Boolean measureNow) {
			this.measureNow = measureNow;
		}

		public Boolean getBuzzerOn() {
			return buzzerOn;
		}

		public void setBuzzerOn(Boolean buzzerOn) {
			this.buzzerOn = buzzerOn;
		}

		public Integer getBuzzerSoundProfile() {
			return buzzerSoundProfile;
		}

		public void setBuzzerSoundProfile(Integer buzzerSoundProfile) {
			this.buzzerSoundProfile = buzzerSoundProfile;
		}

		public Boolean getValveOpen() {
			return valveOpen;
		}

		public void setValveOpen(Boolean valveOpen) {
			this.valveOpen = valveOpen;
		}

		public Boolean getTempUserUnlockOn() {
			return tempUserUnlockOn;
		}

		public void setTempUserUnlockOn(Boolean tempUserUnlockOn) {
			this.tempUserUnlockOn = tempUserUnlockOn;
		}

	}
}
