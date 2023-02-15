import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        // https://codeforces.com/problemset/problem/4/A

        Scanner sc = new Scanner(System.in);

        int w; //<--- w is for weight, not watermelon;

        System.out.println("Wut is the weight of the watermelon?");
        w = sc.nextInt();

        if (w >= 1 && w <= 100 && w % 2 == 0) {
            System.out.println("Its possible divide the watermelon in equal weights!");
        } else {
            System.out.println("Isnt possible divide the watermelon in equal weights...");
        }
    }
}
