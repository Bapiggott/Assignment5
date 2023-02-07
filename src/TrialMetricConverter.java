import java.util.Scanner;
public class TrialMetricConverter {
  
    public static void main(String[] args) throws Exception {
        int first;
        double unit;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input 1, 2, 3, or 4 for the following case that you wish to have (-1 to break)");
        System.out.println("1: Kg to Ib");
        System.out.println("2: Grams to Oz");
        System.out.println("3: Km to Mi");
        System.out.println("4: Mm to in");
        first = scanner.nextInt();
        System.out.println(first);
        scanner.close();
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Please input the amount");
        unit = scanner2.nextDouble();
        scanner2.close(); 
    if (first == 1){
        KgToIb(unit);
        }
        if (first == 2){
       GToOz(unit);
        }
        if (first ==  3){
        KmToMi(unit);
        }
        if (first ==  4){
        MmToIn(unit);
    }
}  
public static void KgToIb(double kg){
         double b =kg;
        kg = kg * 2.205;
        System.out.println(b + " kg = "+ kg + " Ibs");
    }
    public static void GToOz(double g){
        double c = g;
        g = g / 28.35;
        System.out.println(c + " g = "+ g + " Oz");
   }
   public static void KmToMi(double km){
    double d= km;
    km = km / 1.609;
    System.out.println(d + " km = "+ km + " mi");
}
public static void MmToIn(double mm){
    double e= mm;
    mm = mm / 25.3;
    System.out.println(e + " mm = "+ mm + " in");
}
}