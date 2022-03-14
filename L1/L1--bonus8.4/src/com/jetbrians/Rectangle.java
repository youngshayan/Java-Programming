package com.jetbrians;
public class Rectangle {
    public int width;
    public int length;
    public void Set(){
        if(width<0 && width>20 && length <0 && length>20){
            System.out.println("Program cannot start");

        }
    }
    public Rectangle(){}
    public int Area (){
        int area=width*length;
        return area;
    }
    public int Permitted(){
        int permitted= (int) ((width+length)*2);
        return permitted;
    }
}