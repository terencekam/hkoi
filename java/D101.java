import java.util.Scanner;

class main {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        scanner.close();
        while (i>10){
            i /= 10;
        }
        switch (i){
            case 2:
                System.out.println("Fixed");
                break;
            case 3:
                System.out.println("Fixed");
                break;
            case 5:
                System.out.println("Mobile");
                break;
            case 6:
                System.out.println("Mobile");
                break;
            case 9:
                System.out.println("Mobile");
                break;
        }

    }
}
