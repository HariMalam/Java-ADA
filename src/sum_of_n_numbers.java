import java.util.Scanner;

public class sum_of_n_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number :");
        int num = sc.nextInt();
    }
    
    public static int sum_with_loop(int n){
        int sum=0;
        for (int i=1;i<=n;i++) {
            sum += i;
        }
        return sum;
    }

    public static int sum_with_equation(int n){
        int sum = n*(n+1)/2;
        return sum;
    }

    public static int sum_with_recursion(int n){
        if(n == 0){
            return 0;
        }
        else{
            return n + sum_with_equation(n-1);
        }
    }
}
