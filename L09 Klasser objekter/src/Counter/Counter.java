package Counter;

public class Counter { // Klassen
    private String name; // felt, det bliver gemt i hukommelsen og bliver ikke "slettet" da felter er konstante.
    private int count; // felt, det bliver gemt i hukommelsen og bliver ikke "slettet" da felter er konstante.
//    Constructor 1
    public Counter(String name) { // String name kan kun bruges her, da variablen er inden for metodens scope.
        this.name = name;
        count = 0;
    }
    public Counter (String name, int initialCount) { // Constructor 2
        this.name = name;
        count = initialCount;
    }
    public int getCount() {
        return count;
    }
    public String getName() {
        return name;
    }
    public void setName(String newName) {
        name = newName;
    }
    public void click() {
        count++;
    }
    public void reset() {
        count = 0;
    }
    @Override
    public String toString() {
        return "Counter(" + name + count + ")";
    }

}
