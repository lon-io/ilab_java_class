import java.util.Scanner;
public class QuadraticFormula {

public static void main(String[] args)
{
    //Creating scanner and variables
    Scanner s = new Scanner(System.in);
    System.out.println("Insert value for a: ");
    double a = Double.parseDouble(s.nextLine());
    System.out.println("Insert value for b: ");
    double b = Double.parseDouble(s.nextLine());
    System.out.println("Insert value for c: ");
    double c = Double.parseDouble(s.nextLine());

    //Display format for negatives
    if (b > 0 && c > 0 ){
        System.out.println(a + "x^2 + " + b + "x + " + c + " =0");}
    if (b < 0 && c > 0 ){
        System.out.println(a + "x^2 " + b + "x + " + c + " =0");}
    if (b > 0 && c < 0 ){
        System.out.println(a + "x^2 + " + b + "x " + c + " =0");}
    if (b < 0 && c < 0 ){
        System.out.println(a + "x^2 " + b + "x " + c + " =0");}
    s.close();

    //The work/formula
    double answer[] = new double[2] ;
    answer[0] = (-b + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
    answer[1] = (-b - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);

    //Display results and check if the solution is imaginary (real or not)
    if (Double.isNaN(answer[0]) || Double.isNaN(answer[1]))
    {
        System.out.println("Answer contains imaginary numbers");
    } else System.out.println("The values are: " + answer[0] + ", " + answer[1]);
}
}
