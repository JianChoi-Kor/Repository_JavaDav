import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("����", "����", "���");
		
		Stream<String> stream = list.stream();
		stream.forEach(name -> System.out.println(name));
			
	}
}

