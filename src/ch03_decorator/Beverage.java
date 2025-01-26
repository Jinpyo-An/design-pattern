package ch03_decorator;

public abstract class Beverage {
    String description = "제목 없음";

    public enum Size {TALL, GRANDE, VENTI};
    Size size = Size.TALL;

    public Beverage() {
    }

    public Beverage(final String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setSize(final Size size) {
        this.size = size;
    }

    public Size getSize() {
        return size;
    }

    public abstract double cost();
}
