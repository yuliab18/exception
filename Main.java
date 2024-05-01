import exp.SecondClass;

public class Main {
    public static void main(String[] args) {
        SecondClass secondClass  = new SecondClass();
        int value1 = 10;
        int value2 = 0;
        int value3 = 150;

        try {
            secondClass.generateValue();
            secondClass.handleValue(value2);
            secondClass.manipulateValue(value3);
        } catch (Exception e) {
            System.out.println("Перехоплено виняток: " + e.getMessage());
        }
    }
}
