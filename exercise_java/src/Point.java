public class Point {
    //成员属性
    double x;
    double y;

    //无参构造方法
    Point() {
    }

    //有参构造方法
    Point(double x,double y){
        this.x = x;
        this.y = y;
    }

    /**
     * 成员方法（实例方法/对象方法）
     */
    String describe() { return "我是坐标上 （" + x + "," + y + ")的点";}

    /**
     * 成员方法，判断两个点是否是同一个点
     */
    boolean ifSame(Point point) {
        if (this.x == point.x && this.y == point.y){
            return true;
        }else{
            return false;
        }
    }

    /**
     * 成员方法，判断是否为圆点
     * @return
     */
    boolean isZero() {
        if (this.x == 0 && this.y == 0){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
