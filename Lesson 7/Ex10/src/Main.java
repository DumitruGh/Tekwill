
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Varianta I
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int n = scanner.nextInt();

  /*      String upperPassword = "";
        for (char i = 'A'; i <= 'Z' & upperPassword.length() < a; i++) {
            upperPassword = upperPassword + i;
        }
        System.out.println(upperPassword);

        String lowerPassword = "";
        for (char i = 'a'; i <= 'z' & lowerPassword.length() < b; i++) {
            lowerPassword = lowerPassword + i;
        }
        System.out.println(lowerPassword);

        String digitPassword = "";
        for (int i = 0; i <= 9 && digitPassword.length() < c; i++) {
            digitPassword = digitPassword + i;
        }
        System.out.println(digitPassword);

        String password = upperPassword + lowerPassword + digitPassword;

        char count = 'A';
        while (password.length() < n) {
            password = password + count;
            count++;
        }
        System.out.println(password);
    }
}*/
  //Varianta II


    StringBuilder password = new StringBuilder();
    char upper = 'A';
    while(password.length()<a){
        password.append(upper);
        upper++;
         if(upper > 'Z'){
             upper ='A';
         }
    }
        char lower = 'a';
        b = a+b;
        while(password.length()  < b){
            password.append(lower);
            lower++;
            if(lower > 'z'){
                lower ='a';
            }
        }

        int digit = '0';
        c = c +b;
        while(password.length()  < c){
            password.append(digit);
            digit++;
            if(digit > 9){
                digit =0;
            }
        }

        char count = 'A';
        while (password.length() < n) {
            password.append(count);
            count++;
        }
        System.out.println(password);
    }
    }