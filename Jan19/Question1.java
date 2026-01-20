package Jan19;

public class Question1 {
    public static void main(String[] args) {
        Animal[] animals = {
                new Dog("Buddy", 3),
                new Cat("Whiskers", 2),
                new Bird("Tweety", 1)
        };

        for (Animal animal : animals) {
            animal.makeSound();  // Polymorphism in action
        }
    }
}

class Animal {
    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void makeSound() {
        System.out.println(name + " makes a generic sound");
    }
}

class Dog extends Animal {
    public Dog(String name, int age) { super(name, age); }
    @Override public void makeSound() {
        System.out.println(name + " (Dog) says: Woof! Woof!");
    }
}

class Cat extends Animal {
    public Cat(String name, int age) { super(name, age); }
    @Override public void makeSound() {
        System.out.println(name + " (Cat) says: Meow!");
    }
}

class Bird extends Animal {
    public Bird(String name, int age) { super(name, age); }
    @Override public void makeSound() {
        System.out.println(name + " (Bird) chirps: Tweet tweet!");
    }
}