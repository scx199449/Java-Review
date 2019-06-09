public class PlaceHolder {
   //占位符
    public static void main(String[] args) {
        int a = 100;
        int b = 1994;

        float f = 3.141592653f;
        double d = 3.141592653;

        // %f 是浮点数的占位符，保留几位就%.Xf,默认是保留6位
        System.out.printf("f = %.1f,d = %.3f %n",f,d);
        // %X是16进制的占位符，%o是8进制的占位符
        System.out.printf("1994的16进制是：%x,100的8进制是：%o",b,a);
        //%s是输出字符串的占位符
        String str = "hello world";
        System.out.printf("%n str中存放的字符串是：%s",str);
        //%c 是单个字符的占位符
        char c = 'a';
        System.out.printf("%n c 中存放的字符是：%c",c);
        //%b 是布尔类型的占位符
        boolean bool = false;
        System.out.printf("%n bool中的字符是：%b",bool);
        //ASCII 码
        //计算机在内存中存储符号时，会按照一定的编码规则，转换成对应的数字，然后再按照二进制存入内存中
        System.out.printf("%n ASCII码中 33是字符：%c",33);

    }
}
