public class test {
  public static void main(String[] args) {
    int x = 8391667;
    int y = 1572863;

    if ((x - (x / y) * y) != 0){
      System.out.println("Su procesador tiene el error del Pentium" );
    } else {
      System.out.println("Su procesador no tiene el error del Pentium");
    }
  }
}
