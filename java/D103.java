import java.util.Scanner;

class main {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        Double a = scanner.nextDouble();
        Double b = scanner.nextDouble();
        Double c = scanner.nextDouble();
        scanner.close();
        Double output = a*b*Math.sin(Math.toRadians(c))/2;
        System.out.println(output);
    }
}
