public class Poem {
    private String name;
    private String poet;

    public Poem(String name, String poet) {
        this.name = name;
        this.poet = poet;
    }

    public String getName() {
        return name;
    }

    public String getPoet() {
        return poet;
    }

    @Override
    public String toString() {
        return "Poem: " + name + ", Poet: " + poet;
    }
}
