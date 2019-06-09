public class PlanarArray {
    public static void main(String[] args) {
        //二维数组
        int[][] arr = {{1,2,3},{2,2,2},{3,3,1}};
        //遍历二维数组
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        // 某校幼儿园有3个班，每个班有5个人，计算各班平均年龄？计算全园平均年龄？？计算总人数？
        int student[][] = {{3,6,4,5,4},{2,3,5,3,2},{3,4,6,2,4}};
        //班级平均年龄
        for (int i = 0;i < student.length; i++){
            int sum = 0;
            for (int j = 0; j < student[i].length; j++){
                sum += student[i][j];
            }
            double averange = sum/(double)student[i].length;
            System.out.println("第" + (i+1) + "班级平均年龄是:" + averange);
        }
        //全园平均年龄
        int sum = 0;
        int count = 0;
        for (int i = 0;i < student.length; i++){
            for (int j = 0;j < student[i].length; j++){
                sum += student[i][j];
                count++;
            }
        }
        double avg = sum/(double)count;
        System.out.println("全园的平均年龄是:" + avg);
        //总人数
        System.out.println("全园的总人数是:"+count);
    }
}
