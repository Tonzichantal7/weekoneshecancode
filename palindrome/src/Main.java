import java.sql.SQLOutput;
import java.util.Locale;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static String reverse(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);

        }
        return reverse;
    }
    public static void main (String[] args) {
        String name = "moM";
        String result = reverse(name);

        System.out.println("arginal name was:" + name);
        System.out.println("reversed name is:" + result);

        if (name.equalsIgnoreCase(result)) {

            System.out.println(name + " is a palindrome");
        } else {
            System.out.println(name + " is not a palindrome");
        }
    }








}










