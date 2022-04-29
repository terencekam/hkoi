import java.util.Scanner;

class main {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        Double a = scanner.nextDouble();
        Double b = scanner.nextDouble();
        Double c = scanner.nextDouble();
        Double delta = b*b-4*a*c;
        Double sqrt = Math.sqrt(delta);
        if (delta==0){
            Double cache = Double.valueOf((Math.round((((-b+sqrt)/(2*a))*1000))));
            System.out.println(cache/1000);
        }else if(delta>0){
            Double cache = Double.valueOf((Math.round((((-b+sqrt)/(2*a))*1000))));
            Double cache2 = Double.valueOf((Math.round((((-b-sqrt)/(2*a))*1000))));
            if (cache>cache2){
                System.out.println(cache2/1000);
                System.out.println(cache/1000);
            }else {
                System.out.println(cache/1000);
                System.out.println(cache2/1000);
            }
        }else{
            System.out.println("None");
        }
        scanner.close();
    }

}
