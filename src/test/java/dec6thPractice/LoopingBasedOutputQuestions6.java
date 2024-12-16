package dec6thPractice;

public class LoopingBasedOutputQuestions6 {

    public static void main(String[] args) {

        String result="";
        //1 2 3 4
        for(int i=1;i<=4;i++){
            //8/2 =3
            //13/2=6
            //18/2=9
            //23/2=11
            int value =(i*5+3)/2;
            if(value%3==0){
                result+= "X";
            }else if(value%4==0){
                result+="Y";
            }else{
                result+=value;
            }
        }
        System.out.println(result);
    }//1.Y 2.YX 3.YXX11
}
