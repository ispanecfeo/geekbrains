package avdeev.geekbrains;

public class ExchangeElementsArray {

    public static void exchange(Object[] arr) {
        if (arr.length >= 2) {
            Object tmp = arr[0];
            arr[0] = arr[1];
            arr[1] = tmp;

        }
    }

}
