import java.awt.*;
import javax.swing.*;
public class CarGUI extends JFrame
{
	private JTextArea leftTextArea;
	private JTextArea rightTextArea;

	public CarGUI(Car[] x, Car[] y,String title)
	{
		super(title);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(400, 400); //Size of window
		this.setLocation(200,200); //where the gui will be at in the screen	
		this.setLayout(new GridLayout(1,2)); //Will have one row and teo columns
		leftTextArea = new JTextArea("Unsorted Cars: \n"); //Where we will have our unsorted cars
		rightTextArea = new JTextArea("Sorted Cars: \n"); //Where we will have our sorted cars
	}	
	public void carsIntoGUI(Car[] x, Car[] y)
	{
		for (int i = 0; i < x.length; i++) {
			leftTextArea.append(x[i].toString() + "\n");
      System.out.println(x[i].toString());
		}
		for (int j = 0; j < y.length; j++) {
			rightTextArea.append(y[j].toString() + "\n");
      System.out.println(y[j].toString());
		}		//These two loops append the texts to the GUI in their respective places
		this.getContentPane().add(this.leftTextArea);
		this.getContentPane().add(this.rightTextArea);
	}
}