public class Main {

    public static void main(String[] args) {
        // write your code here
//        int[] array = {1, 2, 3}; // 初始化数组
//
//        System.out.println(func1(array));


        Array arr = new Array(20);
        for (int i = 0; i < 10; i++) {
            arr.addLast(i);
        }
        System.out.println(arr);

        arr.add(1, 100);
        System.out.println(arr);

        arr.addFirst(-1);
        System.out.println(arr);

        arr.remove(2);
        System.out.println(arr);

        arr.removeElement(4);
        System.out.println(arr);
    }

    public static int[] func1(int[] array) {
        return array;
    }
}
