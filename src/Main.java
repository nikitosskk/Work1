public class Main {
    public static void main(String[] args) {
        // Создаем экземпляры горячих напитков
        HotDrink кофе = new HotDrink("Кофе", 200);
        HotDrink чай = new HotDrink("Чай", 300);
        HotDrinkTemperature какао = new HotDrinkTemperature("Какао", 250, 70);

        // Создаем экземпляр автомата
        HotDrinksVendingMachine автомат = new HotDrinksVendingMachine();

        // Добавляем напитки в автомат
        автомат.addProduct(кофе);
        автомат.addProduct(чай);
        автомат.addProduct(какао);

        // Получение напитка из автомата
        HotDrink полученныйКофе = автомат.getProduct("кофе", 200);
        HotDrink полученныйЧай = автомат.getProduct("чай", 300);
        HotDrinkTemperature полученныйКакао = автомат.getProduct("какао", 250, 70);

        // Проверяем полученные напитки
        if (полученныйКофе != null) {
            System.out.println("Получен кофе: " + полученныйКофе);
        } else {
            System.out.println("Не удалось получить кофе.");
        }

        if (полученныйЧай != null) {
            System.out.println("Получен чай: " + полученныйЧай);
        } else {
            System.out.println("Не удалось получить чай.");
        }

        if (полученныйКакао != null) {
            System.out.println("Получено какао: " + полученныйКакао);
        } else {
            System.out.println("Не удалось получить какао.");
        }
    }
}