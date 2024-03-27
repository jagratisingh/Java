public class String1 {
       public static void main(String[] args){
        /* String str ="Jagrati Singh";
        System.out.println(str);
        String s1 ="abc";
        String s2 ="geg";
        String s3=s1.concat(s2);
        s1.concat(s2);
        System.out.println(s1);
        System.out.println(s1.concat(s2));
        System.out.println(s3); */
        String str1 ="abcde";
        for(int i=0;i<str1.length();i++){
            for(int j=i+1;j<=str1.length();j++)
        
            System.out.print(str1.substring(i,j)+" ");
        }
        
       }
    
}
