package Arrays;
public class Merge_Sorted {
    public static void merge(int[] nums1, int[] nums2, int m, int n) {
        int i=m-1;
        int j=n-1;
        int k=m+n-1;
        while(i>=0&&j>=0){
            if(nums1[i]>nums2[j]){
                nums1[k]=nums1[i];
                k--;
                i--;
            }
            else
            {
                nums1[k]=nums2[j];
                k--;
                j--;
            }
        }
         while(i>=0){
                nums1[k--]=nums1[i--];
            }
            while(j>=0){
                nums1[k--]=nums2[j--];
       }       
}

    public static void main(String[] args) {
        int[] nums1 = {1, 4, 8, 10};
        int[] nums2 = {2, 3, 9};
        int n = 4, m = 3;
        merge(nums1,nums2,m,n);
        for(int i=0;i<m+n;i++){
            System.out.print(nums1[i]+" ");
        }
    }
}

