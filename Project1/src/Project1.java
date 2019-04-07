import java.util.*;


class Project1 {
  public static void main(String[] args)
  {
    Car[] unsortedCar = new Car[12];
    unsortedCar = maker("Cars.txt"); //Calls the text file given
    Car[] sortedCar = copy(unsortedCar); //We make a clone so we can have a sorted and unsorted
    sortedCar = sortedList(sortedCar); //It cals the sorted car list to actually make it sorted
    CarGUI gui = new CarGUI(unsortedCar,sortedCar,"Car GUI"); //assisted with CarGUI for the arrays and title of the window
    gui.carsIntoGUI(unsortedCar, sortedCar); //organizes the groups by unsorted ad sorted 
    gui.pack();
    gui.setVisible(true); //allows us to see the window
  }

  public static Car[] maker(String f) // this will help us make the cars
    {
      int counter = 0;
      TextFileInput lineReader = new TextFileInput(f);
      String line = lineReader.readLine(); //Lets the Program read each line
      String separator = new String(","); //Calls our commma a separator for the line
      String make, model;
      int year, mileage;
      Car[] tempArray = new Car[12];
      StringTokenizer comma;
      while(line != null)  //while there are still more lines after this one
      {
        comma = new StringTokenizer(line, separator);  //We will begin to separate each line and the words/numbers in between the commas
        if(comma.countTokens() == 4)
        {
        make = comma.nextToken(); 
        model = comma.nextToken();
        year = Integer.parseInt(comma.nextToken());
        mileage = Integer.parseInt(comma.nextToken()); //we make each word within the line a piece of string for lines 32-35
        Car temp = new Car(make, model, year, mileage); //An array is made
        tempArray[counter] = temp; //adding cars into the array 
        counter++;
        }
        else
        {
          System.out.println(line); //print it even if it doesn't have 4 tokens
        }
        line = lineReader.readLine();
      }
      
      return tempArray;
    }
  
  public static Car[] copy(Car[] k)
  {
    Car[] clone = new Car[k.length];
    for(int i =0; i < k.length; i++)
    {
      clone[i] = k[i];
    } //we make a copy of the unsorted array
    return clone;
  }

  public static Car[] sortedList(Car[] car)
  {
    Car c;
    Car temp;
    c = car[0];
    for(int i = 0; i < car.length; i++) //This is to alphabetize the cars
      {
        c = car[i];
        if(c.toString().compareToIgnoreCase(car[i].toString()) > 0)
        {
          c = car[i];         
        } 
      }
    for(int j = 0;j < car.length;j++)
    //j is the most left element
    {
      int i = j;//see will be your smallest element in each traversal
      for(int k = j+1;k<car.length;k++){//k is the element to navigate the list
        //compare the strings to see which is alphabetically greater
        if(car[i].getMake().toString().compareToIgnoreCase(car[k].getMake().toString()) > 0)
        //if the current string c is greater than the
        {
          i = k;
        }
      }
      temp = car[i];
      car[i] = car[j];
      car[j] = temp;
    }
  return car;
  }
}