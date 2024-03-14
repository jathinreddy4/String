
public class largestOdd 
{
    public static void main(String[] args) 
    {
        String s = "35427";
        System.out.println(isodd(s));

    }

    public static String isodd(String s)
    {
        for(int i=s.length()-1; i>=0; i--)
        {
            char ch = s.charAt(i);
            if(ch%2 ==  1)
            {
                return s.substring(0,i+1);
            }

        }
        return "";
    }

}
