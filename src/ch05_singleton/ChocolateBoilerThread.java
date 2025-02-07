package ch05_singleton;

public class ChocolateBoilerThread {

    private boolean empty;
    private boolean boiled;
    private static ChocolateBoilerThread chocolateBoiler = new ChocolateBoilerThread();

    private ChocolateBoilerThread() {
        empty = true;
        boiled = false;
    }

    public static ChocolateBoilerThread getInstance() {
        return chocolateBoiler;
    }

    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
        }
    }

    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            boiled = true;
        }
    }

    public void drain() {
        if (!isEmpty() && isBoiled()) {
            empty = true;
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }
}
