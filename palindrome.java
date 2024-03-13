public class palindrome 
{
    public static void main(String[] args) 
    {
        String name = "jathin";
        System.out.println(ispali(name));
    }  
    
    static boolean ispali(String name)
    {
        for(int i=0; i< name.length()/2; i++)
        {
            char start = name.charAt(i);
            char end =   name.charAt(name.length()-1 -i);
            
            if(start != end)
            {
                return false;
            }
        }return true;
    }
}
