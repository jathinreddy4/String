
public class ultaString 
{
    public static void main(String[] args) 
    {
        String s = "jathin"; 
        System.out.println(rev(s));   
    }  
    
    public static String rev(String s)
    {
        String result = "";
        for(int i= s.length()-1; i>=0; i--)
        {
            result += s.charAt(i);
        }
        return result;
    }
}
