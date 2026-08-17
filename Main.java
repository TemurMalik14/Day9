import java.util.Scanner;
//Task1
public class Main {
    public static void Sv1(int n) {
        int i = 1;
        while (i <= n) {
            int a = 1;
            while (a <= i) {
                System.out.print("  ");
                a++;
            }
            int j = 1;
            while (j <= n - i + 1) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }
//Task2
    public static void Sv2(int n) {
        int i = 1;
        while (i <= n) {
            int j = 1;
            while (j <= n) {
                if (i == 1 || i == n || j == 1 || j == n || i == j) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            j++;
            }
        System.out.println();
            i++;
        }
    }
//Task3
    public static void Sv3(int a,int b){
    int small;
    if(a<b){
        small = a;
    }else{
        small = b;
    }
        int ekub=1;
    for(int i = 1; i<small;i++){
        if(a%i==0 && b%i==0){
            ekub = i;
        }
    }
    System.out.println(ekub);
    }
//Task4
    public static void Sv4(){
    Scanner javva = new Scanner(System.in);
    int count = 0;
    int n = javva.nextInt();      // birinchi sonni o'qiydi
    while (n > 0) {
        count++;
        n = javva.nextInt();      // keyingi sonni o'qiydi
    }
    System.out.println(count);
    }
//Task5
    public static void Sv5(int a, int b){
    int big ;
    if(a>b){
        big=a;
    }else{
        big=b;
    }
    int ekuk=1;
        for (int i = big; i <= a * b; i += big) {
              ekuk = i;
    }
     System.out.println(ekuk);
    }
}