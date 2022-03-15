package skyPro;

public class Main {

    public static void main(String[] args) {
// Задача 1 ==============================================================
        int first[] = new int[3];
        first[0] = 1;
        first[1] = 2;
        first[2] = 3;
        double second[] = new double[]{1.57, 7.654, 9.986};
        int third[] = new int[]{15, 45, 0, 34, 89, 900};
// Задача 2 ==============================================================
        for (int f = 0; f < first.length - 1; f++) {  // выводим 1-й массив
            System.out.print(first[f] + ", ");
        }
        System.out.println(first[first.length - 1]);
        for (int f = 0; f < second.length - 1; f++) {  // выводим 2-й массив
            System.out.print(second[f] + ", ");
        }
        System.out.println(second[second.length - 1]);
        for (int f = 0; f < third.length - 1; f++) {  // выводим 3-й массив
            System.out.print(third[f] + ", ");
        }
        System.out.println(third[third.length - 1]);
// Задача 3 ==============================================================
        for (int f = first.length - 1; f > 0; f--) {  // выводим 1-й массив в обратном порядке
            System.out.print(first[f] + ", ");
        }
        System.out.println(first[0]);
        for (int f = second.length - 1; f > 0; f--) {  // выводим 2-й массив в обратном порядке
            System.out.print(second[f] + ", ");
        }
        System.out.println(second[0]);
        for (int f = third.length - 1; f > 0; f--) {  // выводим 3-й массив в обратном порядке
            System.out.print(third[f] + ", ");
        }
        System.out.println(third[0]);

// Задача 4 ==============================================================
        for (int f = 0; f < first.length; f++) {
            if (first[f] % 2 != 0) {
                first[f] = first[f] + 1;
            }
            System.out.print(first[f] + " ");  // печатаем получившиеся четные значения

        }
    }
}
