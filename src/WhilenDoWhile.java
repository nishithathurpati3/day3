import java.util.Scanner;
public class WhilenDoWhile {
    public static void main(String[] args) {

//        while loop
//        int i=1;
//        while(i<=10){
//            System.out.println(i);
//            i=i+2;

//        dowhile loop
//        int i=2;
//        do{
//            System.out.println(i);
//            i=i+2;
//        }while(i<=10);



        //   %-->modulo(remainder), /-->division(quotient)
//        System.out.println(10/2);
//        System.out.println(11/2);
//        System.out.println(11%2);

        System.out.println("please enter a number");
        Scanner scan= new Scanner(System.in);
        int number= scan.nextInt();
        while(number>0){
            System.out.println(number%10);
            number= number/10;
        }


//        System.out.println("please enter a number");
//        Scanner scan= new Scanner(System.in);
//        int number= scan.nextInt();
//        int temp= number;
//        int reversedNumber=0;
//        while(temp!=0){
//            int remainder= temp %10;
//            //System.out.println(remainder);
//            reversedNumber= reversedNumber*10+remainder;
////            System.out.println(reversedNumber);
//            temp= temp/10;
//        }
//        System.out.println(reversedNumber);
    }
}
