package p1;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class ProfileDetails {
	
	@Column(name = "Email",unique = true,nullable = false)
	private String emailId;
	@Column(name = "Phone",unique = true,nullable = false)
	private String phoneNumber;
	@Column(unique = true,nullable = false)
	private String linkinProfileLink;
	private String bankName;
	private long bankAccountNumber;
	private String ifscCode;
	@Column(unique = true,nullable = false)
	private String panNumber;
	
	@Column(name="PermanentAddress")
	private String homeAddress;
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getLinkinProfileLink() {
		return linkinProfileLink;
	}
	public void setLinkinProfileLink(String linkinProfileLink) {
		this.linkinProfileLink = linkinProfileLink;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public long getBankAccountNumber() {
		return bankAccountNumber;
	}
	public void setBankAccountNumber(long bankAccountNumber) {
		this.bankAccountNumber = bankAccountNumber;
	}
	public String getIfscCode() {
		return ifscCode;
	}
	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}
	public String getPanNumber() {
		return panNumber;
	}
	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}
	public String getHomeAddress() {
		return homeAddress;
	}
	public void setHomeAddress(String homeAddress) {
		this.homeAddress = homeAddress;
	}
	@Override
	public String toString() {
		return "ProfileDetails [emailId=" + emailId + ", phoneNumber=" + phoneNumber + ", linkinProfileLink="
				+ linkinProfileLink + ", bankName=" + bankName + ", bankAccountNumber=" + bankAccountNumber
				+ ", ifscCode=" + ifscCode + ", panNumber=" + panNumber + ", homeAddress=" + homeAddress + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (bankAccountNumber ^ (bankAccountNumber >>> 32));
		result = prime * result + ((bankName == null) ? 0 : bankName.hashCode());
		result = prime * result + ((emailId == null) ? 0 : emailId.hashCode());
		result = prime * result + ((homeAddress == null) ? 0 : homeAddress.hashCode());
		result = prime * result + ((ifscCode == null) ? 0 : ifscCode.hashCode());
		result = prime * result + ((linkinProfileLink == null) ? 0 : linkinProfileLink.hashCode());
		result = prime * result + ((panNumber == null) ? 0 : panNumber.hashCode());
		result = prime * result + ((phoneNumber == null) ? 0 : phoneNumber.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProfileDetails other = (ProfileDetails) obj;
		if (bankAccountNumber != other.bankAccountNumber)
			return false;
		if (bankName == null) {
			if (other.bankName != null)
				return false;
		} else if (!bankName.equals(other.bankName))
			return false;
		if (emailId == null) {
			if (other.emailId != null)
				return false;
		} else if (!emailId.equals(other.emailId))
			return false;
		if (homeAddress == null) {
			if (other.homeAddress != null)
				return false;
		} else if (!homeAddress.equals(other.homeAddress))
			return false;
		if (ifscCode == null) {
			if (other.ifscCode != null)
				return false;
		} else if (!ifscCode.equals(other.ifscCode))
			return false;
		if (linkinProfileLink == null) {
			if (other.linkinProfileLink != null)
				return false;
		} else if (!linkinProfileLink.equals(other.linkinProfileLink))
			return false;
		if (panNumber == null) {
			if (other.panNumber != null)
				return false;
		} else if (!panNumber.equals(other.panNumber))
			return false;
		if (phoneNumber == null) {
			if (other.phoneNumber != null)
				return false;
		} else if (!phoneNumber.equals(other.phoneNumber))
			return false;
		return true;
	}

	
	
}
