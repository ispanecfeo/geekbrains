package avdeev.geekbrains;

public class Main {

    public static void main(String[] args)  {

        String[][] arr = new String[][] {
                    {"1", "1", "1", "1"},
                    {"1", "1", "1", "1"},
                    {"1", "1", "1", "1"},
                    {"1", "1", "1", "1"},
                    {"1", "1", "1", "1"}
        };

        try {
            arrayProcessing(arr);
        } catch (MyArraySizeException e) {
            System.out.println(e.getMessage());
        }

        String[][] arrSum = new String[][] {
                {"2", "1", "5", "1"},
                {"1", "4", "r", "1"},

        };

        try {
            sumArray(arrSum);
        } catch (MyArrayDataException e) {
            System.out.println(e.getMessage());
        }

    }

    static void arrayProcessing(String[][] arr) throws MyArraySizeException {

        if (arr.length != 4) throw new MyArraySizeException("Размер массива должен быть 4 x 4");
        if (arr[0].length != 4) throw new MyArraySizeException("Размер массива должен быть 4 x 4");

    }

    static void sumArray(String[][] arr) throws MyArrayDataException {

        int sum = 0;
        int row = 0;

        for (String[] strings : arr) {
            for (int j = 0; j < strings.length; j++) {
                try {
                    sum += Integer.parseInt(strings[j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Не удалось преобразовать сообщение", row, j, strings[j]);
                }

            }
            row++;
        }
        System.out.println("Сумма массива равна " + sum);

    }

}
