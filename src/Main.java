import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Conditional Statements
        // If-else
//        System.out.println("Please enter Age:");
//        Scanner sc= new Scanner(System.in);
//        int age= sc.nextInt();
//        if(age>=18){
//            System.out.println("you are Major");
//        }else{
//            System.out.println("you are Minor");

        //else-if

//        System.out.println("Please enter Marks:");
//        Scanner scan = new Scanner(System.in);
//        int Marks= scan.nextInt();
//        if(Marks>=70){
//            System.out.println("Distinction");
//        } else if (Marks>=60 && Marks<70) {
//            System.out.println("First Class");
//        }else if(Marks>=50 && Marks<60){
//            System.out.println("Pass");
//        }else{
//            System.out.println("Fail");

        //nested if

        System.out.println("Please enter Age:");
        Scanner scanner= new Scanner(System.in);
        int customerAge= scanner.nextInt();
        char hasCoupon;
        System.out.println("Customer has a Coupon S or N");
        hasCoupon= scanner.next().charAt(0);
        int ticketprice= 100;
        double discount;
        double extraDiscount;
        if(customerAge<=15){
            discount=0.5;
            if(hasCoupon=='S' || hasCoupon=='s'){
                extraDiscount= 0.1;
            }else {
                extraDiscount = 0;

            }
        }else{
            discount=0;
            if(hasCoupon=='S' || hasCoupon=='s'){
                extraDiscount= 0.1;
            }else {
                extraDiscount = 0;

            }
        }
        double discountticket= (ticketprice*(discount+extraDiscount));
        System.out.println("The Final charges for a Customer is" +" "+ (ticketprice-discountticket));
    }
}