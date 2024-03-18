// Класс для записи чисел в список
import java.util.concurrent.CopyOnWriteArrayList;
class Writer implements Runnable {
    private CopyOnWriteArrayList<Integer> listOfNumbers;

    public Writer(CopyOnWriteArrayList<Integer> listOfNumbers) {
        this.listOfNumbers = listOfNumbers;
    }

    @Override
    public void run() {
        int number = 0;
        while (true) {
            listOfNumbers.add(number);
            System.out.println("Writer added: " + number);
            number++;
            try {
                Thread.sleep(200); // Временная задержка
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}