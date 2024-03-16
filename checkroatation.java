public class checkroatation 
{
    public static void main(String[] args) 
    {
        String s1 = "abcd";
        String s2 = "cdab";
        System.out.println(check(s1, s2));

    }   
    
    public static boolean check(String s1, String s2)
    {
        String temp = s1+s1;
        if(temp.contains(s2))
        {
            return true;
        }
        return false;
    }

}
