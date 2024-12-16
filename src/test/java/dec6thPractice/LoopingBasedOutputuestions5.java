package dec6thPractice;

public class LoopingBasedOutputuestions5 {
    public static void main(String[] args) {

        String result="";


        //0 1 2 3
        for(int i=0; i<=3;i++){
            result+=(i*2);
            if(result.length()>2){
                result= new StringBuilder(result).reverse().toString();
            }
        }
        System.out.println(result);
    }//0+=0
    //02
    //02+=4 024
    //420+=3*2 420=6 4206
}
