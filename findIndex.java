//28. Find the Index of the First Occurrence in a String

public class findIndex 
{
    public static void main(String[]args)
    {
        String s1 = "jathin";
        String s2 = "jai";
        System.out.println(check(s1, s2));
    }  
    
    public static int check(String s1, String s2)
    {
        int index = s1.indexOf(s2);
        if(s1.contains(s2))
        {
            return index;
        }
        return-1;
    }
}
