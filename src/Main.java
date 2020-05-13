public class Main {

    public static void main(String[] args) {
        change_zero();
        writing_numbers();
        multiply_by_2();
        diagonal();
        max_min();

    }

    public static void change_zero() {
        int[] array = new int[]{1, 0, 1, 0, 0, 1, 1, 1, 1, 0};
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else {
                array[i] = 0;
            }
            System.out.println(array[i]);

        }
    }

    public static void writing_numbers() {
        int[] array = new int[8];
        int j = 0;
        for (int i = 0; i < 8; i++) {
            array[i] = j;
            j += 3;
            System.out.println(array[i]);
        }
    }

    public static void multiply_by_2() {
        int[] array = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] = array[i] * 2;

            }
            System.out.println(array[i]);

        }
    }

    public static void diagonal() {
        int[][] array = new int[4][4];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j) {
                    array[i][j] = 1;
                }

                System.out.print(array[i][j]);

            }
            System.out.println();

        }
    }

    public static void max_min() {

        int[] array = new int[]{1,6,4,7,5,-8,29,2,4,7};
        int max =array[0];
        int min= array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            } if (array[i] < min) {
                min = array[i];
            }

        }
        System.out.println("Max = " + max + " Min = " + min);
    }


}

