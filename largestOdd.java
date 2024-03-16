
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
// concept of substring
/* 
 jathin 
 if you want print jat the index will start@j i.e(0),
 but for t the index will be one forward i.e (3), but the actual index of t is 2.
*/