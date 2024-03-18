import java.util.concurrent.CopyOnWriteArrayList;

// Класс для чтения чисел из списка
class Reader implements Runnable {
    private CopyOnWriteArrayList<Integer> listOfNumbers;

    public Reader(CopyOnWriteArrayList<Integer> listOfNumbers) {
        this.listOfNumbers = listOfNumbers;
    }

    @Override
    public void run() {
        while (true) {
            for (Integer number : listOfNumbers) {
                System.out.println("Reader: " + number);
                try {
                    Thread.sleep(100); // Временная задержка
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}