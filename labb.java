public class labb{  
    public static void main(String args[]){  
    String s1="Kathmandu";  
    String s2="Kathmandu";  
    String s3="NEPAL";  
    String s4="KATHMANDU";  
    System.out.println(s1.equals(s2));//true because content and case is same  
    System.out.println(s1.equals(s3));//false because case is not same  
    System.out.println(s1.equals(s4));//false because content is not same  
    System.out.println(s2.equals(s3));
    System.out.println(s2.equals(s4));
    System.out.println(s3.equals(s4));
    }}  