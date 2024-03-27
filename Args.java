public class Args {
    //can we override main method : Yes we can override main method in java 
    //JVM search for entry point in java anfd when JVM search for entry point in java as it sees public 
    //psvm with string[] arg it starts executing the code and with other treat as another main method and It have to called by main method then it will give the answer
    public static void main(String[] args) {
        System.out.println("Main method");
        main(new int[]{1,2,3});
    }
    /*  public static void main(String[] args) {
        System.out.println("Main method");
    } */

    public static void main(int[] args) {
        System.out.println("Agrs method");
    }
} 
