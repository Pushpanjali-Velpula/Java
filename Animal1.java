public class Animal1 {
    void speak(){
        System.out.println("Animal makes a sound");
    }
}
class Dog extends Animal1{
    void speak(){
        super.speak();
        System.out.println("Dog created");
    }
}
class SuperBase{
    public static void main(String[] args) {
        Dog d = new Dog();
        d.speak();
    }
}
