package se.kth.compilers;

public class Hello {
  public static void main(String[] args) {
    if (args.length > 0) {
      System.out.printf("Hello %s!", args[0]);
      return;
    }
    System.out.print("Hello World!");
  }
}
