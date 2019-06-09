import java.util.Arrays;

public class ArrayPractice {
    //交集
    public static int[] getJiaoji(int[] arr1,int[] arr2){
        int length = arr1.length < arr2.length? arr1.length:arr2.length;
        int[] arr = new int[length];
        int index = 0;
        for(int i = 0;i < arr1.length;i++){
            for (int j = index;j < arr2.length;j++){
                if (arr1[i] == arr2[j]){
                    int temp = arr2[index];
                    arr2[index] = arr2[j];
                    arr2[j] = temp;
                    arr[index] = arr2[index];
                    index++;
                    break;
                }
            }
        }
        int[] result = new int[index];
        for (int i = 0;i < index;i++){
            result[i] = arr[i];
        }
        return result;

    }

    //并集
    public static int[] getBingji(int[] arr1,int[] arr2){
        int length = arr1.length + arr2.length;
        int[] arr = new int[length];
        int equal = 0;
        int notEqual = 0;
        for (int i = 0;i < arr1.length;i++){
          for (int j = equal;j < arr2.length;j++){
              if(arr1[i] == arr2[j]){
                  int temp = arr2[j];
                  arr2[j] = arr2[equal];
                  arr2[equal] = temp;
                  equal++;
                  break;
              }
              //如果arr1数组中的元素与arr2数组每个元素比较都没有相等的，则应该放入并集数组arr中
              if (j == arr2.length-1){
                  arr[notEqual + arr2.length] = arr1[i];
                  notEqual++;
              }
          }
        }
        //将arr2中的元素放入arr中
        for (int i = 0;i < arr2.length;i++){
            arr[i] = arr2[i];
        }
        //输出最终结果
        int[] result = new int[arr.length - equal];
        for (int i = 0;i < result.length;i++){
            result[i] = arr[i];
        }
        return result;
    }

    public static void main(String[] args) {
          int[] arr1 = {1,2,3,4,1,5,6,9,0,0};
          int[] arr2 = {1,10,1,2,3,7,1,0,0};
          int[] arr = getJiaoji(arr1,arr2);
          int[] arr_bingji = getBingji(arr1,arr2);
          System.out.println(Arrays.toString(arr));
          System.out.println(Arrays.toString(arr_bingji));
    }
}
