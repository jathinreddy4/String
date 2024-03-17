import java.util.*;
public class sortByFrequncy 
{
    public static void main(String[] args) {
        String s = "tree";
        System.out.println(sort(s));

    }   
    
    public static String sort(String s)
    {
        Map<Character,Integer> hm = new HashMap<>();
        for(int i=0; i<s.length(); i++)
        {
            char ch = s.charAt(i);

            if(!hm.containsKey(ch))
            {
                hm.put(ch, 1);
            }
            else
            {
                hm.put(ch, hm.get(ch) +1);
            }
        }

        List<Character> chars = new ArrayList<>(hm.keySet());
        Collections.sort(chars, (a, b) -> hm.get(b) - hm.get(a)); // Sort characters based on frequency

        StringBuilder sortedString = new StringBuilder();
        for (char ch : chars) {
            int freq = hm.get(ch);
            for (int i = 0; i < freq; i++) {
                sortedString.append(ch);
            }
        }

        return sortedString.toString();
    }
}
