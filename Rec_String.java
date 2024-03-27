public class Rec_String {
    public static void main(String[] args) {
       // skip("", "bachapan");
     // System.out.println(skip("bachpana")); 
       System.out.println(skipApple("bachapplepan"));
    }
    //p : processed , up : unprocessed\
    //sKIP A CHARACHTER 
   /*  public static void skip(String p ,  String up){
   /*         if(up.isEmpty()){
             System.out.println(p);
             return ;
           }
           //index 0 is that's why we can start from at index 0 everytime
           char ch = up.charAt(0);
           if(ch=='a'){
                 skip(p,up.substring(1));
           }
           else
           {
              skip(p+ch, up.substring(1));
           }*/

 
//2nd Way //skIP A character 
 /* public static String skip(String up){
           if(up.isEmpty()){
             return "";
           }
           //index 0 is that's why we can start from at index 0 everytime
           char ch = up.charAt(0);
           if(ch=='a'){
               return skip(up.substring(1));
           }
           else
           {
               return ch + skip(up.substring(1));
           }
    
 }   */
 //SKIP a STRING
  public static String skipApple(String up){
           if(up.isEmpty()){
             return "";
           }
           //index 0 is that's why we can start from at index 0 everytime
           
           if(up.startsWith("apple")){
            //substring 5 means the size of apple 
               return skipApple(up.substring(5));
           }
           else
           {
               return up.charAt(0) + skipApple(up.substring(1));
           }
    
 } 
}
 
