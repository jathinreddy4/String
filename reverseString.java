
public class reverseString 
{
    public static void main(String[] args) 
    {
        String s = "this is jathin";    
        System.out.println(reverse(s));
    }   
    
    static String reverse(String s)
    {
        String words[] = s.split(" ");

        StringBuilder sb = new StringBuilder();
        for(int i=words.length-1; i>=0; i--)
        {
            sb.append(words[i]);
            sb.append(" ");
        }

        return  sb.toString();


    }
}
