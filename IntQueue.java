import java.util.ArrayList;

public class IntQueue
{
	private ArrayList<Integer> listOfInts;

	public IntQueue()
	{
		listOfInts = new ArrayList<Integer>();
	}

	public void add(int item)
	{
		listOfInts.add(item);
	}

	public int remove()
	{
		return listOfInts.remove(0);
	}

	public boolean isEmpty()
	{
		return listOfInts.isEmpty();
	}

	public int peek()
	{
		return listOfInts.get(0);
	}

	public String toString()
	{
		if (listOfInts.isEmpty()) {
			return "[]";
		}
		String temp = "[";
		for (int i = listOfInts.size()-1; i>=0; i--) {
			if (i == 0) {
				temp += listOfInts.get(i) + "]";
			} else {
				temp += listOfInts.get(i) + ", ";
			}
		}
		return temp;
	}
}