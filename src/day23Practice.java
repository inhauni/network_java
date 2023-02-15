
import jdk.jshell.execution.Util;

import java.util.Comparator;
import java.util.Enumeration;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class day23Practice {
    public static void main (String[] args) {

// 2번
        enum Gender {남,여};
        List<Integer> ages = List.of(25,20,29,28,32,18);
        List<Gender> genders = List.of(Gender.남,Gender.여,Gender.남,Gender.여,Gender.남,Gender.여);
        Stream<Integer> s1= ages.stream();

        int sum1= s1.reduce(0,(a,b)->a+b);
        System.out.println(sum1);
        int max = ages.stream().max(Integer::compare).get();
        System.out.println(max);
        Double avg = ages.stream().collect(Collectors.averagingInt(x->x));
        System.out.println(avg);

    }

}
