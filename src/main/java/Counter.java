package src.main.java;

public class Counter {
    private int count;

    public Counter() {
        this.count = 0;
    }

    public int increaseBy(int number) {
        this.count += number;
        return this.count;
    }

    public int decreaseBy(int number) {
        this.count -= number;
        return this.count;
    }

    public int multiplyBy(int number) {
        this.count *= number;
        return this.count;
    }

    public int getCount() {
        return this.count;
    }
}
