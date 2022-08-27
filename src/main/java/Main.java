public class Main {
    public static void main(String[] args) {
        System.out.println("Create 2D random array: ");
        int[][] random = new int[5][5];
        for (int i = 0; i < random.length; i++) {
            for (int j = 0; j < random.length; j++) {
                random[i][j] = (int) (Math.random() * 10);
            }
        }
        printArray(random);
        System.out.println("Max: " + findMax(random));
        System.out.println("Min: " + findMin(random));
        System.out.println("Average: " + findAverage(random));

        int[] array =  new int[]{5,6,3,2,5,1,4,9,12,44,51,0,3};
        System.out.print("\nSorted array: ");
        printArray(bubbleSort(array));
    }
    public static int[] bubbleSort(int[] array) {
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
    public static void printArray(int[][] array) {
        for (int[] ints : array) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
    }
    public static int findMax(int[][] array) {
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i][j] > max) max = array[i][j];
            }
        }
        return max;
    }
    public static int findMin(int[][] array) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i][j] < min) min = array[i][j];
            }
        }
        return min;
    }
    public static int findAverage(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                sum+=array[i][j];
            }
        }
        return sum/array.length;
    }
}
