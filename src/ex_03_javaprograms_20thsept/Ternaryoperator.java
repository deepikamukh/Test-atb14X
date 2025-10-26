package ex_03_javaprograms_20thsept;

public class Ternaryoperator {
    public static void main(String[] args){

        int num=11;

        String result=(num%2==0)?"even":"odd";
        System.out.println(result);


        //second assignment
        int a1=20;
        int a2=15;
        int a3=8;

        int result2=((a1>a2)&&(a2>a3))?a1:((a2>a3)?a2:a3);
        System.out.println(result2);

        //third assignment

        int age=60;
        String category=(age<60)?"minor" : ((age>65)?"super senior":"senior citizen");

        System.out.println(category);



    }
}
