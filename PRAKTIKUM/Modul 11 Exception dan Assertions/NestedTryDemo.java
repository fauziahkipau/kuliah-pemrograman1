class NestedTryDemo {

  public static void main(String args[]) {
    try {
      int a = 6;
      try {
        int b = 2;
        System.out.println(a / b);
      } catch (ArithmeticException e) {
        System.out.println("Error, pembagi bernilai nol!");
      }
    } catch (ArrayIndexOutOfBoundsException e2) {
      System.out.println("Dibutuhkan dua parameter/argument!");
    }
  }
}
