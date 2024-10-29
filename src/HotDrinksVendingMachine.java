import java.util.HashMap;
import java.util.Map;

public class HotDrinksVendingMachine implements VendingMachine {
    private Map<String, HotDrink> products;

    public HotDrinksVendingMachine() {
        products = new HashMap<>();
    }

    // Метод добавления продукта в автомат
    public void addProduct(HotDrink product) {
        if (product != null) {
            products.put(product.getName().toLowerCase(), product);
        }
    }

    // Реализация метода интерфейса ТорговыйАвтомат
    // Поиск напитка по названию и объему
    // Если такой напиток есть, то возвращаем его копию
    public HotDrink getProduct(String name, int volume) {
        HotDrink original = products.get(name.toLowerCase());
        if (original != null && original.getVolume() == volume) {
            try {
                return (HotDrink) original.clone();
            } catch (CloneNotSupportedException e) {
                System.out.println("Ошибка клонирования: " + e.getMessage());
            }
        }
        return null;
    }

    // Перегрузка метода для поиска напитка по температуре
    // Возвращает копию напитка, соответствующего всем параметрам
    public HotDrinkTemperature getProduct(
            String name,
            int volume,
            int temperature) {

        HotDrink оригинал = products.get(name.toLowerCase());
        if ((оригинал != null) &&
                (оригинал.getVolume() == volume) &&
                ((HotDrinkTemperature) оригинал).getTemperature() == temperature) {

            try {
                HotDrinkTemperature копия = (HotDrinkTemperature) orig.clone();
                return копия;
            } catch(CloneNotSupportedException ex) {
                System.err.println("Клонирование невозможно: " + ex.getMessage());
            }
        }

        return null;
    }
}