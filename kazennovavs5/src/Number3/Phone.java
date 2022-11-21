package Number3;

import javax.xml.namespace.QName;

public class Phone {
    private String number;
    private String model;
    private String weight;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public void receiveCall(String name){
        System.out.println("Звонит" + name);
    }
    public void receiveCall(String name, String number){
        System.out.println(number+" "+ "Звонит" + name);
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
    }

    public Phone(String number, String model,String weight) {
        this (number, model);
        this.weight = weight;
    }
    public void sendMessage(String[] numbers){
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);

        }
    }
}
