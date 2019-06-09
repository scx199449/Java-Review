package day01;

import java.io.File;
import java.io.IOException;
import java.util.Date;

//IO 中的文件操作
public class TestFile {
    public static void main(String[] args) throws IOException {
        //File类
        //一、通过给定路径名字符串转换为抽象路径名来创建一个新File实例
        //因为操作系统不一样，所以目录层级分隔符不一样
        //绝对路径
        File f = new File("C:\\Users\\asus\\Desktop\\HelloFile.java");
        //如何证明f就是HelloFile.java这个文件?
        showInfo(f);

        //二、根据parent抽象路径名和child路径名字符串创建一个新FIle实例
        //相对路径
        File parent = new File("C:\\Users\\asus\\Desktop");
        String child = "HelloFile.java";
        File f1 = new File(parent,child);
        showInfo(f1);

        //三、根据parent路径名字符串和child路径名字符串创建一个新File实例
        File f2 = new File("C:\\Users\\asus\\Desktop","HelloFile.java");
        showInfo(f2);

        //增
        File HelloFile2 = addFile();
        //删
        deleteFile(f);
        deleteFile(f1);
        deleteFile(f2);
        //改
        changeFile(HelloFile2);
        //查
        findFile(parent,"hello.java");

    }

    /**
     * 查询文件
     * @param parent 目录
     * @param fileName 要查询的文件名字
     */
    private static void findFile(File parent,String fileName) {
        //获取目录下的所有文件或目录
        File[] fs = parent.listFiles();
        for (File file : fs) {
            if (file.getName().equals(fileName)) {
                System.out.println(fileName + "在" + parent.getPath() + "目录中");
                return;
            }
        }
        System.out.println(fileName + "不在" + parent.getPath() + "目录中");
    }

    /**
     * 修改File实例
     * @param f
     */
    private static void changeFile(File f) {
        File dest = new File("C:\\Users\\asus\\Desktop","Hello.java");
        f.renameTo(dest);
    }

    /**
     * 删除File实例
     * @param f
     */
    private static void deleteFile(File f) {
        f.delete();
    }

    /**
     * 创建实际文件
     * @return
     * @throws IOException
     */
    private static File addFile() throws IOException {
        //如果一不小心，文件的名字写错了会出现什么结果?
        File f3 = new File("C:\\Users\\asus\\Desktop\\HelloFile1.java");
        //如果要创建实际的文件，必须调用此方法，否则创建出来的是虚拟文件，之在内存中存在
        boolean result = f3.createNewFile();
        System.out.println("文件创建成功:" + result);
        showInfo(f3);
        return f3;
    }

    /**
     *
     * @param f
     */
    private static void showInfo(File f){
        System.out.println("抽象对象 f 所代表的文件的名字是：" + f.getName());
        System.out.println("抽象对象 f 所最后更新（修改）日期是:" + f.lastModified());
        Date d = new Date(f.lastModified());
        System.out.println(d);
        System.out.println();
    }
}
