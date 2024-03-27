public class Cgpa{
    public static void main(String[] args){
        float s1=95;
        float s2=67;
        float s3=87;
        float marks=s1+s2+s3;
        float percentage=marks/300*100;
        double cgpa=percentage/9.5;
        System.out.println("percentage is "+percentage);
        System.out.println("cgpa is "+cgpa);
    }
}