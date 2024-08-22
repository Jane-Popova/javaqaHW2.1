public class Main {
    public static void main(String[] args) {

        int ticket = 13_676; // стоимость билета
        int priceMile = 20; // количество рублей для одной бонусной мили

        int miles = ticket / priceMile; // количество бонусных миль

        System.out.println("Количество бонусных миль: " + miles);

    }
}