package day02;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

public class UseFile {
    public static void main(String[] args) {
        File f = new File("C:\\Users\\asus\\Desktop\\.HelloWorld.java");
        File f1 = new File("C:\\Users\\asus\\Desktop\\HelloWorld.java");

        //文件系统根
        File[] roots = File.listRoots();
        for (File file : roots) {
            System.out.println("roots :" + file.getAbsolutePath());
        }

        //list()
        // 返回一个字符串数组,这些字符串指定此抽象路径名表示的目录中的文件夹
        File src = new File("src");
        String[] fs = src.list();
        for (String string : fs) {
            System.out.println(string);
        }

        //listFiles()
        // 返回一个抽象路径名数组，这些路径名表示此抽象路径名表示的目录中的文件夹
        File[] fs2 = src.listFiles();
        for (File file : fs2) {
            System.out.println("file.getName() = " + file.getName());
        }

        //list(FilenameFilter filter)
        //返回一个字符串数组，这些字符串指定此抽象路径名表示的目录中满足指定过滤器的目录和文件
        String[] fs3 = src.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                File f = new File(dir,name);
                return f.isFile() && f.getName().endsWith(".txt");
            }
        });
        for (String string : fs3) {
            System.out.println("fs3 -> " + string);
        }

        //File[] listFiles(FileFilter filter)
        //返回抽象路径名数组，这些路径名表示此抽象路径名表示的目录中满足指定过滤器的文件和目录
        File[] fs4 = src.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.getName().startsWith("google");
            }
        });
        for (File file : fs4) {
            System.out.println("fs4 -> " + file.getName());
        }

        //File[] listFiles(FilenameFilter filter)
        //返回抽象路径名数组，这些路径名表示此抽象路径名表示的目录中满足指定过滤器的文件和目录
        

    }
}
