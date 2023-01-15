import java.util.Scanner;//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class emp_number {



    public static int solve(int n) {
        if (n == 0) {
            return 1;
        } else {
            return solve(n - 1)*8 + 1;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the level of management"+"\n");
        int mng_lvl= sc.nextInt();

        int number = solve(mng_lvl);
        System.out.println("number is " + number);
    }
}
