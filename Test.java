//import LearnJava.MyClass;
import java.io.IOException;
//import java.nio.file.FileSystems;
import java.nio.file.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main (String[] args) {
        String myName="Celia";
//        System.out.println(myName);

        printS("static");

        Test myData=new Test();
        myData.print("instance");


        String[] breakfast = new String[3];
        breakfast[0]="Oatmeal";
        breakfast[1]="Milk";
        breakfast[2]="Egg";

        for (int i=0;i<breakfast.length;i++) {
            System.out.println(breakfast[i]);
        }

        boolean cond1=1==1;
        boolean cond2=1>5;
        if (cond1 || cond2){
            System.out.println("true");
        } else {System.out.println("false");}


        MyClass mc=new MyClass();
        mc.myMethod();
        mc.myInt=10;
        System.out.println(mc.myInt);

//        Scanner scanner=new Scanner(System.in);
//        System.out.println("enter your name:");
//        String name=scanner.next();
//        System.out.println("hello, "+name);
//        scanner.close();
        try {
            loadFile("src/test.txt");
        } catch (IOException e) {
//            e.printStackTrace();
            System.out.println(e);
        }
    }

    void print(String data){
        System.out.println(data);
    }

    static void printS(String data){
        System.out.println(data);
    }

    static void loadFile(String fileName) throws IOException {
        Path file= FileSystems.getDefault().getPath("",fileName);
//        String filename="test.txt";
//        Path filepath= Paths.get(filename);
//        System.out.println(file);
//        System.out.println(filepath.toAbsolutePath());
        List<String> lines= Files.readAllLines(file);
//        for (int i=0;i<lines.size();i++){
//            System.out.println(lines.get(i));
//        }
//        lines.forEach((str)->System.out.println(str));
        lines.forEach(System.out::println);

    }


}
