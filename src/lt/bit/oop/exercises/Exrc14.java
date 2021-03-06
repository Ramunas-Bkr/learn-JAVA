package lt.bit.java.exercises;

class Exrc14 {

  public static void main(String[] args) {
    System.out.println(plusOut("12xy34", "xy")); //→ "++xy++"
    System.out.println(plusOut("12xy34", "1")); //→ "1+++++"
    System.out.println(plusOut("12xy34xyabcxy", "xy")); //→ "++xy++xy+++xy"
  }

  static String plusOut(String str, String preservedChars) {
    char[] result = new char[str.length()];
    char[] chars = str.toCharArray();
    char[] allowedChars = preservedChars.toCharArray();

    for (int i = 0; i < chars.length; i++) {
      for (char allowedChar : allowedChars) {
        if (chars[i] == allowedChar) {
          result[i] = chars[i];
          break;
        }
        result[i] = '+';
      }
    }

    return String.valueOf(result);
  }
}
