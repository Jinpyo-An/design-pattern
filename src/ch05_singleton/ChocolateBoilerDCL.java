package ch05_singleton;

public class ChocolateBoilerDCL {

    private boolean empty;
    private boolean boiled;
    private volatile static ChocolateBoilerDCL chocolateBoiler;

    private ChocolateBoilerDCL() {
        empty = true;
        boiled = false;
    }

    public static synchronized ChocolateBoilerDCL getInstance() {
        if (chocolateBoiler == null) {
            synchronized (ChocolateBoilerDCL.class) {
                if (chocolateBoiler == null) {
                    chocolateBoiler = new ChocolateBoilerDCL();
                }
            }
        }

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
