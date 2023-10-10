package th.Animal;

public class run {
    public static void main(String[] args) {
        Animal animal = new Animal("bat");
        Dog newDog = new Dog("gauDono", "black");
        Cat newCat = new Cat("meoKun");
        System.out.println(animal.makeSound());
        System.out.println(newDog.makeSound());
        System.out.println(newCat.makeSound());
    }
}
