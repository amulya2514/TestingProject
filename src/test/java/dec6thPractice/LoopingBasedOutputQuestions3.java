package dec6thPractice;

public class LoopingBasedOutputQuestions3 {
    public static void main(String[] args) {

        int x=5;
        int y=10;

        //1,2,3,4
        for(int i=1;i<=4;i++){
            //15%1
            if((x+y)%i==0){
                x+=i*2;
            }else if (i%2==0){
                y-=i*3;
            }else{
                x+=y/i;
            }
            //1.5+=2 x=7 y=10
            //2.10-=2*3 x=7 10-=6 y=4 x=7
            //3.7+=4/3 7+=1 x=8 y=4
            //4.8+=4*2 8+=8 x=16 y=4
        }
        System.out.println("x=" +x+ ",y=" +y);
    }
}
