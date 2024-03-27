public class Search_Strings {
    public static void main(String[] args) {
        String[] arr = {"Jagrati","Kush", "Abhay","Tanu","Archana"};
        System.out.println(Search(arr));
    }
    public static String Search(String[] arr){
          String love = "Jagrati";
          for(int i=0;i<arr.length;i++){
             if(arr[i]==love){
                   return love;
             }
               
          }
          return null;

    }
}
