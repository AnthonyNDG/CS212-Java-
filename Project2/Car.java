class Car
{
  private String make;
  private String model;
  private int year;
  private int mileage;
  public Car(String make, String model, int year, int mileage)
  {
    this.make = make;
    this.model = model;
    this.year = year;
    this.mileage = mileage;
  }
  public void setMake(String make)
  {
    this.make = make;
  }
  public void setModel(String model)
  {
    this.model = model;
  }
  public void setYear(int year)
  {
    this.year = year;
  }
  public void setMileage(int mileage)
  {
    this.mileage = mileage;
  }
  public String getMake()
  {
    return this.make;
  }
  public String getModel()
  {
    return this.model;
  }
  public int getYear()
  {
    return this.year;
  }
  public int getMileage()
  {
    return this.mileage;
  }
  @Override
  public String toString()
  {
    return this.make + "," + this.model + "," + Integer.toString(this.year) + "," + Integer.toString(this.mileage);
  }
}