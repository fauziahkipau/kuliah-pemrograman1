class NestedTryDemo2 {

  static void nestedTry(String args[]) {
    try {
      int a = 15;
      int b = 0;
      System.out.println(a / b);
    } catch (ArithmeticException e) {
      System.out.println("Error, pembagi bernilai nol!");
    }
  }

  public static void main(String args[]) {
    try {
      nestedTry(args);
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Dibutuhkan dua parameter/argument!");
    }
  }
}
