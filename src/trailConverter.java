import java.util.Scanner;

public class Converter {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Please input your query. For example, 1 km to m.");
      System.out.println("Enter 'exit' or '-1' to exit the program");

      while (true) {
        String input = sc.nextLine();

        if (input.equals("exit") || input.equals("-1")) {
          break;
        }

        String[] parts = input.split(" ");
        if (parts.length != 2) {
          System.out.println("Your input is not currently handled by this app, please input another query, for example, 1 kg ");
          continue;
        }

        double value = Double.parseDouble(parts[0]);
        String from = parts[1];

        double result = 0;
        switch (from ) {

          case "kg":
            result = value * 2.20462;
            System.out.print(String.format("%.2f %s =", value, from));
            System.out.print(" " + result + "ib");
            break;

          case "m":
            result = value / .3048;
            System.out.print(String.format("%.2f %s =", value, from));
            System.out.print(" " + result + "ft");
            break;
          case "km":
            result = value / 1.609344;
            System.out.print(String.format("%.2f %s =", value, from));
            System.out.print(" " + result + "mi");
            break;
          case "kph":
            result = value / 1.609344;
            System.out.print(String.format("%.2f %s =", value, from));
            System.out.print(" " + result + "mph");
            break;
          default:
            System.out.println("Your input is not currently handled by this app, please input another query, for example, 1 kg to lb");
            continue;
        }

        //System.out.println(String.format("%.2f %s = %.2f %s", value, from, result, to));
      }
    
      sc.close();
    
  }
 
}