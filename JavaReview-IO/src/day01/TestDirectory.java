package day01;

import java.io.File;

//目录操作
public class TestDirectory {
    public static void main(String[] args) {
        //Java IO 中对目录的抽象操作依然是File类
        //isDirectory()方法，可以判断该抽象对象是否是一个目录
        File parent = new File("C:\\Users\\asus\\Desktop");
        System.out.println("parent是目录：" + parent.isDirectory());

        File HelloWorld = new File("C:\\Users\\asus\\Desktop\\HelloWorld.java");
        System.out.println("HelloWorld 是目录：" + HelloWorld.isDirectory());

        //增加
        File haha = addDirectory(parent,"hahaha");//单层目录使用mkdir()
        File xixi = addDirectory(parent,"hahaha\\xixixi");//多层目录使用mkdirs()
        File e = addDirectory(parent,"a\\b\\c\\d\\e");

        //删除
        System.out.println("deleteDirectory(hahaha)成功 :" + deleteDirectory(haha));
        System.out.println("deleteDirectory(xixi)成功 :" + deleteDirectory(xixi));
        System.out.println("deleteDirectory(e)成功 :" + deleteDirectory(e));

        //如何删除a目录?
        //当要删除一个目录时，如果目录里面不为空，则不能删除
        File a = new File(parent,"a");
        deleteDirectory(a);

        //修改
        System.out.println("changeDirectory(parent,\"hahaha\",\"hahaha1\")改名成功："
                + changeDirectory(parent,"hahaha","hahaha1"));

        //查询目录a中，是否存在名字为c的目录
        System.out.println(a.getAbsolutePath() + "目录中存在c目录:" + findDirectory(a,"c"));
        System.out.println(a.getAbsolutePath() + "目录中存在x目录:" + findDirectory(a,"x"));
    }

    /**
     * 查找目录
     * @param parent 父目录
     * @param string 需要查找的目录
     * @return
     */
    private static boolean findDirectory(File parent,String string) {
        //获取父目录下的所有文件和目录对象
        File[] fs = parent.listFiles();
        //遍历所有对象
        for (File file : fs) {
            //如果是目录就进行处理
            if (file.isDirectory()) {
                if (file.getName().equals(string)) {
                    return true;
                }
                //如果当前目录不是目标目录，就回调查看他里面是否包含目标目录
                return findDirectory(file,string);
            }
        }
        return false;
    }

    /**
     * 修改目录
     * @param parent 父目录
     * @param str1  需要修改的目录
     * @param str2  修改过后的目录
     * @return
     */
    private static boolean changeDirectory(File parent,String str1,String str2) {
        File file = new File(parent,str1);
        File file1 = new File(parent,str2);
        return file.renameTo(file1);
    }

    /**
     * 删除文件夹
     * @param hahah 需要被删除的文件夹
     * @return
     */
    private static boolean deleteDirectory(File hahah) {
        return hahah.delete();
    }

    /**
     * 添加文件夹
     * @param parent 父目录
     * @param child  子目录
     * @return
     */
    private static File addDirectory(File parent,String child) {
        File f = new File(parent,child);
        //mkdir()方法可以创建文件夹
        //如果路径下已经存在该名字，则创建失败
        boolean b = f.mkdir();
        boolean b1 = f.mkdirs();
        System.out.println("b = mkdir()文件夹创建成功：" + b);
        System.out.println("b1 = mkdirs()文件夹创建成功 ：" + b1);
        return f;
    }
}
