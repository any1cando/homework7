import java.util.concurrent.Semaphore;

public class StudentBuffet {

    public static void main(String[] args) {
        System.out.println("Куманцов Максим Александрович");
        System.out.println("РИБО-01-21");

        Semaphore table = new Semaphore(2);

        for (int i = 1; i <= 7; i++) {
            Thread student = new Thread(new Student(i, table));
            student.start();
        }
    }
}