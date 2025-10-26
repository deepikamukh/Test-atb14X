package ex_02_javaprograms;

public class Typecasting {
    public static void main (String[] args){
//possible //implicit(automatically) casting by JVM
        byte b=10;
        int a=b;
        System.out.println(a);
//not possible
        int c=20;
        //byte d=c;
        byte d=(byte)c;

        System.out.println(d);
//java: incompatible types: possible lossy conversion from int to byte
    }
}
