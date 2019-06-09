public class TestArray {
    //获取一个数组中重复的次数
    public static int getRepeatItems(int[] arr) {
        int len = arr.length;
        int number = 0;//存放最终统计的数组重复的次数
        for (int i = 0;i < len-1 ; i++){
          for (int j = (i+1);j < len; j++){
              if (arr[i] == arr[j]) {
                  number++;
                break;
              }
          }
        }
        return number;

    }

    public static void main(String[] args) {
        int[] arr = {1,3,5,6,7,3,3,6,3,5,1,1};
        int number = getRepeatItems(arr);
        System.out.println(number);
    }
}


