public class Main {
    public static void main(String[] args) {
        int[] array =  new int[]{5,6,3,2,5,1,4,9};
        printArray(sort(array));

        int[] random = new int[10];
        for (int i = 0; i < random.length; i++) {
            random[i] = (int)(Math.random()*10);
        }
        printArray(random);
        System.out.println(findMax(random));
        System.out.println(findMin(random));
        System.out.println(findAverage(random));

    }
    public static int[] sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
           for (int j = 0; j < array.length; j++) {
               if (i!=j && array[i] < array[j]) {
                   int temp = array[j];
                   array[j] = array[i];
                   array[i] = temp;
               }
           }
        }
        return array;
    }
    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static int findMax(int[] array) {
        int max = 0;
        for (int j : array) {
            if (j > max) max = j;
        }
        return max;
    }
    public static int findMin(int[] array) {
        int min = 0;
        for (int j : array) {
            if (j < min) min = j;
        }
        return min;
    }
    public static int findAverage(int[] array) {
        int sum = 0;
        for (int i: array) {
            sum+=i;
        }
        return sum/array.length;
    }
}
