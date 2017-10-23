package zipCodes2;

public class Location {
	private String location;
	
	public Location(String input) {
		location = input;
	}
	public String getCity() {
		String[] tokens = this.toString().split(",");
		return tokens[1];
	}
	public String getState() {
		String[] tokens = this.toString().split(",");
		return tokens[2];
	}
	public String toString() {
		return location.toString();
	}
}
