import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	List<String> al=new ArrayList<String>();
	al.add("Ravi");
	al.add("Vijay");
	al.add(1, "null");
	al.add("Ravi");
	al.add("Ajay");
	al.remove(0);
	Iterator itr=al.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
    }
//	foreach(String s: al)
//	{
//		System.out.println(s);
//	}
//	
//	
	}
}
