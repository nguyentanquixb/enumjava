package exercise3;

import java.util.Date;

enum PositionType  { Security, technicalStaff, director  }

public class BuildingManager extends People {
	private int ContactPhoneNumber;
	private PositionType  positionType;
	public BuildingManager(String name, Date birthDate, int contactPhoneNumber, PositionType positionType) {
		super(name, birthDate);
		ContactPhoneNumber = contactPhoneNumber;
		this.positionType = positionType;
	}

	public int getContactPhoneNumber() {
		return ContactPhoneNumber;
	}

	public void setContactPhoneNumber(int contactPhoneNumber) {
		ContactPhoneNumber = contactPhoneNumber;
	}
	
	public PositionType getPositionType() {
		return positionType;
	}

	public void setPositionType(PositionType positionType) {
		this.positionType = positionType;
	}

	
	
}
