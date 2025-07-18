import java.util.Scanner;

public class T3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        for (int i = 1; i <= n ; i++) {
            String s1 = String.valueOf(i);
            String s2 = Integer.toOctalString(i);
            if(!s1.contains("7") && !s2.contains("7")){
                ans ++;
            }
        }
        System.out.println(ans);
    }
}
