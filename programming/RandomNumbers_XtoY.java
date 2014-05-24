import java.io.*;

public class RandomNumbers_XtoY{
    public static void main(String args[]){
        //two number
        int x = 10;
        int y = 20;
        int diff = y - x;
        
        //result from 10 to 20
        int r = (int)(Math.random()*(diff+1)+x);
        System.out.println("Result from 10 to 20: "+r);
    }
}