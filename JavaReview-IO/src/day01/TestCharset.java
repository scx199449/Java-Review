package day01;

import java.io.UnsupportedEncodingException;

//Charset字符编码
public class TestCharset {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String utf_8 = "我是UTF-8";
        //查看字符在计算机中如何占用内存
        byte[] bs = utf_8.getBytes();
        hexString(bs);
        byte[] bs1 = utf_8.getBytes("gbk");
        hexString(bs1);

    }

    private static void hexString(byte[] bs){
        System.out.println("-------------");
        for (byte b :bs){
            System.out.print(Integer.toHexString(b & 0xff) + ",");
        }
        System.out.println();
    }
}
