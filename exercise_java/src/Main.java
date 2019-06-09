public class Main {

    public static void main(String[] args) {
        Point point1 = new Point(1.1,1.3);
        Point point2 = new Point(1.1,1.4);
        System.out.println(point1.describe());
        System.out.println(point1);

        System.out.println(point1.ifSame(point2));
        System.out.println(point1.isZero());

        //计算一根线的长度
        double linelenth = Math.sqrt((point1.x-point2.x)*(point1.x-point2.x)+(point1.y-point2.y)*(point1.y-point2.y));
        System.out.println("线的长度是："+linelenth);
    }
}
