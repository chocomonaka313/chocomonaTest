import java.io.File;

public class Main4{
    public static void main(String[] args){
        String sp = File.separator;
        File file = new File("C:" + sp + "src" +sp+ "Test.txt");
        boolean make = file.mkdir();
        System.out.println("結果:" + make);
        if(file.exists()){
            System.out.println("ファイルが存在します");
        }
        if(file.isFile()){
            System.out.println("ファイルです");
        }
        if(file.isDirectory()){
            System.out.println("フォルダです");
        }
        String[] list = file.list();
        System.out.println(list.length);
    }
}