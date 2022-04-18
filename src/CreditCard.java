public class CreditCard {
    String cardNumber;
    String owner;
    String type;

    public void printText() {
        System.out.println("\n\nTask 3:");
    }
    public void getResult3() {
        switch (type) {
            case "VISA":
                System.out.println("Dr. " + owner + " congratulations, you are using a normal card");
                break;
            case "MASTERCARD":
                System.out.println("Dr. " + owner + " congratulations, you are using a normal card");
                break;
            case "MIR":
                System.out.println("Dr. " + owner + " get the fuck out with your russian warship");
                break;
            default:
                System.out.println("Dr. " + owner + " sorry, you are using unknown card type");
        }
    }
}
