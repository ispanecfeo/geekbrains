package avdeev.geekbrains;

public class MyArrayDataException extends Exception{

    private int row;
    private int col;
    private String val;

    public MyArrayDataException(String message, int row, int col, String value) {
        super(message);
        this.row = row;
        this.col = col;
        this.val = value;
    }

    @Override
    public String getMessage() {
        return "Произошла ошибка преобразования к числу в ячейке [" + row + "] [" + col + "]. Попытка привести значение " + val;
    }
}
