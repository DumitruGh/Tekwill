public class Main {
    public static void main(String[] args) {
       isVowel('a');
       isVowel('A');
       isVowel('b');
    }

    public static void isVowel(char x){
        System.out.println(x=='a'|| x== 'i'|| x=='e' ||x=='o' || x== 'u' || x== 'y'
                || x=='A'|| x== 'I'|| x=='E' ||x=='O' || x== 'U' || x== 'Y' );
    }
}