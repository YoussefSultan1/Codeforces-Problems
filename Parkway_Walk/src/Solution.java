import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t > 0){
            int n,m;
            n = scanner.nextInt();
            m = scanner.nextInt();
            int sum = 0;
            for (int i = 0; i < n; ++i) {
                int x;
                x = scanner.nextInt();
                sum += x;
            }
            System.out.println(Math.max(0, sum - m));
            t--;
        }
    }
}