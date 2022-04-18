public class Task2 {
    int i;
    int maxValue;

    public void getResult2() {

        System.out.println("\n\nTask 2:");
        System.out.println("Max number = " + maxValue);

        for(int x = 1; i < maxValue; x++) {
            i *= x;
        }
        System.out.println("Result = " + i);

    }
}
