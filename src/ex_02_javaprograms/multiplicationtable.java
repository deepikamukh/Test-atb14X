package ex_02_javaprograms;

public class multiplicationtable {
    public static void main (String args[]){

        int num=9;
        //9*1=9
        System.out.printf("%d*1=%d",num,num*1);
        System.out.println();
        System.out.printf("%d*2=%d",num,num*2).println();
        System.out.printf("%d*3=%d",num,num*3);
        System.out.println("...");
        System.out.printf("%dx9=%d",num,num*9).println();
        System.out.printf("%dx10=%d",num,num*10).println();
       // System.out.println(    "sout tab");

//The first %d corresponds to the first argument after the format string (which is num).
//
//The literal part *1= just comes out exactly as is.
//
//The second %d corresponds to the second argument (num * 1).

    }

}
