package day02;

import java.io.File;
import java.io.FileFilter;

public class HomWork {
    public static void main(String[] args) {
        //获取工程中的src目录对象
        File src = new File("src");
        //打印目录结构
        printDirStructure(src,1);
        //打印目录和文件结构
        //printDirAndFileStructure(src,1);
    }

    /**
     * 打印目录和文件结构
     * @param src
     * @param count
     */
    private static void printDirAndFileStructure(File src,int count){
        //1、首先打印当前路径
        for (int i = 0; i < count; i++) {
            System.out.print("=");
        }
        System.out.println(src.getName());

        //2、打印路径内部的
        //获取路径内所有的文件和路径对象
        File[] fs = src.listFiles();
        for (File file : fs) {
            //如果是文件
            if (file.isFile()) {
                for (int i = 0; i <= count ; i++) {
                    System.out.print("-");
                }
                System.out.println(file.getName());
            }
            //如果是文件夹
            if (file.isDirectory()) {
                printDirAndFileStructure(file,count+1);
            }
        }
    }

    private static void printDirStructure(File src,int count) {
        //1、首先打印当前路径
        for (int i = 0; i < count; i++) {
            System.out.print("=");
        }
        System.out.println(src.getName());

        //2、打印里面的
        File[] fs = src.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                //只要目录
                return pathname.isDirectory();
            }
        });
        for (File file : fs) {
            printDirStructure(file,count+1);
        }

    }
}
