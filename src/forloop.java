public class forloop {
    public static void main(String[] args) {
//       for (int i=0;i<=5;i++){
//            System.out.print("*");
//      }


//        for(int i=1;i<=5;i++){
//            System.out.println(i);
//        }


//        for (int i=2; i<=10;i=i+2){
//            System.out.print(i+" ");
//        }


//        for(int i=1;i<=5;i++){
//            for(int j=1;j<=5;j++){
//                System.out.print("*" + " ");
//            }


//        for(int i=1;i<=5;i++){
//            for(int j=1;j<=5;j++){
//                System.out.print("*");
//            }
//            System.out.println("*");
//        }



//        for(int i=1;i<=5;i++){
//            for(int j=1;j<=5-i+1;j++){
//                System.out.print("*" + " ");
//            }
//            System.out.println( );
//        }



//        for(int i=1; i<=5; i++){
//            for(int k=1; k<=i; k++){
//                System.out.print(" ");
//            }
//            for(int j=1; j<=11-(2*i); j++){
//                System.out.print("*");
//            }
//            System.out.println( );
//        }



        for(int i=1;i<=5;i++){
            for(int k=1;k<=5;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=5;j++){
                if(i==1 || i==5 || j==1 || j==5){
                    System.out.print("*" +" ");
                }else{
                    System.out.print(" " + " ");
                }
            }
            System.out.println();
        }


    }
}
