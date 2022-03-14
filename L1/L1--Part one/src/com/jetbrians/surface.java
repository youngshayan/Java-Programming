package com.jetbrians;
import java.util.*;
class Surface {

    Scanner input=new Scanner(System.in);
    public int S(int length,int width) {
        int surfaceofrectangle=length*width;
        System.out.println(surfaceofrectangle);
        return surfaceofrectangle;
    }
    public int Os(int x) {
        int surface=x*x;
        System.out.println(surface);
        return surface;
    }
    public void calculating(){
        System.out.println("The surface of Rectangle is:");

    }
    public void calculatingn2() {
        System.out.println("The surface of Square is:");

    }
}