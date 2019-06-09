public class MyArray {

    public static void main(String[] args) {
        //1、数组的声明
        int[] arr;
        int arr1[];

        //2、初始化数组
        arr = new int[5];

        //3、往数组中添加元素
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;

        //4、输出数组中的元素
        for (int i = 0;i < 5; i++){
            System.out.println("arr["+i+"] = "+arr[i]);
        }
    }
}
