package codingExerciseJavaOne;

public class CarClass {
	
//The class should have three private instance variables: 
	//make (String), model (String), and year (int).
	
	private String make;
	private String model;
	private Integer year;
	
	//Create a constructor that accepts the make, model, and year as parameters.
		
	public CarClass(String make, String model, Integer year) {
		
		this.make = make;
		this.model = model;
		this.year = year;
	}
	//Implement getter and setter methods for each instance variable, 
	//following proper encapsulation practices 
	//(i.e., using visibility modifiers).
	
	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}
	//Implement a toString() method that returns a formatted string with 
	//the car's make, model, and year.
}
