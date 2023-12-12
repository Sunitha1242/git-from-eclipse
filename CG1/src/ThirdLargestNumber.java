import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThirdLargestNumber {

	public static void main(String[] args) {

//		List<Integer> list=new ArrayList();
//		list.add(19);
//		list.add(2);
//		list.add(3);
//		list.add(4);
//		list.add(4);
		List<Integer> list=Arrays.asList(19,2,3,4,4);
		
		System.out.println(list.stream().distinct().sorted().findAny());
		
		
	}

}
