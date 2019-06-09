import java.util.Arrays;

public class ArraySort {
    //冒泡排序(最外面一层控制需要比较的轮数，内层控制每一轮需要比较的次数)
    public static int[] MaoPao(int[] arr){
        for (int i = 0; i < arr.length; i++){
            for (int j = 1;j < arr.length - i; j++){
              if (arr[j] < arr[j-1]){
                  int temp = arr[j];
                  arr[j] = arr[j-1];
                  arr[j-1] = temp;
              }
            }
        }
        return arr;
    }

    //选择排序
    public static int[] selectSort(int[] arr){
        for (int i = 0;i < arr.length - 1; i++){
            int minIndex = i + 1;
            for (int j = minIndex + 1; j < arr.length; j++){
                minIndex = arr[minIndex] < arr[j] ? minIndex:j;
            }
            if (arr[i] > arr[minIndex]){
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
        return arr;
    }

    //插入排序
    public static int[] insertSort(int[] arr){
        for (int i = 1;i < arr.length; i++){
            int temp = arr[i];
            for (int j = i - 1; j >= 0; j++){
                if (arr[j] > temp){
                    arr[j+1] = arr[j];
                    if (j == 0) {
                        arr[j] = temp;
                    }
                }else{
                    arr[j+1] = temp;
                    break;
                }
            }
        }
        return arr;
    }


    public static void main(String[] args) {
         int[] arr = {100,10,4,2,3,7,5};
         System.out.println(Arrays.toString(MaoPao(arr)));
         System.out.println(Arrays.toString(selectSort(arr)));
         System.out.println(Arrays.toString(insertSort(arr)));
    }
}
