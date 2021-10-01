import java.util.stream.IntStream;

class NumbersThread extends Thread {

    private final int from;
    private final int to;

    public NumbersThread(int from, int to) {
        // implement the constructor
        this.from = from;
        this.to = to;
    }

    // you should override some method here

    @Override
    public void run() {
        super.run();

        IntStream.rangeClosed(from, to)
                .forEachOrdered(System.out::println);
    }
}