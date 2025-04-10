import java.io.*;

public class Test2{
    public static void main(String[] args){
        File file = null;
        FileReader fr = null;
        BufferedReader br = null;
        try{
            String sp = File.separator;
            file = new File("C:" + sp + "src" + sp + "Test.txt");
            fr = new FileReader(file);
            br = new BufferedReader(fr);
            String s;
            while((s = br.readLine()) != null){
                System.out.println(s);
            }
        }catch(IOException e){
            e.printStackTrace();
        }if(br != null){
            try{br.close();}
            catch(IOException e){}
        }
    }
}