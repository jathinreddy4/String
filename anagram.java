// refer book to know concept
public class anagram 
{
    public static void main(String[] args) 
    {
        String name1 = "dormitory";
        String name2 = "dirtyroom";

        System.out.println(isanagram(name1, name2));

    }   
    
    public static boolean isanagram(String name1, String name2)
    {
        name1 = name1.toLowerCase();
        name2 = name2.toLowerCase();

        int counts[] = new int[26];

        //fill the array with dormitory
        for(int i=0; i< name1.length(); i++)
        {
            counts[name1.charAt(i) - 'a']++;
        }

        //put dirtyroom in array to let to count == o;
        for(int i=0; i<name2.length(); i++)
        {
            counts[name2.charAt(i) - 'a']--;
        }

        //check
        for(int check : counts)
        {
            if(check != 0)
            {
                return false;
            }
        }
        return true;
    }
    
}
