import java.util.Arrays;

public class Arr {
    private int[] arr;
    private int length;

    public Arr(int[] arr) {

        this.arr = arr;
        this.length = arr.length;
    }
    public void push(int value) {

       int[] arrTmp = new int[length + 1];
       for (int i = 0; i < this.length; i++) {
           arrTmp[i] = arr[i];
       }
       arrTmp[length] = value;
       this.arr = arrTmp;
       this.length++;
    }

    public void printArr() {

        System.out.println(Arrays.toString(this.arr));
    }
}
