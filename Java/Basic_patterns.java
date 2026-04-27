import java.util.Arrays;
import java.util.Scanner;

public class Basic_patterns {
    public static void problem4(int n){
        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++)System.out.print(" "+i);
            System.out.println();
        }
    }
    public static void problem5(int n){
        for(int i=n;i>0;i--){
            for(int j=i;j>0;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void problem6(int n){
        for(int i=n;i>0;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j+"");
            }
            System.out.println();
        }
    }
    public static void problem7(int n){
        for(int i=0;i<n;i++){
            for(int k=n-i-1;k>0;k--) System.out.print(" ");
            for(int j=1;j<=i*2+1;j++) System.out.print("*");
            for(int l=n-i-1;l>0;l--) System.out.print(" ");
            System.out.println();
        }
    }
    public static void problem8(int n){
        for(int i=n;i>0;i--){
            for(int j=0;j<n-i;j++) System.out.print(" ");
            for(int j=0;j<i*2-1;j++) System.out.print("*");
            for(int j=0;j<n-i;j++) System.out.print(" ");
            System.out.println();
        }
    }
    public static void problem9(int n){
        problem7(n);
        problem8(n);
    }
    public static void problem10(int n){
        for(int i = 0; i <= 2 * n - 1; i++){
            int star;
            star=(i>n)?2*n-i:i;
            for(int j=0;j<star;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void problem11(int n){
        for(int i=0;i<n;i++){
            int start=(i%2==0)?1:0;
            for(int j=0;j<=i;j++){
                System.out.print(start);
                start=1-start;
            }
            System.out.println();
        }
    }
    public static void problem12(int n){
        int space=n*2;
        for(int i=0;i<n;i++){
            space-=2;
            for(int j=0;j<=i;j++) System.out.print(j+1);
            for(int j=0;j<space;j++) System.out.print(" ");
            for(int j=i;j>=0;j--) System.out.print(j+1);
            System.out.println();
        }
    }
    public static void problem13(int n){
        int k=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++) System.out.print(k+=1);
            System.out.println();
        }
    }
    public static void problem14(int n){
        for(int i=0;i<n;i++){
            for(char j='A';j<='A'+i;j++) System.out.print(j);
            System.out.println();
        }
    }
    public static void problem15(int n){
        for(int i=n;i>=0;i--){
            for(char j='A';j<'A'+i;j++) System.out.print(j);
            System.out.println();
        }
    }
    public static void problem16(int n){
        char k='A';
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++) System.out.print(k);
            k+=1;
            System.out.println();
        }
    }
    public static void problem17(int n){
        for(int i=1;i<=n;i++){
            char k='A';
            for(int j=0;j<=n-i-1;j++) System.out.print(" ");
            for(int j=1;j<=i*2-1;j++){
                System.out.print(k);
                k=(i<=j)?--k:++k;
            }
            for(int j=0;j<=n-i-1;j++) System.out.print(" ");
            System.out.println();
        }
    }
    public static void problem18(int n){
        for(int i=1;i<=n;i++){
            char k=(char)('A'+n-i);
            for(int j=1;j<=i;j++){
                System.out.print(k);
                k++;
            }
            System.out.println();
        }
    }
    public static void problem19(int n){
        for (int i=0;i<n;i++){
            for (int j=0;j<n-i;j++) System.out.print("*");
            for (int j=0;j<i*2;j++) System.out.print(" ");
            for (int j=0;j<n-i;j++) System.out.print("*");
            System.out.println();
        }
        for (int i=0;i<n;i++){
            for (int j=0;j<i+1;j++) System.out.print("*");
            for (int j=0;j<2*n-2*i-2;j++) System.out.print(" ");
            for (int j=0;j<i+1;j++) System.out.print("*");
            System.out.println();
        }
    }
    public static void problem20(int n){
        int star=1;
        for (int i=1;i<=2*n-1;i++){
            for (int j=0;j<star;j++) System.out.print("*");
            for (int j=0;j<Math.abs(2*n-2*i);j++) System.out.print(" ");
            for (int j=0;j<star;j++) System.out.print("*");
            star=(n-1<i)?--star:++star;
            System.out.println();
        }
    }
    public static void problem21(int n){
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++) {
                if(i==0||i==n-1||j==0||j==n-1)
                    System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void problem22(int n){
        for (int i=0;i<2*n-1;i++){
            for (int j=0;j<2*n-1;j++) {
                int top = i;
                int left = j;
                int right = (2*n-2)-j;
                int bottom = (2*n-2)-i;
                System.out.print(n-Math.min(Math.min(top,bottom),Math.min(left,right)));
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the limit of the printing =");
        int n = scan.nextInt();
        problem22(n);
        problem5(n);
        problem4(n);
        problem6(n);
        problem7(n);
        problem8(n);
        problem9(n);
        problem10(n);
        problem11(n);
        problem12(n);
        problem13(n);
        problem14(n);
        problem15(n);
        problem16(n);
        problem17(n);
        problem18(n);
        problem19(n);
        problem20(n);
        problem21(n);
        
    }
}
