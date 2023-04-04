import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        int number, basnumber = 0, basValue, result = 0, basPow;
        Scanner input = new Scanner(System.in);
        System.out.println("Ask a number :");
        number = input.nextInt();
        int tempNumber = number;
        while (tempNumber != 0) {
            tempNumber/=10;
            basnumber++;
        }
        tempNumber=number;
        while (tempNumber!=0){
            basValue=tempNumber%10;
            basPow=1;
            for (int i =1;i<=basnumber;i++){
                basPow*=basValue;
            }
            result+=basPow;
            tempNumber/=10;
        }
        if(result==number){
            System.out.println(number+"number is a Armstrong number. ");
        }else{
            System.out.println(number+"number isn't a Armstrong number.");
        }
    }
}
