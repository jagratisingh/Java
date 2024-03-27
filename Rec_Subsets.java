import java.util.ArrayList;

public class Rec_Subsets {
    public static void main(String[] args) {
        SubseqRet("","abc");
    }
    /* public static void Subsets(String p , String up){
        //base condition 
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        Subsets(p+ch, up.substring(1));//add it 
        Subsets(p, up.substring(1));//or ignore it

    } */
    //Arraylist
     public ArrayList<String> SubseqRet(String p , String up){
        //base condition 
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(0);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left =  SubseqRet(p+ch , up.substring(1));//add it 
        ArrayList<String> right = SubseqRet(p, up.substring(1));//or ignore it
        left.addAll(right);
        return left;
    }
}
