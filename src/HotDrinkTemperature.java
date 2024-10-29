public class HotDrinkTemperature extends HotDrink {
    private int temperature;

    public HotDrinkTemperature(String name, int volume, int temperature) {
        super(name, volume);
        this.temperature = temperature;
    }

    // Геттеры и сеттеры
    public int getTemperature() { return temperature; }
    public void setTemperature(int temperature) { this.temperature = temperature; }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        if (!(obj instanceof HotDrinkTemperature)) return false;

        HotDrinkTemperature other = (HotDrinkTemperature) obj;
        return temperature == other.temperature;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), temperature);
    }

    @Override
    public String toString() {
        return super.toString() + ", температура: " + temperature + "°C";
    }
}