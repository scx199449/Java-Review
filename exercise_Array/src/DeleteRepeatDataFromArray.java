public class DeleteRepeatDataFromArray {
    /**
     * 创建指定大小的整型数组
     */
    public static int[] createArray(int length) {
        return new int[length];
    }

    /**
     * 判断数组中是否存在某个元素
     */
    public static boolean isExits(int data,int[] arr) {
        for (int i = 0;i < arr.length;i++){
            if(arr[i] == data) {
                return true;
            }
        }
        return false;
    }

    /**
     * 获取一个数组中重复元素下标组成的新数组
     */
    public static int[] getRepeatIndex(int[] arr) {
        //创建一个空数组用于存重复的元素下标
        int[] arr_indexs = new int[arr.length];
        int index = 0;
        for(int i = 0;i < arr.length;i++){
            //如果当前下标已经在放重复下标的数组中，则跳过本次操作
           if(i != 0 && isExits(i,arr_indexs)){
               continue;
           }
           //遍历当前元素之后的元素，如果重复，则把后面重复的元素的下标放入数组
           for(int j = i + 1;j < arr.length;j++){
               if(arr[i] == arr[j]) {
                   arr_indexs[index++] = j;
               }
           }
        }
        //计算重复元素数组的长度
        int n = 0;
        for(int i = 0;i < arr_indexs.length;i++){
            if(arr_indexs[i] != 0){
                n++;
            }
        }
        int[] result = new int[n];
        //把重复元素的下标放入最终的数组中，排除为0的
        for(int i = 0;i < n;i++){
            result[i] = arr_indexs[i];
        }
        return result;
    }

    /**
     * @param arr 原数组
     * @param repeatIndexsArray 重复下表的数组
     * @return 没有重复元素的数组
     */
    public static int[] getNoRepeatedArray(int[] arr,int[] repeatIndexsArray){
        //创建一个数组用于装无重复的元素
        int[] result = new int[arr.length-repeatIndexsArray.length];
        int index = 0;
        for(int i = 0;i < arr.length;i++){
            if(i != 0 && isExits(i,repeatIndexsArray)){
                continue;
            }
            result[index++] = arr[i];
        }
        return result;
    }

    public static void printArray(int[] arr){
        for(int i = 0;i < arr.length;i++){
            System.out.print(arr[i]+",");
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,2,3,1,4,5,2,5,6};
        //1、存放重复下标的数组
        int[] repeatIndexsArray = getRepeatIndex(arr);
        //2、得到取出重复元素的数组
        int[] lastArray = getNoRepeatedArray(arr,repeatIndexsArray);

        //打印结果
        printArray(repeatIndexsArray);
        System.out.printf("%n");
        printArray(lastArray);

    }
}


