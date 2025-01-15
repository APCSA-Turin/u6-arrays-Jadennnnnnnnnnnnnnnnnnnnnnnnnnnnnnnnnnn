public class Cat {
    private String name;
    private int age;
    private boolean vaccinated;

    public Cat(String name, int age, boolean vaccinated) {
        this.name = name;
        this.age = age;
        this.vaccinated = vaccinated;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isVaccinated() {
        return vaccinated;
    }

    public void vaccinate() {
        vaccinated = true;
    }

    public void introduce() {
        System.out.println("My name is " + name + " and I am " + age + " years old");
    }
}
