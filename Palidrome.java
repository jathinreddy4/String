public class Palidrome 
{
    public static void main(String[]args)
    {
        String name = "abccpa";
        // to check if palidrome

        System.out.println(ispalidrome(name));
    }    

    public static boolean ispalidrome(String name)
    {
        
        for(int i=0; i< name.length()/2; i++)
        {
            char start = name.charAt(i);
            char end = name.charAt(name.length()-1 -i);

            while(start <= end)
            {
                if(start != end)
                {
                    return false;
                }
            }
        }
        return true;
    }
    
}
