public class VariablesAndNames{
    public static void main(String[] args){
        // integer variable representing cars
        int cars = 100;
        // integer variable representing space in a car
	    int spaceInACar = 4;
	    // integer variable representing the number of drivers
	    int drivers = 30;
	    // integer variable representing the number of passengers
	    int passengers = 90;
	    // integer variable representing the number of cars that are not driven
	    int carsNotDriven = cars - drivers;
	    // integer variable representing the number of cars driven
	    int carsDriven = drivers;
	    // integer variable representing the carpool capacity that is the product of cars driven and space in a car
	    int carpoolCapacity = carsDriven * spaceInACar;
	    // double variable representing the average passengers through the calculation of dividing the number of passengers by cars driven
	    double averagePassengersPerCar = passengers / carsDriven;

	    System.out.println("There are " + cars + " cars available.");
	    System.out.println("There are only " + drivers + " drivers available.");
	    System.out.println("There will be " + carsNotDriven + " empty cars today.");
	    System.out.println("We can transport " + carpoolCapacity + " people today.");
	    System.out.println("We have " + passengers + " to carpool today.");
	    System.out.println("We need to put about " + averagePassengersPerCar + " in each car.");
	
	    // 1. It isn't really necessary since none of the results of the calculation are double values.
	    // 2. Float is a numerical data that is a floating-point number which means that it has a decimal place to be used for more precision.
    }
}
