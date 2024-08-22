//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int ticket = 13_676; // стоимость билета
        int priceMile = 20; // количество рублей для одной бонусной мили

        int miles = ticket / priceMile; // количество бонусных миль

        System.out.println("Количество бонусных миль: " + miles);

    }
}