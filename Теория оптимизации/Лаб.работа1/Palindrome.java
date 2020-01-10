public class Palindrome {


    public static void main(String[] args) {

        public static String reverseString (String s){

            String s = "pizzeria";
            System.out.println(s.length());   //Выводим 8
            System.out.println(s.charAt(5));  //Выводим r

            String original = "pizzeria";

            int a = original.length();
            System.out.println(a);
            String reverse = "";
            for (int i = original.length(); i >= 0; i--) {

                reverse = reverse + original.charAt(i);
                System.out.println(reverse);
            }

        }


    }
}
