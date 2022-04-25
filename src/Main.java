public class Main {
    public static void main(String[] args) {
        int[] arr = new int[] {10, 20, 30, 40};
        Arr arr1 = new Arr(arr);
        arr1.printArr();
        arr1.push(50);
        arr1.printArr();
    }
}
