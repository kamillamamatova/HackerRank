def timeConversion(s):
  # AM or PM
  am_pm = s[-2:]
  # Hour
  hour = int(s[:2])
  # mm:ss, which is the middle part
  mm_ss = s[2:-2]

  if period == "AM":
    if hour == 12:
      hour = 00
    else:
      if hour != 12:
        hour += 12

  return f"{hour:02d}{minutes_seconds}"

if __name__ == "__main__":
  s = input().strip()
  print(timeConversion(s))
