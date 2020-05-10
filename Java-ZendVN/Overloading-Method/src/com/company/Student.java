package com.company;

public class Student {
    public String code;

    //setter
    public void setCode(String vCode){
        this.code = vCode;
    }
    public void setCode(){
        this.code = "SV9669";
    }
    public void setCode(String str,int number){
        this.code = str + number;
    }

    // getter
    public String getCode(){
        return this.code;
    }
}
