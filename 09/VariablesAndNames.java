public class VariablesAndNames{
    public static void main(String[] args){
        int cars = 100;
	double spaceInACar = 4.0;
	int drivers = 30;
	int passengers = 90;
	int carsNotDriven = cars - drivers;
	int carsDriven = drivers;
	double carpoolCapacity = carsDriven * spaceInACar;
	double averagePassengersPerCar = passengers / carsDriven;

	System.out.println("There are " + cars + " cars available.");
	System.out.println("There are only " + drivers + " drivers available.");
	System.out.println("There will be " + carsNotDriven + " empty cars today.");
	System.out.println("We can transport " + carpoolCapacity + " people today.");
	System.out.println("We have " + passengers + " to carpool today.");
	System.out.println("We need to put about " + averagePassengersPerCar + " in each car.");
	
	// 1. It isn't really necessary since none of the results of the calculation are double values.
	// 
    }
}
