package zipCodes2;

public class Location {
	private String location;
	
	public Location(String input) {
		location = input;
	}
	/**
	 * Returns City associated with input type Location from format "ZIPCODE,CITY,STATE"
	 * @return City as type String
	 */
	public String getCity() {
		String[] tokens = this.toString().split(",");
		return tokens[1];
	}
	/**
	 * Returns State associated with input type Location from format "ZIPCODE,CITY,STATE"
	 * @return State as type String
	 */
	public String getState() {
		String[] tokens = this.toString().split(",");
		return tokens[2];
	}
	//Returns type String
	public String toString() {
		return location.toString();
	}
}
