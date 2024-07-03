import java.util.Scanner;

public class Amstrong {

        public boolean  Armstrong(int num){
            String leng=Integer.toString(num);
            int len=leng.length();
            System.out.println("lenght"+len);
            int sum=0;
            for(int i=0;i<len;i++){
                int currentdigit=Character.getNumericValue(leng.charAt(i));
                sum+=Math.pow(currentdigit,len);
                System.out.println(sum);
            }

            if(sum==num){
                return true;
            }
            return false;

        }
        public static void main(String[] args) {
        Amstrong a1=new Amstrong();
        Scanner input =new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=input.nextInt();
        System.out.println(a1.Armstrong(num));
    }    
    }

