class Item
{
	int Item ;
	String ItemName;
	Item(int Item,String ItemName)
	{
		this.Item =Item;
		this.ItemName= ItemName;
	}
	void display()
	{
		System.out.println(Item);
		System.out.println(ItemName);
		
	}
}
public class Constructor {
	public static void main(String[] args) {
		Item Item1  =  new Item(111,"rajam");
		Item1.display();
	}

}
