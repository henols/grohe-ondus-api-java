package org.grohe.ondus.api.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@JsonIgnoreProperties(ignoreUnknown = true)
@EqualsAndHashCode(of = "uid")
public class Authentication {
    public String token;
    public String uid;
    @JsonProperty("user_attributes")
    public UserAttributes userAttributes;
    @JsonProperty("iot_attributes")
    public IotAttributes iotAttributes;

    
    
    public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public UserAttributes getUserAttributes() {
		return userAttributes;
	}

	public void setUserAttributes(UserAttributes userAttributes) {
		this.userAttributes = userAttributes;
	}

	public IotAttributes getIotAttributes() {
		return iotAttributes;
	}

	public void setIotAttributes(IotAttributes iotAttributes) {
		this.iotAttributes = iotAttributes;
	}

	@JsonIgnoreProperties(ignoreUnknown = true)
    public class IotAttributes {
        @JsonProperty("user_id")
        public String userId;
        public String language;
        @JsonProperty("contact_via_sms")
        public Boolean contactViaSms;
        @JsonProperty("contact_via_call")
        public Boolean contactViaCall;
        @JsonProperty("contact_via_email")
        public Boolean contactViaEmail;
        public String username;
        public String firstname;
        public String lastname;
        @JsonProperty("email_address")
        public String emailAddress;
        @JsonProperty("phone_number")
        public String phoneNumber;
		public String getUserId() {
			return userId;
		}
		public void setUserId(String userId) {
			this.userId = userId;
		}
		public String getLanguage() {
			return language;
		}
		public void setLanguage(String language) {
			this.language = language;
		}
		public Boolean getContactViaSms() {
			return contactViaSms;
		}
		public void setContactViaSms(Boolean contactViaSms) {
			this.contactViaSms = contactViaSms;
		}
		public Boolean getContactViaCall() {
			return contactViaCall;
		}
		public void setContactViaCall(Boolean contactViaCall) {
			this.contactViaCall = contactViaCall;
		}
		public Boolean getContactViaEmail() {
			return contactViaEmail;
		}
		public void setContactViaEmail(Boolean contactViaEmail) {
			this.contactViaEmail = contactViaEmail;
		}
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public String getFirstname() {
			return firstname;
		}
		public void setFirstname(String firstname) {
			this.firstname = firstname;
		}
		public String getLastname() {
			return lastname;
		}
		public void setLastname(String lastname) {
			this.lastname = lastname;
		}
		public String getEmailAddress() {
			return emailAddress;
		}
		public void setEmailAddress(String emailAddress) {
			this.emailAddress = emailAddress;
		}
		public String getPhoneNumber() {
			return phoneNumber;
		}
		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public class UserAttributes {
        public String username;
        public Boolean emailVerified;
        public String firstName;
        public String lastName;
        public String email;
        public String language;
        public String country;
		public Boolean hasPassword;

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public Boolean getEmailVerified() {
			return emailVerified;
		}

		public void setEmailVerified(Boolean emailVerified) {
			this.emailVerified = emailVerified;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getLanguage() {
			return language;
		}

		public void setLanguage(String language) {
			this.language = language;
		}

		public String getCountry() {
			return country;
		}

		public void setCountry(String country) {
			this.country = country;
		}

		public Boolean getHasPassword() {
			return hasPassword;
		}

		public void setHasPassword(Boolean hasPassword) {
			this.hasPassword = hasPassword;
		}
    }
}
