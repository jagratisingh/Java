package Arrays;
import java.util.HashMap;
import java.util.Map;
public class Appear_nk {
    public static void main(String[] args) {
        int[] a ={2,1,2,4,5,6,7,8,1,1,2,2};
        int n = a.length;
        int k = 4;
        morethannk(a, n, k);
        }
        public static void morethannk(int[] a, int n , int k){
            int x=n/k;
            HashMap<Integer,Integer> hm = new HashMap<>();
            for(int i=0;i<n;i++){
                if(!hm.containsKey(a[i])){
                    hm.put(a[i],1);
                }
                else
                {
                    int count=hm.get(a[i]);
                    hm.put(a[i],count+1);
                }
            }
            for(Map.Entry<Integer,Integer>  m : hm.entrySet()){
                    Integer temp =(Integer)m.getValue();
                    if(temp>x){
                       System.out.print(m.getKey());
                    }
            }
        }
}
