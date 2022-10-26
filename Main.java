public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(isPalindrome(100));
    }
    public static boolean isPalindrome(int x) {
        if(x>=0)
        {
            String s=x+"";
            for(int i=0,j=s.length()-1;i<s.length();j--,i++)
            {
                if(s.charAt(i)!=s.charAt(j))
                {
                    return false;
                }
            }
            return true;
        }
        else
            return false;
    }
}
