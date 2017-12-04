package helper;
import java.util.Scanner;

public abstract class TAObject implements Describe{

    protected Scanner s;
    public TAObject(){
        s = new Scanner(System.in);
    }

    public void a(String in){
        System.out.println(in);
    }

    public void p(int rows){
        for(int i = 0; i < rows; i++){
            a("");
        }
    }



}
