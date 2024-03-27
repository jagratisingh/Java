public class Phone_patt {
    public static void main(String[] args) {
        Phone("","12");
    }

public static void Phone(String p, String up){
      if(up.isEmpty()){
        System.out.print(p+" ");
        return ;
      }
      int digit = up.charAt(0)-'0';//this will convert '2' into 2
      for(int i=(digit-1)*3;i<digit*3;i++){
             char ch =(char)('a'+i);
             Phone(p+ch,up.substring(1));
      }
}
}
