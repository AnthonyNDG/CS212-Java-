import java.io.File;

import java.io.FileNotFoundException;

import java.util.Scanner;

public class Project2 {

public static void main(String[] args) {

/**

* Defining sorted and unsorted car lists

*/

SortedCarList sortedCarList = new SortedCarList();
UnsortedCarList unsortedCarList = new UnsortedCarList();

/**

* Reading from data file and filling the array

*/

try {

  Scanner scanner = new Scanner(new File(args[0]));

  while (scanner.hasNextLine()) 
  {
    // getting a line

    String line = scanner.nextLine();

    // splitting the line by comma

    String fields[] = line.split(",");
    if(fields.length != 4)
    {
      System.out.println(line);
      continue;
    }

    String make = fields[0];

    String model = fields[1];

    int year = Integer.parseInt(fields[2]);

    int mileage = Integer.parseInt(fields[3]);

    //Defining a car object

    Car car = new Car(make, model, year, mileage);

    //Adding to both lists

    sortedCarList.add(car);

    unsortedCarList.add(car);

  }

  // passing both lists as parameters for the CarGUI


  CarGUI listDisplay = new CarGUI("Car Organizer");
  listDisplay.carsIntoGUI(unsortedCarList, sortedCarList);
  listDisplay.display();
} catch (FileNotFoundException e) {

System.out.println("File not found!");

}

}

}