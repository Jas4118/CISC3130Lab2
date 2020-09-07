package cisc3130Lab2;

public class artistName {
	private String name;
	private int frequency;
	public artistName(String name) {// Constructor for artist object
		this.name=name;
		this.frequency=1;
	}
	@Override
	public int hashCode() { // Override so we wouldn't compare frequency
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) { // Override so we wouldn't compare frequency
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		artistName other = (artistName) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	public void setFrequency(int frequency) { //setter for frequency
		this.frequency = frequency;
	}
	public int getFrequency() { //getter for frequency
		return frequency;
	}
	@Override
	public String toString() { // Overrides the toString method
		return name +" frequency ="+ + frequency ;
	}
	
	
	
	
}
