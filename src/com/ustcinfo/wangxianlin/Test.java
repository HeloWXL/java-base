package com.ustcinfo.wangxianlin;

public class Test {

    public static void main(String[] args) {
        System.out.println(myAtoi(" "));
    }

    public static int myAtoi(String str) {
        if(("").equals(str)||("-").equals(str)||("+").equals(str)){
            return 0;
        }else if(str.substring(0,1).matches("[a-z]\\s")){
            return 0;
        }
        String res = "";
        String content = "0123456789-+.";
        for(int i =0 ;i<str.length();i++){

            if(content.contains(str.substring(i,i+1))||(" ").equals(str.substring(i,i+1))){
                res += str.substring(i,i+1).trim();
            }else{
                break;
            }
        }
        if(Double.valueOf(res)>Integer.MAX_VALUE){
            return Integer.MAX_VALUE;
        }else if (Double.valueOf(res)<Integer.MIN_VALUE){
            return Integer.MIN_VALUE;
        }else{
            return (int)Double.parseDouble(res);
        }
    }
}
