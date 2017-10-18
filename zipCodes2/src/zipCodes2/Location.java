package zipCodes2;

public class Location {
	private String city;
	private String state;
	private String location;
	
	public Location(String input) {
		location = input;
	}
	private String getCity() {
		city = location.substring(location.length() - 3, location.length() - 1);
		return city;
	}
	private String getState() {
		return state;
	}
}
