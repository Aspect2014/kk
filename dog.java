
class Animal {
    private String name;
    private String color;
    private int age;

    public Animal(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }
}

class dog {
    public static void main(String[] args) {
        Animal a = new Animal("Lucky", "Golden", 1);

        System.out.println("Alpha Sigma Rajbir's Dog");
        System.out.println("Animal name: " + a.getName());
        System.out.println("Animal color: " + a.getColor());
        System.out.println("Animal age: " + a.getAge());
    }
}
