import java.util.*;
public class jewelsStrones 
{
    public static void main(String[] args) 
    {
        String jewels = "aA";
        String stones = "aAAbbb";
        System.out.println("The count is : ");
        System.out.println(countjewls(jewels, stones));

    }   
    
    public static int countjewls(String jewels, String stones)
    {
        //put all the jewels in the hashset and compare them with stones

        Set<Character> jwel = new HashSet<>();
        //push elements in set'
        for(int i=0; i<jewels.length(); i++)
        {
            jwel.add(jewels.charAt(i));
        }

        int count = 0;
        //compare stones with set
        for(int i=0; i<stones.length(); i++)
        {
            if(jwel.contains(stones.charAt(i)))
            {
                count++;
            }
        }
        return count;

    }
}
