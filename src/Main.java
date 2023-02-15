public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] weight = new int[]{1,2,3};
        double[] fraction = {1.57, 7.654, 9.986};
        int[] my = {54, 43, 76};
    }

    public static void task2() {
        System.out.println("Задача 2");
        int[] weight = new int[3];
        weight[0] = 1;
        weight[1] = 2;
        weight[2] = 3;
        double[] fraction = {1.57, 7.654, 9.986};
        int[] my = {54, 43, 76};
        System.out.println(weight[0] + ", " + weight[1] + ", " + weight[2]);
        System.out.println(fraction[0] + ", " + fraction[1] + ", " + fraction[2]);
        System.out.println(my[0] + ", " + my[1] + ", " + my[2]);
    }

    public static void task3() {
        System.out.println("Задача 3");
        int[] weight = new int[3];
        weight[0] = 1;
        weight[1] = 2;
        weight[2] = 3;
        double[] fraction = {1.57, 7.654, 9.986};
        int[] my = {54, 43, 76};
        System.out.println(weight[2] + ", " + weight[1] + ", " + weight[0]);
        System.out.println(fraction[2] + ", " + fraction[1] + ", " + fraction[0]);
        System.out.println(my[2] + ", " + my[1] + ", " + my[0]);
    }

    public static void task4() {
        System.out.println("Задача 4");
        int[] weight = new int[3];
        weight[0] = 1;
        weight[1] = 2;
        weight[2] = 3;
        double[] fraction = {1.57, 7.654, 9.986};
        int[] my = {54, 43, 76};
        for (int i = 0; i < weight.length; i++) {
            if (weight[i] % 2 == 0) {
                System.out.println(weight[i]);
            } else {
                weight[i] = weight[i] + 1;
                System.out.println(weight[i]);
            }

        }
    }
}
