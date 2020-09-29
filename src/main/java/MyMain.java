import java.util.Scanner;

public class MyMain {

    // Rolls a single die
    // Returns a random integer between 1 and 6
    public static int rollDie() {
        int rand =(int)(Math.random() * 6) + 1;
        return rand;
    }

    // Rolls two dice n times
    // This method returns an int array of size 11, where each element is
    // the number of times a certain sum of two dice was rolled
    public static int[] sumOfTwoDice(int n) {
        int[] arr = new int[]{ 0,0,0,0,0,0,0,0,0,0,0 };
        int total =0;
        for (int i = 0; i < n; i++){
            for (int t = 0; t < 2; t++){
                total = total + rollDie();
            }
            arr[total-2] += 1;
            total=0;
        }
        return arr;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many pair of dice would you like to roll?"); 
        int num = sc.nextInt();
        int[] output = sumOfTwoDice(num);
        for (int i = 0; i < 11; i++){
            
            double total = output[i];
            double percent = total / num * 100;
            
            System.out.println("% of rolls where sum == 2:" + percent);
        }
        sc.close();
    }
}
