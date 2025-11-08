public static int birthdayCakeCandlesShorter(List<Integer> candles){
  int tallest = Collections.max(candles);
  int tallestCount;

  for(int num : candles){
    if(num == tallest)
      tallestCount++;
  }

  rerturn tallestCount;
}
      
