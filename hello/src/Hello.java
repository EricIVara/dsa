public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        for(int i = 1; i > 0; i++){

            System.out.println(i);

            try {
                Thread.sleep(10); // Pauses for 500 milliseconds (0.5 seconds)
            } catch (InterruptedException e) {
                e.printStackTrace(); // Handle the InterruptedException
            }
        }
    }
}
