package dec6thPractice;

public class LoopingBasedOutputQuestions4 {

    public static void main(String[] args) {
         int result = 0;

         //1,2,3,4,5
         for(int i=1; i<=5; i++){
             //
             if((i*2+3)%4==0){
                 result+=i*i;
             }else if(i%2==0){
                 result-=i;
             }else{
                 result+=i*2;
             }
         }
        System.out.println(result);
    }//1. 2
    //2.2-=2 result = 0
    //3.0+=6 result=6
    //4.6-=4 result=2
    //5.2+=10
}
