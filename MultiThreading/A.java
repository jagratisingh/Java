package MultiThreading;

public class A {
    void series() throws Exception{
          for(int i=0;i<26;i++){
            if(i==10){
                throw new Exception("Error");
            }
            System.out.println(i);

          }
    }
    void pattern(){
        for(char p ='A'; p<'Z';p++){
            System.out.println(p);
        }
    }
    public static void main(String[] args) {
        A o = new A();
       // o.series();//unhandled exception in java 
        o.pattern();
        
    }
}
