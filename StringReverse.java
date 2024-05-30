// public class StringReverse 
// {
//     public static void main(String[] args) 
//     {
//         String str = "Advanced Java";
//         char[] strArray = str.toCharArray();
//         for(int i = strArray.length-1;i>=0;i--)
//         {
//             System.out.print(strArray[i]);
//         }    
//     }    
// }


public class StringReverse
{
    public static void main(String[] args) 
    {
        StringBuffer sbf = new StringBuffer("Advance Java");
        System.out.println(sbf.reverse());    
    }
}