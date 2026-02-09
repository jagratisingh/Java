public class PaymentMethod {
    public static void main(String[] args){
         Payment obj = new Payment();
        // int res1= obj.divide(4,2 );
        // int res2 = obj.subtract(4,2);
        // int res3=  obj.multiply(4,2);
        int res1 = Payment.divide(4, 2);
        int res2 = Payment.multiply(5, 3);
        int res3 = Payment.subtract(5, 3);
        //we have to create the object because the extended class does not have the static methods
        int res4 = obj.add(3, 6);
        
        System.out.print(res1+" "+res2+" "+res3+" "+res4);
    }
    
}
