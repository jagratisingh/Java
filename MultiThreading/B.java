package MultiThreading;

public class B extends Thread{
    void series() throws Exception{
        for(int i=1;i<26;i++){
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
  public void run(){
    if(currentThread().getName().equals("Rohit")){
        try{
            series();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
        else
        {
             pattern();
        }
    }
    public static void main(String[] args) throws Exception {
        B o1 = new B();
        o1.setName("Rohit");
        o1.start(); //new thread //rohit
        B o2= new B();
        o2.setName("Mohit");
        o2.start();
    }
  }
    

