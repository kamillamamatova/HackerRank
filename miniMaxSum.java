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
    public static void miniMaxSum(List<Integer> arr) {
        Collections.sort(arr);
        
        long totalSum = 0;
        for(int num : arr){
            totalSum += num;
        }
        
        // Since the array has been sorted, the first # in the array is the min
        // and the last number in the array is max
        long minSum = totalSum - arr.get(arr.size() - 1);
        long maxSum = totalSum - arr.get(0);
        
        System.out.println(minSum + " " + maxSum);
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}
