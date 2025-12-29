// БАЗОВЫЙ КЛАСС
class Game {
    protected int releaseYear;
    protected double rating;
    protected String os;

    public Game(int releaseYear, double rating, String os) {
        this.releaseYear = releaseYear;
        this.rating = rating;
        this.os = os;
    }

    // get-методы
    public int getReleaseYear() {
        return releaseYear;
    }

    public double getRating() {
        return rating;
    }

    public String getOs() {
        return os;
    }

    // Метод, который будет переопределяться
    public String getName() {
        return "Игра";
    }
}

// ПРОИЗВОДНЫЙ КЛАСС СТРАТЕГИЯ
class Strategy extends Game {
    private int maxUnits;
    private int mapsCount;
    private boolean canCreateMap;

    public Strategy(int releaseYear, double rating, String os,
                    int maxUnits, int mapsCount, boolean canCreateMap) {
        super(releaseYear, rating, os);
        this.maxUnits = maxUnits;
        this.mapsCount = mapsCount;
        this.canCreateMap = canCreateMap;
    }

    public int getMaxUnits() {
        return maxUnits;
    }

    public int getMapsCount() {
        return mapsCount;
    }

    public boolean isCanCreateMap() {
        return canCreateMap;
    }

    @Override
    public String getName() {
        return "Стратегия";
    }
}

// ПРОИЗВОДНЫЙ КЛАСС ШУТЕР
class Shooter extends Game {
    private int levelsCount;
    private String weaponType;

    public Shooter(int releaseYear, double rating, String os,
                   int levelsCount, String weaponType) {
        super(releaseYear, rating, os);
        this.levelsCount = levelsCount;
        this.weaponType = weaponType;
    }

    public int getLevelsCount() {
        return levelsCount;
    }

    public String getWeaponType() {
        return weaponType;
    }

    @Override
    public String getName() {
        return "Шутер";
    }
}

// ПРОИЗВОДНЫЙ КЛАСС КВЕСТ
class Quest extends Game {
    private int age;

    public Quest(int releaseYear, double rating, String os, int age) {
        super(releaseYear, rating, os);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String getName() {
        return "Квест";
    }
}

// ГЛАВНЫЙ КЛАСС
public class Main {
    public static void main(String[] args) {

        Game g1 = new Strategy(2022, 9.1, "PC", 500, 10, true);
        Game g2 = new Shooter(2021, 8.7, "PS5", 20, "Автомат");
        Game g3 = new Quest(2019, 8.3, "PC", 16);

        System.out.println(g1.getName());
        System.out.println(g2.getName());
        System.out.println(g3.getName());
    }
}
