public class CountChar 
{
    public static void main(String[] args) 
    {
        String s = "Java is java again java again";
        //char c = 'a';
        int count = s.length() - s.replace("a", "").length();
        System.out.println(s.length());
        System.out.println(s.replace("a",""));
        System.out.println(s.replace("a","").length());
        System.out.println("Number of occurances of 'a' in '"+s+"' = "+count);
    }    
}
