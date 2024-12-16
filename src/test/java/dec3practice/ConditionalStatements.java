package dec3practice;

public class ConditionalStatements {

    public static void main(String[] args) {

        int a=10, b=20, c=5;
        String result = "";

        //10+20>25 30>25
        //10*2<20/2 20<10
        //35%3
        if(a+b>c*5) {
            result = "condition 1";
        }else if (a*2<b/2){
            result = "condition 2";
            }else if ((a+b+c%3==0)) {
            result = "condition 3";
        }else {
            result = "No Condition Met";
        }

        System.out.println(result);

        System.out.println("----------------------***********************----------------");

        int x=15,y=30,z=10;
        String result1 = "";
        //15*30-10>100
        //450-10 --> 350>100
        //30/15+10==12 ---> 12 -- nested true
        if(x*y-z>100) {
            if (y / x + z == 12) {
                result1 = "Nested True";
            } else {
                result1 = "Inner Else";
            }
            //10*2<15 20<15
        }else if (z*2<x) {
            result1 = "Else If Block";
        }
        else{
                result1="Outer Else";
            }
            System.out.println(result1);
        System.out.println("---------------------------------------------*********************************-------------------------------");

        String str1 = "hello";
        String str2 = "Hello";
        String result2 = "";

        //false
        if(str1.equals(str2)) {
            result2 = "Equal";
        //true && true = true
        } else if(str1.equalsIgnoreCase(str2) && str1.length()==str2.length()){
            result2 = "Ignore Case Equal";
        //false || true =false
        } else if(str1.length()>str2.length()||str2.charAt(0)=='H'){
            result2 = "Length of first character";
        } else{
            result2= "no match";
        }
        System.out.println(result2);

        System.out.println("--------------------------------------**********************************--------------------------");

        int a1=6, b1=15, c1=10 ;
        String result3 = "";

        //6*15%10 --> 90%10
        //6+10>15  ---true
        if(a1*b1%c1==0 && (a1+c1>b1)){
            result3="condition1";
        //15/6 2-10 <5 -8<5
            //15%6 false
        }else if(b1/a1-c<5||b1%a1==1){
            result3="condition2";
        //10-15+6 1>0
        }else if(c1-b1+a1>0){
            result3="condition3";
        }else{
            result3="condition4";
        }
        System.out.println(result3);

        System.out.println("--------------------------------*************************************--------------------------");


        String str = "Coding Challenge";
        int len = str.length();
        String result4 = "";

        if(len>10 && str.startsWith("coding")){
            // ch
            if(str.substring(6,9).equals("cha")){
                result4 = "Perfect Match";
            }else{
                result4 = "Partial Match";
            }
                }else if(str.endsWith("ge")&&len%2==0){
            result4 = "Ends with ge and even length";
        }else{
            result4 = "No match found";
        }

        System.out.println(result4);

        System.out.println("----------------------------------------***************************--------------------------");

        String s1 = "complex123";
        //9*2 18>10  || 7%3==0
        boolean result5 = (s1.length()*2-5)>10||(str.indexOf("123")%3==0&&str.substring(3).contains("m"));
        System.out.println(result5);

        System.out.println("-------------------------------************************************---------------------------");

        String A = "Challenge";
        String result6 = "";
        int length = A.length(); //8
        for(int i=0;i<length;i++){
            //9+0 !=0 * 9+1 ==0
            if((length+i)%2==0){
                result6+=(char)(A.charAt(i)-1); //result6+=
            }else if((length-i)%3==0){
                result6+="*";
            }else{
                result6+=A.charAt(i);
            }//*gakld*fe
        }

        System.out.println(result6);
        System.out.println("------------------------------------------*******************************---------------------");

        String test="Programming";
        String result7="";
        //Programming
        //012345678910
        for(int i=0;i<test.length();i++){
            //P+i 80-
            if((test.charAt(i)+i)%3==0){
                result7+=test.charAt(i);
            }else if(i%2==0){
                //O
                result7+=(char)(test.charAt(i)-1);
            }else{
                result7+=(char)(test.charAt(i)+1);
            }//Osph
        }

        System.out.println(result7);
        System.out.println("---------------------------------------*****************************************---------------------");

        String test1 = "Reflection";
        String result8 = "";
        for(int i = test1.length()-1;i>0;i--){
            if((test1.charAt(i)+i)%2==0){
                result8+=(char)(test1.charAt(i)+1);
            }else{
                result8+=test1.charAt(i);
            }
        }
        System.out.println(result8);

        System.out.println("---------------------------------***********************************-----------------------");

        int x1=10;
        int y1=20;

        //10>5||
        if(x1>5||++y1>25){
            System.out.println("X: " +x1+ " Y: " +y1);
        }


        String word="Encapsulation";
        String result9 ="";
        int length1 = word.length();
        for(int i=1;i<length1/2;i++){
            result9+=word.substring(i-1,i).toUpperCase();
            if((length1*i)%5==0){
                result9+=(char)(word.charAt(length1-i)+2);
            }
        }
        System.out.println(result9);




        }

        }

