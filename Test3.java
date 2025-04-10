import java.io.*;
import javax.crypto.*;

public class Test3{
    public static void main(String[] args){
        File file = null;
        FileOutputStream fos = null;
        try{
            String sp = File.separator;
            file = new File("C:" + sp + "src" +sp +"save.dat");
            fos = new FileOutputStream(file);
            CipherOutputStream cos = new CipherOutputStream(fos);
            fos.write(72);
            fos.flush();
            fos.close();
        }catch(IOException e){
            e.printStackTrace();
        }if(fos != null){
            try{fos.close();}
            catch(IOException e){}
        }
    }
}