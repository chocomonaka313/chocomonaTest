import java.io.*;
import java.util.*;

public class Test4{
    public static void main(String[] args){
        try{
            String sp = File.separator;
            File file = new File("C:" + sp + "src" + sp + "save.properties");
            FileWriter fr = new FileWriter(file);
            Properties p = new Properties();
            p.load(fr);
            p.setProperty("おさとう","かずにい");
            p.store(fr,"テスト");
        }catch(IOException e){
            e.printStackTrace();
        }if(fr != null){
            try{
                fr.close();
            }catch(IOException e){}
        }
    }
}