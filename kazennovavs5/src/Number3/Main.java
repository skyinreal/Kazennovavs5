package Number3;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Phone phone1 = new Phone("89040666128", "Iphone14ProMax");
        Phone phone2 = new Phone("88005553535", "Nokia");
        Phone phone3 = new Phone("89006735468", "ФрутоНяня");

        phone1.receiveCall("Егор");
        System.out.println(phone1.getNumber());
        phone1.receiveCall("Вероничка", "8*********9");
        String[] numbers = {"899999999999","81111111111","890590490390"};

        phone1.sendMessage(numbers);
    }
}