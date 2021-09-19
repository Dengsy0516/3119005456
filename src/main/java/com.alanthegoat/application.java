package main.java.com.alanthegoat;

import main.java.com.alanthegoat.exception.FileEmptyException;
import main.java.com.alanthegoat.fileUtils.BufferedInputFile;
import main.java.com.alanthegoat.simHash.MySimHash;

import java.io.IOException;

public class application {
    public static void main(String[] args) throws IOException {

//        String file1 ="E:\\ideaproject\\src\\main\\resources\\orig.txt";
//        String file2 ="E:\\ideaproject\\src\\main\\resources\\orig_0.8_del.txt";

        /*System.out.println(  hash2.hammingDistance(hash3) );
        System.out.println(  hash4.hammingDistance(hash3) );
        System.out.println(  hash1.getSemblance(hash3) );
        System.out.println(  hash2.getSemblance(hash3) );
        System.out.println(  hash3.getSemblance(hash4) );*/

        /*MySimHash hash3 = new MySimHash(s3, 64);
        MySimHash hash4 = new MySimHash(s4, 64);*/
        //        System.out.println(  hash1.hammingDistance(hash2) );

        String file1 = args[0];
        String file2 = args[1];
        String s1 = BufferedInputFile.read(file1);
        String s2 = BufferedInputFile.read(file2);

        long l3 = System.currentTimeMillis();
        MySimHash hash1 = new MySimHash(s1, 64);
        MySimHash hash2 = new MySimHash(s2, 64);

        System.out.println("======================================");

        System.out.println("文本相似度为："+hash1.getSemblance(hash2) );

        long l4 = System.currentTimeMillis();
        System.out.println("程序运行时间为:"+(l4-l3));
        System.out.println("======================================");
    }
    public static void process(String f1,String f2) throws IOException {
        String s1 = BufferedInputFile.read(f1);
        String s2 = BufferedInputFile.read(f2);

        if(s1.length() ==0||s2.length()==0)
            throw new FileEmptyException();



        long l3 = System.currentTimeMillis();
        MySimHash hash1 = new MySimHash(s1, 64);
        MySimHash hash2 = new MySimHash(s2, 64);

        System.out.println("======================================");

        System.out.println("文本相似度为："+hash1.getSemblance(hash2) );

        long l4 = System.currentTimeMillis();
        System.out.println("程序运行时间为:"+(l4-l3));
        System.out.println("======================================");
    }


}
