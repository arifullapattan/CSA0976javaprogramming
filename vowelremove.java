import java.util.*;
public class vowelremove {
    public static void main(String[] args){
        try {
            String s1;
            String s2 = "";
            System.out.println("enter the string:");
            Scanner sc = new Scanner(System.in);
            s1 = sc.nextLine();
            s2 = s1.replaceAll("[aeiouAEIOU]", "");
            System.out.println("updated string= " + s2);
        }
        catch(Exception e)
        {
            System.out.println("enter valid input.");
        }
        }
    }