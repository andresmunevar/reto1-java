import java.util.Scanner;

public class reto1 {
  public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
    // int n = read.nextInt();
    float irca;
    float sum = 0;
    int countNotViable = 0;
    int countLow = 0;
    String temp = read.nextLine();
    String[] value = temp.split(" ");
    for (int i = 0; i < value.length; i++) {
      irca = Float.parseFloat(value[i]);
      sum += irca;
      if(irca >= 5.1 && irca <= 14){
        countLow++;
      } else if(irca >= 80.1 && irca <= 100){
        countNotViable++;
      }
    }
    System.out.println(category(sum / value.length));
    System.out.println(countLow);
    System.out.println(countNotViable);
    read.close();
  }
  public static String category(float irca){
    if (irca >= 80.1 && irca <= 100){
      return "NV";
    } else if (irca >= 35.1 && irca <= 80){
      return "ALTO";
    } else if (irca >= 14.1 && irca <= 35){
      return "M";
    } else if (irca >= 5.1 && irca <= 14){
      return "L";
    } else if (irca >= 0 && irca <= 5){
      return "NR";
    }
    return "0";
  }
}
