package exercise3;

public class Building {
	private String name;
	private String totalApartmentNumber;
	private String address;
	private String contactInformation;
	public Building(String name, String totalApartmentNumber, String address, String contactInformation) {
		super();
		this.name = name;
		this.totalApartmentNumber = totalApartmentNumber;
		this.address = address;
		this.contactInformation = contactInformation;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getTotalApartmentNumber() {
		return totalApartmentNumber;
	}
	
	public void setTotalApartmentNumber(String totalApartmentNumber) {
		this.totalApartmentNumber = totalApartmentNumber;
	}
	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getContactInformation() {
		return contactInformation;
	}

	public void setContactInformation(String contactInformation) {
		this.contactInformation = contactInformation;
	}
	

}
