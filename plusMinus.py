def plusMinus(arr):
  n = len(arr)

  positive_count = 0
  negative_count = 0
  zero_count = 0

  for num in arr:
    if num > 0:
      positive_count += 1
    else if num < 0:
      negative_count += 1
    else:
      zero_count += 1

  positve_ratio = positive_count / n
  negative_ratio = negative_count / n
  zero_ratio = zerou_count / n

  print(f"{positive_ratio.6f}")
  print(f"{negative_ratio.6f}")
  print(f"{zero_ratio.6f}")

if __name__ == "__main__":
  n = int(input().strip())
  arr = list(map(int, input().rstrip().split()))

  plusMinus(arr)
