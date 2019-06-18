package day02;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.io.IOException;

public class UseFile {
    public static void main(String[] args) throws IOException {
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
        // 返回一个抽象路径名数组，这些路径名表示此抽象路径名表示的目录中的目录和文件
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
        File[] fs5 = src.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.startsWith("google");
            }
        });
        for (File file : fs5) {
            System.out.println("fs5 -> "+ file.getName());
        }

        //使用相对路径创建文件
        File f2 = new File("src/hahahah.java");
        System.out.println("f2.createNewFile()创建成功：" + f2.createNewFile());

        //返回由此抽象路径名表示的文件的长度(就是里面文本的字节大小)
        System.out.println("f2.length() = " + f2.length());

        //isDirectory()
        //测试次抽象路径名表示的文件是否为一个目录
        System.out.println("f2.isDirectory()是目录：" + f2.isDirectory());
        System.out.println("f2.isFile()是文件:" + f2.isFile());
        System.out.println("f2.getParentFile().isDirectory()是目录：" + f2.getParentFile().isDirectory());

        System.out.println("f1.compareTo(f):" + f1.compareTo(f));
        System.out.println("f1.equals(f):" + f1.equals(f));

        //isAbsolute()
        //测试此抽象路径名是否为绝对路径名
        System.out.println("f.isAbsolute():" + f.isAbsolute());
        System.out.println("f1.isAbsolute():" + f1.isAbsolute());
        System.out.println("f2.isAbsolute():" + f2.isAbsolute());

        //exists()查看文件是否真实存在
        System.out.println("f.exists():" + f.exists());
        System.out.println("f1.exists():" + f1.exists());

        //File getAbsoluteFile()
        //返回此抽象路径名的绝对路径名形式
        File abf = f.getAbsoluteFile();
        System.out.println("abf.getPath():" + abf.getPath());
        System.out.println("f.getPath():" + f.getPath());

        System.out.println("abf.compareTo(f) :" + abf.compareTo(f));
        System.out.println("abf.equals(f) :" + abf.equals(f));

        //String getAbsolutePath()
        //返回此抽象路径名的绝对路径名字符串
        String abp = f.getAbsolutePath();
        System.out.println("abp :" + abp);

        //getName
        //
    }
}
