public class Test {
    public static void main(String[] args) {
        Cat c1 = new Cat("A", 10, false);
        Cat c2 = new Cat("B", 14, false);
        CatHouse myHouse = new CatHouse(c1, c2);
        System.out.println(c1.isVaccinated());
        System.out.println(c2.isVaccinated());
        System.out.println(myHouse.performVaccinations());
        System.out.println(c1.isVaccinated());
        System.out.println(c2.isVaccinated());
        System.out.println(myHouse.getTotalVaccinesAdministered());
        System.out.println();
        c1 = new Cat("C", 10, true);
        c2 = new Cat("D", 14, false);
        myHouse = new CatHouse(c1, c2);
        System.out.println(c1.isVaccinated());
        System.out.println(c2.isVaccinated());
        System.out.println(myHouse.performVaccinations());
        System.out.println(c1.isVaccinated());
        System.out.println(c2.isVaccinated());
        System.out.println(myHouse.getTotalVaccinesAdministered());
        System.out.println();
        c1 = new Cat("E", 10, true);
        c2 = new Cat("F", 14, true);
        myHouse = new CatHouse(c1, c2);
        System.out.println(c1.isVaccinated());
        System.out.println(c2.isVaccinated());
        System.out.println(myHouse.performVaccinations());
        System.out.println(c1.isVaccinated());
        System.out.println(c2.isVaccinated());
        System.out.println(myHouse.getTotalVaccinesAdministered());
        System.out.println();
        c1 = new Cat("G", 10, false);
        c2 = new Cat("H", 14, false);
        myHouse = new CatHouse(c1, c2);
        System.out.println(c1.isVaccinated());
        System.out.println(c2.isVaccinated());
        System.out.println(myHouse.performVaccinations());
        System.out.println(c1.isVaccinated());
        System.out.println(c2.isVaccinated());
        System.out.println(myHouse.getTotalVaccinesAdministered());
        

    }
}
