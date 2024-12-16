package dec6thPractice;

public class LoopingBasedOutputQuestions1 {

    public static void main(String[] args) {

        String result = "";

        //1,2,3
        for(int i=1;i<=3; i++){
            //1,2
            for(int j=1;j<=2;j++){
                if(i*j%2==0){
                    result+="*";
                }else{
                    result+=(char)('A'+i+j);
                }
            //1.65+1+1 = 67 // C
                //2.*
                //3.2*1 *
                //4.2*2 *
                //5.3*1 65+3+1 69 E
                //6.3*2 * //C***E*
            }

        }
        System.out.println(result);
    }


}
