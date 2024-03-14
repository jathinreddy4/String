import java.util.*;
public class vovels 
{
    public static void main(String[] args) 
    {
        String s = "jathin";  
        isalike(s);  
    }    

    public static  void isalike(String s)
    {
        Set<Character> ch = new HashSet<>();
        
        ch.add('a');
        ch.add('e');
        ch.add('i');
        ch.add('o');
        ch.add('u');
        
        String a = s.substring(0, s.length()/2);
        String b = s.substring(s.length()/2);
        int counta = 0;
        int countb = 0;

        for(int i=0; i<a.length(); i++)
        {
            if(ch.contains(a.charAt(i)))
            {
                counta++;
            }
        }

        for(int i=0; i<b.length();i++)
        {
            if(ch.contains(b.charAt(i)))
            {
                countb++;
            }
        }

        if(counta == countb)
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }





    }
}
