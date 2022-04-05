package p1;

import java.time.LocalDate;

public class Laptop {

	private int laptopId;
	private String brandName;
	private int ramSize;
	private LocalDate dop; // date of purchase
	public int getLaptopId() {
		return laptopId;
	}
	public void setLaptopId(int laptopId) {
		this.laptopId = laptopId;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public int getRamSize() {
		return ramSize;
	}
	public void setRamSize(int ramSize) {
		this.ramSize = ramSize;
	}
	public LocalDate getDop() {
		return dop;
	}
	public void setDop(LocalDate dop) {
		this.dop = dop;
	}
	@Override
	public String toString() {
		return "Laptop [laptopId=" + laptopId + ", brandName=" + brandName + ", ramSize=" + ramSize + ", dop=" + dop
				+ "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brandName == null) ? 0 : brandName.hashCode());
		result = prime * result + ((dop == null) ? 0 : dop.hashCode());
		result = prime * result + laptopId;
		result = prime * result + ramSize;
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
		Laptop other = (Laptop) obj;
		if (brandName == null) {
			if (other.brandName != null)
				return false;
		} else if (!brandName.equals(other.brandName))
			return false;
		if (dop == null) {
			if (other.dop != null)
				return false;
		} else if (!dop.equals(other.dop))
			return false;
		if (laptopId != other.laptopId)
			return false;
		if (ramSize != other.ramSize)
			return false;
		return true;
	}
	
	
}
