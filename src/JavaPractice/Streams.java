package JavaPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class Streams {
    public static void main(String[] args){
        ArrayList<Integer> numbers = (ArrayList<Integer>) Arrays.asList(1,2,3,4,5,6);
        int sum = numbers.stream().filter(n -> n%2 == 0).mapToInt(Integer::intValue).sum();
        System.out.println(sum);
    }
}
