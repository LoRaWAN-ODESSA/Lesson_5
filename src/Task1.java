public class Task1 {
    int exception1;
    int exception2;

    public void getResult1() {
        System.out.println("Task 1:");
        System.out.println("Exception number 1 = " + exception1);
        System.out.println("Exception number 2 = " + exception2);
        System.out.println("Numbers:");
        for(int x = 0; x <= 100; x++) {
            if(x == exception1 || x == exception2) {
                continue;
            } else {
                System.out.print(x + " ");
            }
        }
    }
}
