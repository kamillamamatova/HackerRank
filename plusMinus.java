import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {
    public static void plusMinus(List<Integer> arr) {
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;
        
        int n = arr.size();
        
        for(int nums : arr){
            if(nums > 0)
                positiveCount++;
            else if(nums < 0)
                negativeCount++;
            else
                zeroCount++;
        }
        
        double positiveRatio = (double) positiveCount / n;
        double negativeRatio = (double) negativeCount / n;
        double zeroRatio = (double) zeroCount / n;
        
        System.out.printf("%.6f%n%.6f%n%6f%n", positiveRatio, negativeRatio, zeroRatio);
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
