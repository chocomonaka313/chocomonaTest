import java.io.*;

public class Test{
    public static void main(String[] args){
        File file = null;
        FileWriter fw = null;
        PrintWriter pw = null;
        try{
            String sp = File.separator;
            file = new File("C:" + sp + "src" + sp + "Test.txt");
            fw = new FileWriter(file);
            pw = new PrintWriter(fw);
            pw.print("あいうえお");
            pw.println("あいうえお");
            pw.write("あいうえお");
            pw.flush();
            pw.close();   
        }catch(IOException e){
            e.printStackTrace();
        }
            if(pw != null){
                pw.close();
                
            }
        }
    }
