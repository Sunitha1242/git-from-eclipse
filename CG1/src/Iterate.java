import java.util.stream.Stream;

public class Iterate {

	public static void main(String[] args) {

		Stream.iterate(12, element -> element + 2).filter(element -> element % 3 == 0).limit(5)
				.forEach(System.out::println);
	}

}
