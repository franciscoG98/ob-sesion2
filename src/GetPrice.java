public class GetPrice{
    public static void main(String[] args) {

        int price = 10;
        double priceWithIva = getPrice(price);
        System.out.println(priceWithIva);

    }

    static double getPrice(int price){
        double iva = 1.21;
        return price * iva;
    }
}