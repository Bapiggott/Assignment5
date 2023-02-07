import java.util.Scanner;

public class trailConverterMetric {
    public static void main(String[] args) throws Exception {
       
        double number = 0;
        int selection = 0;
        Scanner input1 = new Scanner(System.in);
        System.out.println("Enter the value of the unit to be changed");
        number = input1.nextDouble(); 
        Scanner input2 = new Scanner(System.in);
        System.out.println("   Welcome to metric converter! ");
        System.out.println("1. kg to lbs ");
        System.out.println("2. g to oz");
        System.out.println("3. km to mi");
        System.out.println("4. mm to in");
        System.out.println("Enter -1 to exit the program");
        selection = input2.nextInt();
        input1.close();
        input2.close();
        
        if (selection == 1) {
            ktp(number);
        }
        else if (selection == 2) {
            gto(number);
        }
        else if (selection == 3) {
            ktm(number);
        }
        else if (selection == 4) {
            mti(number);
        }

    }  
    public static void ktp(double number) {
        double unit;
        unit = 2.20462*number;
        System.out.println(number + "Kilograms (kg) equals" + unit + "Pounds (lbs)");
    }
    public static void gto(double number) {
        double unit2;
        unit2 = 0.035274*number;
        System.out.println(number + "Grams (g) equals" + unit2 + "Ounces (oz)");
    }
    public static void ktm(double number) {
        double unit3;
        unit3 = 0.621371*number;
        System.out.println(number + " km " + unit3 + " mi");
    }
    public static void mti(double number) {
        double unit4;
        unit4 = number / 25.3;
        System.out.println(number + " mm " + unit4 + " in");
    }
    }
