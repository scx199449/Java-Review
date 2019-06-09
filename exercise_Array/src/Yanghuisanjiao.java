public class Yanghuisanjiao {
    public static void main(String[] args) {
        int lines = 10;
        //定义一个5*5的二维数组
        int[][] arr = new int[lines][lines];
        //两层循环，第一层控制行数，第二层控制列数
        for (int i = 0; i < lines; i++){
            for (int j = lines-1;j > i; j--){
                System.out.print("    ");
            }
            for (int j2 = 0;j2 <= i; j2++){
                if (i == 0 && j2 == 0){
                    arr[i][j2] = 1;
                }else{
                    if (j2 == 0 || j2 == i) {
                        arr[i][j2] = 1;
                    }else{
                        arr[i][j2] = arr[i-1][j2-1] + arr[i-1][j2];
                    }
                }
                System.out.print(arr[i][j2]);
                if (arr[i][j2]/10 == 0){
                    System.out.printf("       ");
                }else if (arr[i][j2]/100 == 0){
                    System.out.printf("      ");
                }else if (arr[i][j2]/1000 == 0){
                    System.out.printf("     ");
                }
            }
            System.out.println();

        }



    }
}
