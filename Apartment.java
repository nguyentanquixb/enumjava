package exercise3;

enum ApartmentType {
	ApartmentTypeA, ApartmentTypeB, ApartmentTypeC;

	public String getSize() {
		switch (this) {
		case ApartmentTypeA:
			return "can ho A";
		case ApartmentTypeB:
			return "can ho B";
		case ApartmentTypeC:
			return "can ho C";
		default:
			return null;
		}
	}
}
public class Apartment extends Building {
	private String apartmentCode;
	private int floorNumber;
	private String apartmentOwnerName;
	private float electricityFee;
	private float waterFee;
	private ApartmentType apartmentType;
	public Apartment(String name, String totalApartmentNumber, String address, String contactInformation,
			String apartmentCode, int floorNumber, String apartmentOwnerName, float electricityFee, float waterFee,
			ApartmentType apartmentType) {
		super(name, totalApartmentNumber, address, contactInformation);
		this.apartmentCode = apartmentCode;
		this.floorNumber = floorNumber;
		this.apartmentOwnerName = apartmentOwnerName;
		this.electricityFee = electricityFee;
		this.waterFee = waterFee;
		this.apartmentType = apartmentType;
	}

	public String getApartmentCode() {
		return apartmentCode;
	}
	
	public void setApartmentCode(String apartmentCode) {
		this.apartmentCode = apartmentCode;
	}
	
	public int getFloorNumber() {
		return floorNumber;
	}

	public void setFloorNumber(int floorNumber) {
		this.floorNumber = floorNumber;
	}
	
	public String getApartmentOwnerName() {
		return apartmentOwnerName;
	}
	
	public void setApartmentOwnerName(String apartmentOwnerName) {
		this.apartmentOwnerName = apartmentOwnerName;
	}
	
	public float getElectricityFee() {
		return electricityFee;
	}
	
	public void setElectricityFee(float electricityFee) {
		this.electricityFee = electricityFee;
	}
	
	public float getWaterFee() {
		return waterFee;
	}
	
	public void setWaterFee(float waterFee) {
		this.waterFee = waterFee;
	}
	
	public ApartmentType getApartmentType() {
		return apartmentType;
	}

	public void setApartmentType(ApartmentType apartmentType) {
		this.apartmentType = apartmentType;
	}
	
	

	
	
	

}
