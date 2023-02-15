
import jdk.jshell.execution.Util;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class day23Practice {
    public static void main (String[] args) {


        List<String> names = List.of("홍길동", "배장화", "임꺽정", "연흥부", "김선달", "황진이");
        Stream<String> s1 = names.stream().filter(n -> n.charAt(0) < '이');
        s1.forEach(x -> System.out.printf(x+" "));
        System.out.println();
        Stream<String> s2= names.stream().sorted();
        s2.forEach(x -> System.out.printf(x+" "));
        System.out.println();
        Stream<String> s = names.stream().limit(1);
        s.forEach(x -> {
            Optional<String> o = Optional.of(x);
            System.out.println(o);
            System.out.println(o.get());
        });
        Stream<String> s3 = names.stream();
        long num = s3.count();
        System.out.println(num);



    }

}
