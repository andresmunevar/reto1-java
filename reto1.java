import java.util.Scanner;

public class reto1 {
  public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
    String n = read.nextLine();
    double irca;
    float sum = 0;
    int countNotViable = 0;
    int countLow = 0;
    String temp = read.nextLine();
    String[] value = temp.split(" ");
    // for (int i = 0; i < value.length; i++) {
    for (String val : value){
      irca = Double.parseDouble(val);
      sum += irca;
      if(category(irca) == "BAJO"){
        countLow++;
      } else if(category(irca) == "INVIABLE SANITARIAMENTE"){
        countNotViable++;
      }
    }
    System.out.println(category(sum / value.length));
    System.out.printf("%.2f%n",(float)countLow / value.length * 100);
    System.out.printf("%.2f%n",(float)countNotViable / value.length * 100);
    read.close();
  }
  public static String category(double irca){
    if (irca >= 80.1 && irca <= 100){
      return "INVIABLE SANITARIAMENTE";
    } else if (irca >= 35.1 && irca <= 80){
      return "ALTO";
    } else if (irca >= 14.1 && irca <= 35){
      return "MEDIO";
    } else if (irca >= 5.1 && irca <= 14){
      return "BAJO";
    } else if (irca >= 0 && irca <= 5){
      return "SIN RIESGO";
    }
    return "0";
  }
}
