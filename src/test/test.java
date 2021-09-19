package test;

import main.java.com.alanthegoat.application;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;

public class test {
    @BeforeClass
    public static void beforeTest(){
        System.out.println("开始测试！");
    }
    @AfterClass
    public static void afterTest(){
        System.out.println("测试结束！");
    }
//测试方法
    @Test
    public void forEmptyFile(){
        try{
            application.process("E:\\ideaproject\\src\\main\\resources\\orig.txt","E:\\ideaproject\\src\\main\\resources\\orig_0.8_empty.txt");
        }catch (IOException e){
            System.out.println("有空文件");
            e.printStackTrace();
        }
    }

    @Test
    public void forWrongFilePath(){
        try{
            application.process("E:\\ideaproject\\src\\main\\resources\\orig.txt","E:\\ideaproject\\src\\main\\resources\\orig_0.8_wrong.txt");
        }catch (IOException e){
            System.out.println("不存在文件");
            e.printStackTrace();
        }
    }

    @Test
    public void forAddingContentFile(){
        try{
            application.process("E:\\ideaproject\\src\\main\\resources\\orig.txt","E:\\ideaproject\\src\\main\\resources\\orig_0.8_add.txt");
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    @Test
    public void forDeletingContentFile(){
        try{
            application.process("E:\\ideaproject\\src\\main\\resources\\orig.txt","E:\\ideaproject\\src\\main\\resources\\orig_0.8_del.txt");
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    @Test
    public void dis1File(){
        try{
            application.process("E:\\ideaproject\\src\\main\\resources\\orig.txt","E:\\ideaproject\\src\\main\\resources\\orig_0.8_dis_1.txt");
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    @Test
    public void dis7File(){
        try{
            application.process("E:\\ideaproject\\src\\main\\resources\\orig.txt","E:\\ideaproject\\src\\main\\resources\\orig_0.8_dis_7.txt");
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    @Test
    public void dis10File(){
        try{
            application.process("E:\\ideaproject\\src\\main\\resources\\orig.txt","E:\\ideaproject\\src\\main\\resources\\orig_0.8_dis_10.txt");
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    @Test
    public void dis15File(){
        try{
            application.process("E:\\ideaproject\\src\\main\\resources\\orig.txt","E:\\ideaproject\\src\\main\\resources\\orig_0.8_dis_15.txt");
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    @Test
    public void forMixFile(){
        try{
            application.process("E:\\ideaproject\\src\\main\\resources\\orig.txt","E:\\ideaproject\\src\\main\\resources\\orig_0.8_mix.txt");
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    @Test
    public void forSub1File(){
        try{
            application.process("E:\\ideaproject\\src\\main\\resources\\orig.txt","E:\\ideaproject\\src\\main\\resources\\orig_sub_1.txt");
        }catch (IOException e){
            e.printStackTrace();
        }
    }


    @Test
    public void forSub2File(){
        try{
            application.process("E:\\ideaproject\\src\\main\\resources\\orig.txt","E:\\ideaproject\\src\\main\\resources\\orig_sub_2.txt");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
