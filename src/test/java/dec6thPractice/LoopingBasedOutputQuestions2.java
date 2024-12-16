package dec6thPractice;

public class LoopingBasedOutputQuestions2 {

    public static void main(String[] args) {

        String str = "java"; //4
        //0,1,2,3
        for(int i=0; i<str.length();i++){
            //0,1,2,3
            for(int j=i;j<str.length();j++){
                if(i+j%2==0){
                    System.out.println(str.charAt(i));
                }else{
                    System.out.println(str.charAt(j));
                }
            }//1. 0+0 jaja ava va a 1+1  2+2 3+3
            //2.0+1          1+2       2+3
            //3.0+2          1+3
            //4.0+3
            System.out.println();
        }
    }
}
