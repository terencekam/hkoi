import java.util.Scanner;

class main {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int YY = scanner.nextInt();
        System.out.println(YY+ordinal(YY));
    }
    public static String ordinal(int no){
        if (no%100==11){
            return "th";
        }else if (no%100==12){
            return "th";
        }else if (no%100==13){
            return "th";
        }
        else if (no%10==1){
            return "st";
        }else if (no%10==2){
            return "nd";
        }else if(no%10==3){
            return "rd";
        }else{
            return "th";
        }
    }
}
