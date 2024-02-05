import com.sun.jdi.Value;

public class userIntJava
{
    public static void main(String[] args)
    {
       int a = userInt(); // variable of user input
       int b = myInt(); // variable of another value
       int r = (Integer.compare(a, b)); // compared value
       if (r>0) {
            System.out.println(userInt());
        }
        else if (r<0) {
            System.out.println(myInt());
        } // if else if condition statement to print the larger value between the compared numbers
        System.out.println(Integer.sum(a, b)); // this will print the sum of the two numbers
    }
    private static int userInt() { // this is the assigned name and value to the users variable
        System.out.println(10);
        return 10;
    }
    private static int myInt() { // assigned name and value to example variable
        System.out.println(11);
        return 11;
    }
}