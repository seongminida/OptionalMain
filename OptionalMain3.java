import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class OptionalMain3 {
   public static void main(String[] args) {
	   
	   
	   Optional<String>empty = Optional.empty();
	   
	   System.out.println(empty.isEmpty());
	   //System.out.println(empty.get());
	   
	   Optional<String>opt=Optional.of("안녕하세요");
	   System.out.println(opt.get());
	   
	// Optional 메소드
	// Optional 메소드
	   String imNull = null;
	   opt = Optional.ofNullable(imNull);
	   Optional<String> opt1 = Optional.ofNullable("Hello");

	   // 아웃풋
	   System.out.println(opt.isEmpty()); // true
	   System.out.println(opt1.isEmpty()); // false
	   
	   
	  //Optional 활용 메소드
	  
	   //Optional 활용 메소드
	      Optional<String> opt4 = Optional.of("Hello");
	      Optional<String> opt5 = Optional.of("Hello");
	      Optional<String> opt6 = Optional.of("World");
	      
	      // Optional 메소드
	      boolean isEqual1 = opt4.equals(opt5);
	      boolean isEqual2 = opt4.equals(opt6);

	      // 아웃풋
	      System.out.println(isEqual1); // true
	      System.out.println(isEqual2); // false
	   
	      
	      //filter
	      Optional<Integer> opt7 = Optional.of(10);
	      Optional<Integer> opt8 = Optional.of(1);
	      
	      Optional<Integer>optFilter=opt7.filter(num-> num <5);
	      Optional<Integer>optFilter2=opt8.filter(num-> num <5);
	      
	      System.out.println(optFilter.isEmpty());
	      System.out.println(optFilter2.isEmpty());
	      
	      //Map
	      // 인풋
	      Optional<String> optional = Optional.of("hello");

	      // Optional 메소드
	      Optional<Integer> result = optional.map(s -> s.length());
	      

	      // 아웃풋
	      System.out.println(result.get()); // 5
	      
	      //or 
	      //인풋
	      Optional<String> optional1 = Optional.empty();
	      Optional<String> optional2 = Optional.of("Hello");

	      // Optional 메소드 사용
	      Optional<String> result1 = optional1.or(() -> Optional.of("World"));
	      Optional<String> result2 = optional2.or(() -> Optional.of("World"));

	      // 아웃풋
	      System.out.println(result1.get()); // World
	      System.out.println(result2.get()); // Hello

	   
	      //스트림
	      Optional<String> optional10 = Optional.of("Hello");

	      // Optional 메소드 사용
	      optional10.stream()
	              .map(s->s.toUpperCase())
	              .forEach(System.out::println); // HELLO
	      
   }   
}
