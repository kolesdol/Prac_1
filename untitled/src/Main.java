import java.util.concurrent.CopyOnWriteArrayList;
public class Main {

    public static void main(String[] args) {
        CopyOnWriteArrayList<Integer> listOfNumbers = new CopyOnWriteArrayList<>();

        // Создаем объекты Reader и Writer
        Reader reader = new Reader(listOfNumbers);
        Writer writer = new Writer(listOfNumbers);

        // Создаем потоки для Reader и Writer
        Thread readerThread = new Thread(reader);
        Thread writerThread = new Thread(writer);

        // Запускаем потоки
        readerThread.start();
        writerThread.start();
    }
}