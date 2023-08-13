import java.util.Scanner;



public class fromLargeToSmall{

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n1,n2,n3;

        System.out.println("Beş tane sayı giriniz: "+"\n"+"1. Sayı");
        n1=input.nextInt();
        System.out.println("2. Sayı");
        n2=input.nextInt();
        System.out.println("3. Sayı");
        n3=input.nextInt();

        if(n1>n2 && n1>n2){
            if(n2>n3){
                System.out.println("n1>n2>n3");
            }
            else{
                System.out.println("n1>n3>n2");
            }
        }
        else if(n2>n1 && n2>n3){
            if(n1>n3){
                System.out.println("n2>n1>n3");
            }
            else{
                System.out.println("n2>n2>n1");
            }
        }
        else if(n3>n1 && n3>n2){
            if(n1>n2){
                System.out.println("n3>n1>n2");
            }
            else{
                System.out.println("n3>n2>n1");
            }
        }

        }
        

        
        

        }


        
        



        

