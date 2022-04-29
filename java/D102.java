import java.util.Scanner;

class main {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        scanner.close();
        string = string.substring(1);
        Double i = Double.parseDouble(string);
        i /= 2;
        i = Double.valueOf(Math.round(i*10))/10;
        System.out.print('$');
        System.out.print(i);
    }
}
