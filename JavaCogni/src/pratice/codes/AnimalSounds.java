package pratice.codes;

class Animal {
    void makeSound() {
        System.out.println("Some animal sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog says: Woof! Woof!");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cat says: Meow! Meow!");
    }
}

class Cow extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cow says: Moo! Moo!");
    }
}

public class AnimalSounds {
    public static void main(String[] args) {
        Animal a1 = new Dog();
        Animal a2 = new Cat();
        Animal a3 = new Cow();

        a1.makeSound();
        a2.makeSound();
        a3.makeSound();
    }
}
