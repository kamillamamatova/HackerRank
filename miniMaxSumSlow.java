// O(n^2) solution
public static void miniMaxSum(List<Integer> arr){
  List<Long> sums = new ArrayList<>();

  for(int i = 0; i < 5; i++){
    long total = 0;
    for(int j = 0; j < 5; j++){
     if(j != i){
       total += arr.get(j);
     }
    }
    sums.add(total);
  }

  long minSum = Collections.min(sums);
  long maxSum = Collections.max(sums);

  System.out.println(minSum + " " + maxSum);
}
