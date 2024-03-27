public class Dice {
    public static void main(String[] args) {
        Throw("",4) ;  
    }

public static void Throw(String p,int target){
        if(target==0){
            System.out.print(p+" ");
            return;
        }
        for(int i=1;i<=6 && i<=target;i++){
            Throw(p+i, target-i);

        }
}
}
