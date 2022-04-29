import java.util.Scanner;

class main {
    public static void main(String args[]){
        int Day1;
        int Day2;
        Scanner scanner = new Scanner(System.in);
        int YY = scanner.nextInt();
        int MM = scanner.nextInt();
        int DD = scanner.nextInt();
        Day1 = YY*10000+MM*100+DD;
        YY = scanner.nextInt();
        MM = scanner.nextInt();
        DD = scanner.nextInt();
        Day2 = YY*10000+MM*100+DD;
        if (Day1>Day2){
            System.out.println("After");
        }else if(Day1 == Day2){
            System.out.println("Same");
        }else{
            System.out.println("Before");
        }
    }
}
