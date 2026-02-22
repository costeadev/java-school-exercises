package oop.collections;

public class Loading {
    public static void main(String[] args)  {
        loading(200);
    }
    private static void loading(int ms) {
        for (int i = 0; i <= 100; i++) {
            System.out.printf("\rLoading: %d%% %s", i ,"=".repeat(i));
            try {
                Thread.sleep(ms);
            } catch (InterruptedException e) {
                System.err.println("Something went wrong...");;
            }
        }
    }
}
