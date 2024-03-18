// Создаем класс MyRunnable, который реализует интерфейс Runnable
public class MyRunnable implements Runnable {

    // Переопределяем метод run() для выполнения кода в потоке
    @Override
    public void run() {
        // Получаем ID текущего потока с помощью Thread.currentThread().getId()
        long threadId = Thread.currentThread().getId();
        // Выводим ID потока на экран
        System.out.println("Thread ID: " + threadId);
    }

    // Точка входа в программу
    public static void main(String[] args) {
        // Создаем три объекта класса MyRunnable
        MyRunnable myRunnable1 = new MyRunnable();
        MyRunnable myRunnable2 = new MyRunnable();
        MyRunnable myRunnable3 = new MyRunnable();

        // Создаем три потока, передавая каждому объекту MyRunnable
        Thread thread1 = new Thread(myRunnable1);
        Thread thread2 = new Thread(myRunnable2);
        Thread thread3 = new Thread(myRunnable3);

        // Запускаем каждый поток
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
