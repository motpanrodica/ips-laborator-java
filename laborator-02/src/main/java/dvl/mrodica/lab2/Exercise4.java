package dvl.mrodica.lab2;

public class Exercise4 {
    public static void main(String[] args) throws InterruptedException {
        int count = 10;
        while (count > 0 ) {
            System.out.println("Count is: " + count);
            count--;
            Thread.sleep(1000);
        }
    }
}