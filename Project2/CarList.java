public abstract class CarList 
{
	int length;
	CarNode head;
	CarNode last;
	CarList(){
		head = new CarNode(null);
		last = head;
		length = 0;
	}
	public void append(Car d)
	{
		CarNode tmp = new CarNode(d);		 //we make a temporary CarList
		this.last.next = tmp;
		this.last = tmp;					 
		this.length++;
	}

	public String toString()                               //this helps sets up whats gonna be set up at our GUI
	{
		CarNode p = head.next;
		String returnString = "";
		while (p != null)
		{
			returnString += p.data + "\n";
			p = p.next;
		}
		return returnString;
	}
}