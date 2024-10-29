public class HotDrink {
    private String name;
    private int volume;

    public HotDrink(String name, int volume) {
        this.name = name;
        this.volume = volume;
    }

    // Геттеры и сеттеры
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getVolume() { return volume; }
    public void setVolume(int volume) { this.volume = volume; }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof HotDrink))
            return false;

        HotDrink other = (HotDrink) obj;
        return Objects.equals(name, other.name) && volume == other.volume;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, volume);
    }

    @Override
    public String toString() {
        return "Горячий напиток: " + name + ", объем: " + volume + " мл";
    }
}