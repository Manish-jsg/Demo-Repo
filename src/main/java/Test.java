import java.util.Optional;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {

		String str = "manish";

		String str2 = "TTBBSHSHSHSHLLLLWWWW";
		Optional<String> reduce = str.chars().mapToObj(s -> String.valueOf((char) s)).reduce((s1, s2) -> s2 + s1);

		if (reduce.isPresent()) {
			System.out.println(reduce);
		}
		System.out.println("---------");
		str2.chars().mapToObj(s -> (char) s).distinct().forEach(i -> System.out.print(i));
		System.out.println();
		System.out.println("===========");
		
		str2.chars().mapToObj(s->(char)s)
		.collect(Collectors.groupingBy(s->s,Collectors.counting())).forEach((k,v)->System.out.println(k+" "+v));
	}

}
