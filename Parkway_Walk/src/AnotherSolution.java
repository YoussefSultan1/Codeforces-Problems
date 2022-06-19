import java.util.*;
public class AnotherSolution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int i=1; i<=t; i++){
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int[] ai = new int[n];
            int j=0;
            for (j=0; j<n; j++){
                ai[j] = scanner.nextInt();
            }

            int count = 0;
            for (int x=1; x<n+1; x++){
                if (m >= ai[x-1]){
                    m -= ai[x-1];
                }
                else {
                    m++;
                    count++;
                    --x;
                }
            }
            System.out.println(count);
        }

    }
}