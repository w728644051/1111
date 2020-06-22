package shipList;

public class Relation {
    private int id;
    private int DrinkA;
    private int DrinkB;

    @Override
    public String toString() {
        return "Relation{" +
                "id=" + id +
                ", DrinkA=" + DrinkA +
                ", DrinkB=" + DrinkB +
                '}';
    }

    public int getDrinkA() {
        return DrinkA;
    }

    public void setDrinkA(int drinkA) {
        DrinkA = drinkA;
    }

    public int getDrinkB() {
        return DrinkB;
    }

    public void setDrinkB(int drinkB) {
        DrinkB = drinkB;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
};


