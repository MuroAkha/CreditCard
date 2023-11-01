
import java.util.Scanner;
public class Main {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Type your card number: ");
        String x = sc.next();

        int result = x.length();
        char nums1 = x.charAt(0);
        int sum1 = 0;
        int sum2 = 0;

        String[] arr = new String[result];
        int[] arr2 = new int[result];

        for (int i = 0; i < result ; i++) {
            arr[i]= String.valueOf(x.charAt(i));

            arr2[i]=Integer.parseInt(arr[i]);

        }

        for(int j = arr2.length-2; j>=0; j-=2){
            arr2[j]=arr2[j]*2;

            if(arr2[j]>=10){
                arr2[j] = arr2[j]-10;
                sum1 +=1;
            }

            sum1 += arr2[j];
        }
        for(int m= arr2.length-1; m>=0; m-=2){
            sum2 += arr2[m];
        }

        int total = sum1 + sum2;



        if (total%10==0) {
            if (result == 15) {

                System.out.println("American Express");

            } else if (result == 16 && (nums1 == '5' || nums1 == '2')) {

                System.out.println("Master card");
            } else if ((result == 14 || result == 16) && nums1 == '4') {
                System.out.println("visa");
            } else {
                System.out.println("Invalid");
            }
        }else System.out.println("Invalid");


    }

}             