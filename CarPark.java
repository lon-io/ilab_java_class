import java.util.Scanner ;
public class CarPark {
double  charge = 0;
double charges = 0 ;
    public static void main(String[] args) {
        // TODO code application logic here
        CarPark park = new CarPark () ;
        
        Scanner input = new Scanner (System.in) ;
        
        System.out.println("how many customers parked in the garage yesterday ???");
        int number = input.nextInt() ;
        
         System.out.println("How many hours did each customer use ?" ) ;
         for (int counter = 1 ; counter < number+1 ; counter ++) {
             
        double hour = input.nextDouble() ;
        park.CalculateCharges(hour) ;
        System.out.printf("The charge for yesterday's customer"+counter+" was : $ %.2f %n" , park.charges );
        park.charge +=park.charges ;
         }
         System.out.printf("The total charge for yesterday was $ %.2f %n %n", park.charge  );
         
         //end of yesterday's charge calculation
         System.out.println("how many customers are parking in the Park today  ???");
          int num = input.nextInt() ;
          System.out.println("Enter the hours used so far for today's customer ") ;
          for (int count = 1 ; count < num+1 ; count ++) {
              
              double h = input.nextDouble() ;
              park.CalculateCharges(h);
              System.out.printf("The charges for today's customer " +count +" is  $ %.2f %n", park.charges);   
         }
          
        
    }
    public double CalculateCharges(double t) {
        double clock = Math.ceil(t) ;
        if (t<3){
            charges = 3  ;
        }
        else {
            charges = 2 + ((clock-3)*0.50) ;
        }
        return charges ;
    }

    
    }

