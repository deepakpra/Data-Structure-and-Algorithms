// Reverse a string

// Input: Deepak
// Output: kapeeD


public class reverseString {
    public static void main(String[] args) {
        String s= "Deepak ji";
        System.out.println(solve(s));
    }

     // 1) covert string to char array
     // 2) We can solve it using two pointer, one point to start and another to end , swap and
     // move both one step close till (i<j).

    static String solve(String s) {
        char rev[] = s.toCharArray();
        for (int i = 0; i < rev.length/2; i++) {
            char temp = ' ';
            temp=rev[rev.length-i-1];
            rev[rev.length-i-1] = rev[i];
            rev[i]= temp;
        }

        return new String(rev);
    }
}