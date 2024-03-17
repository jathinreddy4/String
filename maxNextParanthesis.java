public class maxNextParanthesis 
{
    public static void main(String[] args) {
        String s = "(1)+((2))+(((3)))";
        System.out.println(check(s));
        
        
    }   
    
    public static int check(String s)
    {
        int max = 0;
        int count =0;

        for(int i=0; i<s.length(); i++)
        {
            if(s.charAt(i) == '(')
            {
                count++;
                max = Math.max(max, count);
            }
            if(s.charAt(i) == ')')
            {
                count--;
            }
        }
        return max;
    }

}
