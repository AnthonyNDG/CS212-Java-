import java.awt.*;
import javax.swing.*;
public class CarGUI extends JFrame
{
	private JTextArea leftTextArea;
	private JTextArea rightTextArea;
	//pass an unsorted and sorted list into the GUI
	public CarGUI(String title)
	{
		super(title);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(400, 400); //Size of window
		this.setLocation(200,200); //where the gui will be at in the screen	
		this.setLayout(new GridLayout(1,2)); //Will have one row and two columns
		leftTextArea = new JTextArea("Unsorted Cars: \n"); //Where we will have our unsorted cars
		rightTextArea = new JTextArea("Sorted Cars: \n"); //Where we will have our sorted cars
	}	
	//change the parameters to Car lists, unsorted and sorted
	public void carsIntoGUI(UnsortedCarList x, SortedCarList y)
	{
		this.leftTextArea.setRows(x.length);
		this.rightTextArea.setRows(y.length);
		Car car;
		CarNode checker = x.head.next;  // will check our car node
		CarNode checker2 = y.head.next;
		//go through each list with a single while loop until you hit null
		while(checker != null && checker2 != null) //while both checkers are not null
		{
			leftTextArea.append(checker.data.toString()+"\n");		//each itteration, you add the List.data to the text area
			rightTextArea.append(checker2.data.toString()+"\n");
			checker = checker.next;   // we go to the next node for checker and checker2
			checker2 = checker2.next;
		}
		this.getContentPane().add(this.leftTextArea);
		this.getContentPane().add(this.rightTextArea);

	}
	public void display()
	{
		this.pack();
		this.setVisible(true);
	}
}