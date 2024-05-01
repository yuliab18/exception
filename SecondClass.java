package exp;

import java.util.Random;

 public class SecondClass {
    private int value;

    public void setValue(int value) {
        this.value = value;
    }

    public int generateValue() throws Exception {
        Random random = new Random();
        int randomNumber = random.nextInt(10);
        if (randomNumber < 5) {
            throw new Exception("Згенероване значення менше 5: " + randomNumber);
        }
        return randomNumber;
    }

    public void handleValue(int value) throws Exception {
        if (value % 2 == 0) {
            throw new customException("Значення парне: " + value);
        }
        System.out.println("Значення непарне: " + value);
    }

    public void manipulateValue(int value) {
        try {
            handleValue(value);
        } catch (Exception e) {
            System.out.println("Виняток опрацьований в методі manipulateValue(): " + e.getMessage());
        }
    }
}
