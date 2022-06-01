public class Animal {

    Animal(){
        System.out.println("nothing to show");
    }
    public static void main(String[] args) {
        Animal dog = new Dog();
        Dog.method(dog);
    }
}



class Dog extends Animal{

    static void method(Animal a){
        if(a instanceof Animal){
            Dog d = (Dog)a;
            System.out.println("Downcasting is performed");
        }

    }

}
