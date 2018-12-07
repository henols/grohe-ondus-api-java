package org.grohe.ondus.api.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
public class SenseGuardAppliance extends BaseAppliance {
    public static final int TYPE = 103;

    private Config config;
    @JsonProperty("registration_complete")
    private Boolean registrationComplete;

    public SenseGuardAppliance() {
        super(TYPE);
    }

    public SenseGuardAppliance(String applianceId, Room inRoom) {
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
        @JsonProperty("measurement_period")
        private Integer measurementPeriod;
        @JsonProperty("measurement_transmission_intervall")
        private Integer measurementTransmissionIntervall;
        @JsonProperty("measurement_transmission_intervall_offset")
        private Integer measurementTransmissionIntervallOffset;
        @JsonProperty("action_on_major_leakage")
        private Integer actionOnMajorLeakage;
        @JsonProperty("action_on_minor_leakage")
        private Integer actionOnMinorLeakage;
        @JsonProperty("action_on_micro_leakage")
        private Integer actionOnMicroLeakage;
        @JsonProperty("monitor_frost_alert")
        private Boolean monitorFrostAlert;
        @JsonProperty("monitor_lower_flow_limit")
        private Boolean monitorLowerFlowLimit;
        @JsonProperty("monitor_upper_flow_limit")
        private Boolean monitorUpperFlowLimit;
        @JsonProperty("monitor_lower_pressure_limit")
        private Boolean monitorLowerPressureLimit;
        @JsonProperty("monitor_upper_pressure_limit")
        private Boolean monitorUpperPressureLimit;
        @JsonProperty("monitor_lower_temperature_limit")
        private Boolean monitorLowerTemperatureLimit;
        @JsonProperty("monitor_upper_temperature_limit")
        private Boolean monitorUpperTemperatureLimit;
        @JsonProperty("monitor_major_leakage")
        private Boolean monitorMajorLeakage;
        @JsonProperty("monitor_minor_leakage")
        private Boolean monitorMinorLeakage;
        @JsonProperty("monitor_micro_leakage")
        private Boolean monitorMicroLeakage;
        @JsonProperty("monitor_system_error")
        private Boolean monitorSystemError;
        @JsonProperty("monitor_btw_0_1_and_0_8_leakage")
        private Boolean monitorBtw01And08Leakage;
        @JsonProperty("monitor_withdrawel_amount_limit_breach")
        private Boolean monitorWithdrawelAmountLimitBreach;
        @JsonProperty("detection_interval")
        private Integer detectionInterval;
        @JsonProperty("impulse_ignore")
        private Integer impulseIgnore;
        @JsonProperty("time_ignore")
        private Integer timeIgnore;
        @JsonProperty("pressure_tolerance_band")
        private Integer pressureToleranceBand;
        @JsonProperty("pressure_drop")
        private Integer pressureDrop;
        @JsonProperty("detection_time")
        private Integer detectionTime;
        @JsonProperty("action_on_btw_0_1_and_0_8_leakage")
        private Integer actionOnBtw01And08Leakage;
        @JsonProperty("action_on_withdrawel_amount_limit_breach")
        private Integer actionOnWithdrawelAmountLimitBreach;
        @JsonProperty("withdrawel_amount_limit")
        private Integer withdrawelAmountLimit;
        @JsonProperty("sprinkler_mode_start_time")
        private Integer sprinklerModeStartTime;
        @JsonProperty("sprinkler_mode_stop_time")
        private Integer sprinklerModeStopTime;
        @JsonProperty("sprinkler_mode_active_monday")
        private Boolean sprinklerModeActiveMonday;
        @JsonProperty("sprinkler_mode_active_tuesday")
        private Boolean sprinklerModeActiveTuesday;
        @JsonProperty("sprinkler_mode_active_wednesday")
        private Boolean sprinklerModeActiveWednesday;
        @JsonProperty("sprinkler_mode_active_thursday")
        private Boolean sprinklerModeActiveThursday;
        @JsonProperty("sprinkler_mode_active_friday")
        private Boolean sprinklerModeActiveFriday;
        @JsonProperty("sprinkler_mode_active_saturday")
        private Boolean sprinklerModeActiveSaturday;
        @JsonProperty("sprinkler_mode_active_sunday")
        private Boolean sprinklerModeActiveSunday;
		public List<Threshold> getThresholds() {
			return thresholds;
		}
		public void setThresholds(List<Threshold> thresholds) {
			this.thresholds = thresholds;
		}
		public Integer getMeasurementPeriod() {
			return measurementPeriod;
		}
		public void setMeasurementPeriod(Integer measurementPeriod) {
			this.measurementPeriod = measurementPeriod;
		}
		public Integer getMeasurementTransmissionIntervall() {
			return measurementTransmissionIntervall;
		}
		public void setMeasurementTransmissionIntervall(Integer measurementTransmissionIntervall) {
			this.measurementTransmissionIntervall = measurementTransmissionIntervall;
		}
		public Integer getMeasurementTransmissionIntervallOffset() {
			return measurementTransmissionIntervallOffset;
		}
		public void setMeasurementTransmissionIntervallOffset(Integer measurementTransmissionIntervallOffset) {
			this.measurementTransmissionIntervallOffset = measurementTransmissionIntervallOffset;
		}
		public Integer getActionOnMajorLeakage() {
			return actionOnMajorLeakage;
		}
		public void setActionOnMajorLeakage(Integer actionOnMajorLeakage) {
			this.actionOnMajorLeakage = actionOnMajorLeakage;
		}
		public Integer getActionOnMinorLeakage() {
			return actionOnMinorLeakage;
		}
		public void setActionOnMinorLeakage(Integer actionOnMinorLeakage) {
			this.actionOnMinorLeakage = actionOnMinorLeakage;
		}
		public Integer getActionOnMicroLeakage() {
			return actionOnMicroLeakage;
		}
		public void setActionOnMicroLeakage(Integer actionOnMicroLeakage) {
			this.actionOnMicroLeakage = actionOnMicroLeakage;
		}
		public Boolean getMonitorFrostAlert() {
			return monitorFrostAlert;
		}
		public void setMonitorFrostAlert(Boolean monitorFrostAlert) {
			this.monitorFrostAlert = monitorFrostAlert;
		}
		public Boolean getMonitorLowerFlowLimit() {
			return monitorLowerFlowLimit;
		}
		public void setMonitorLowerFlowLimit(Boolean monitorLowerFlowLimit) {
			this.monitorLowerFlowLimit = monitorLowerFlowLimit;
		}
		public Boolean getMonitorUpperFlowLimit() {
			return monitorUpperFlowLimit;
		}
		public void setMonitorUpperFlowLimit(Boolean monitorUpperFlowLimit) {
			this.monitorUpperFlowLimit = monitorUpperFlowLimit;
		}
		public Boolean getMonitorLowerPressureLimit() {
			return monitorLowerPressureLimit;
		}
		public void setMonitorLowerPressureLimit(Boolean monitorLowerPressureLimit) {
			this.monitorLowerPressureLimit = monitorLowerPressureLimit;
		}
		public Boolean getMonitorUpperPressureLimit() {
			return monitorUpperPressureLimit;
		}
		public void setMonitorUpperPressureLimit(Boolean monitorUpperPressureLimit) {
			this.monitorUpperPressureLimit = monitorUpperPressureLimit;
		}
		public Boolean getMonitorLowerTemperatureLimit() {
			return monitorLowerTemperatureLimit;
		}
		public void setMonitorLowerTemperatureLimit(Boolean monitorLowerTemperatureLimit) {
			this.monitorLowerTemperatureLimit = monitorLowerTemperatureLimit;
		}
		public Boolean getMonitorUpperTemperatureLimit() {
			return monitorUpperTemperatureLimit;
		}
		public void setMonitorUpperTemperatureLimit(Boolean monitorUpperTemperatureLimit) {
			this.monitorUpperTemperatureLimit = monitorUpperTemperatureLimit;
		}
		public Boolean getMonitorMajorLeakage() {
			return monitorMajorLeakage;
		}
		public void setMonitorMajorLeakage(Boolean monitorMajorLeakage) {
			this.monitorMajorLeakage = monitorMajorLeakage;
		}
		public Boolean getMonitorMinorLeakage() {
			return monitorMinorLeakage;
		}
		public void setMonitorMinorLeakage(Boolean monitorMinorLeakage) {
			this.monitorMinorLeakage = monitorMinorLeakage;
		}
		public Boolean getMonitorMicroLeakage() {
			return monitorMicroLeakage;
		}
		public void setMonitorMicroLeakage(Boolean monitorMicroLeakage) {
			this.monitorMicroLeakage = monitorMicroLeakage;
		}
		public Boolean getMonitorSystemError() {
			return monitorSystemError;
		}
		public void setMonitorSystemError(Boolean monitorSystemError) {
			this.monitorSystemError = monitorSystemError;
		}
		public Boolean getMonitorBtw01And08Leakage() {
			return monitorBtw01And08Leakage;
		}
		public void setMonitorBtw01And08Leakage(Boolean monitorBtw01And08Leakage) {
			this.monitorBtw01And08Leakage = monitorBtw01And08Leakage;
		}
		public Boolean getMonitorWithdrawelAmountLimitBreach() {
			return monitorWithdrawelAmountLimitBreach;
		}
		public void setMonitorWithdrawelAmountLimitBreach(Boolean monitorWithdrawelAmountLimitBreach) {
			this.monitorWithdrawelAmountLimitBreach = monitorWithdrawelAmountLimitBreach;
		}
		public Integer getDetectionInterval() {
			return detectionInterval;
		}
		public void setDetectionInterval(Integer detectionInterval) {
			this.detectionInterval = detectionInterval;
		}
		public Integer getImpulseIgnore() {
			return impulseIgnore;
		}
		public void setImpulseIgnore(Integer impulseIgnore) {
			this.impulseIgnore = impulseIgnore;
		}
		public Integer getTimeIgnore() {
			return timeIgnore;
		}
		public void setTimeIgnore(Integer timeIgnore) {
			this.timeIgnore = timeIgnore;
		}
		public Integer getPressureToleranceBand() {
			return pressureToleranceBand;
		}
		public void setPressureToleranceBand(Integer pressureToleranceBand) {
			this.pressureToleranceBand = pressureToleranceBand;
		}
		public Integer getPressureDrop() {
			return pressureDrop;
		}
		public void setPressureDrop(Integer pressureDrop) {
			this.pressureDrop = pressureDrop;
		}
		public Integer getDetectionTime() {
			return detectionTime;
		}
		public void setDetectionTime(Integer detectionTime) {
			this.detectionTime = detectionTime;
		}
		public Integer getActionOnBtw01And08Leakage() {
			return actionOnBtw01And08Leakage;
		}
		public void setActionOnBtw01And08Leakage(Integer actionOnBtw01And08Leakage) {
			this.actionOnBtw01And08Leakage = actionOnBtw01And08Leakage;
		}
		public Integer getActionOnWithdrawelAmountLimitBreach() {
			return actionOnWithdrawelAmountLimitBreach;
		}
		public void setActionOnWithdrawelAmountLimitBreach(Integer actionOnWithdrawelAmountLimitBreach) {
			this.actionOnWithdrawelAmountLimitBreach = actionOnWithdrawelAmountLimitBreach;
		}
		public Integer getWithdrawelAmountLimit() {
			return withdrawelAmountLimit;
		}
		public void setWithdrawelAmountLimit(Integer withdrawelAmountLimit) {
			this.withdrawelAmountLimit = withdrawelAmountLimit;
		}
		public Integer getSprinklerModeStartTime() {
			return sprinklerModeStartTime;
		}
		public void setSprinklerModeStartTime(Integer sprinklerModeStartTime) {
			this.sprinklerModeStartTime = sprinklerModeStartTime;
		}
		public Integer getSprinklerModeStopTime() {
			return sprinklerModeStopTime;
		}
		public void setSprinklerModeStopTime(Integer sprinklerModeStopTime) {
			this.sprinklerModeStopTime = sprinklerModeStopTime;
		}
		public Boolean getSprinklerModeActiveMonday() {
			return sprinklerModeActiveMonday;
		}
		public void setSprinklerModeActiveMonday(Boolean sprinklerModeActiveMonday) {
			this.sprinklerModeActiveMonday = sprinklerModeActiveMonday;
		}
		public Boolean getSprinklerModeActiveTuesday() {
			return sprinklerModeActiveTuesday;
		}
		public void setSprinklerModeActiveTuesday(Boolean sprinklerModeActiveTuesday) {
			this.sprinklerModeActiveTuesday = sprinklerModeActiveTuesday;
		}
		public Boolean getSprinklerModeActiveWednesday() {
			return sprinklerModeActiveWednesday;
		}
		public void setSprinklerModeActiveWednesday(Boolean sprinklerModeActiveWednesday) {
			this.sprinklerModeActiveWednesday = sprinklerModeActiveWednesday;
		}
		public Boolean getSprinklerModeActiveThursday() {
			return sprinklerModeActiveThursday;
		}
		public void setSprinklerModeActiveThursday(Boolean sprinklerModeActiveThursday) {
			this.sprinklerModeActiveThursday = sprinklerModeActiveThursday;
		}
		public Boolean getSprinklerModeActiveFriday() {
			return sprinklerModeActiveFriday;
		}
		public void setSprinklerModeActiveFriday(Boolean sprinklerModeActiveFriday) {
			this.sprinklerModeActiveFriday = sprinklerModeActiveFriday;
		}
		public Boolean getSprinklerModeActiveSaturday() {
			return sprinklerModeActiveSaturday;
		}
		public void setSprinklerModeActiveSaturday(Boolean sprinklerModeActiveSaturday) {
			this.sprinklerModeActiveSaturday = sprinklerModeActiveSaturday;
		}
		public Boolean getSprinklerModeActiveSunday() {
			return sprinklerModeActiveSunday;
		}
		public void setSprinklerModeActiveSunday(Boolean sprinklerModeActiveSunday) {
			this.sprinklerModeActiveSunday = sprinklerModeActiveSunday;
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
