import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class prgm10 {
    public static void main(String[] args) throws IOException {
        String file1,file2;
        Scanner sc=new Scanner(System.in);
        try{
            System.out.println("Enter file to Read");
            file1=sc.next();
            System.out.println("Enter file to Write");
            file2=sc.next();
            FileInputStream f1=new FileInputStream(file1);
            FileOutputStream f2=new FileOutputStream(file2);
            int val=0;
            val=f1.read();
            System.out.println(val);
            while(val!=-1)
            {
                 f2.write(val);
                val=f1.read();
            }
            f1.close();
            f2.close();
            f1=new FileInputStream(file2);
            val=0;
            System.out.println("value of file2....");
            val=f1.read();
            while(val!=-1){
                System.out.print((char)val);
                val=f1.read();
            }
            f1.close();
            }
            catch(FileNotFoundException e)
            {
                System.out.println("File is not available");
            }
        }
    }

