import java.util.*;
public class isomorphic 
{
    public static void main(String[] args) 
    {
        String s ="badca";   
        String t = "kifpx";
        System.out.println(isisomorphic(s, t));
        
    }   

    public static boolean isisomorphic(String s, String t)
    {
        if(s.length() != t.length())
        {
            return false;
        }

        Map<Character,Character> hm = new HashMap<>() ;

        for(int i = 0; i<s.length(); i++)
        {
            char org = s.charAt(i);
            char rep = t.charAt(i);

            if(! hm.containsKey(org))
            {
                if(! hm.containsValue(rep))
                {
                    hm.put(org,rep);
                }
                else
                {
                    return false;
                }
            }
            else
            {
                char mappedchar = hm.get(org);
                if(mappedchar != rep)
                {
                    return false;
                }
            }
        }
        return true;

    }
}
