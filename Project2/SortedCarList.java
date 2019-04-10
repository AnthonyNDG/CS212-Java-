
public class SortedCarList extends CarList //lets us reach to our CarList.java file
{
	public SortedCarList()
	{
		super();
	}
	public void add(Car b)
	{
		CarNode node = new CarNode(b);  //made new CarNode
		CarNode p = head; //We have called in our first node for the list of cars

		//if list is empty, append
		if(this.length == 0)       //If we are not given node then we will create and add one in
		{
			this.append(b);
		}
		//else find the right position to put it in
		else{
			while(p.next!=null && (node.data.toString().compareTo(p.next.data.toString())) > 0)
			{
				p = p.next;			 // if there is nothing next and both Cars are not in alphabetical order, then the first car will become the second car
			}
			node.next = p.next;
			p.next = node;         //we fix the other value so that it appears that both cars have been swapped
			this.length++;
			if(node.next == null){
				this.last = node;
			}
		}
	}
	
}