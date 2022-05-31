public class HumanBody {
    public void displayHuman(){
        System.out.println("Method defined inside HumanBody");
    }

    public static  void main(String[] args){
        Child obj = new Child();
        System.out.println("Implementation of ybrid inheritane in java");
        obj.show();
        obj.displayChild();
    }
}

interface Male{
    public void show();
}

interface Female{
    public void show();
}

class Child extends HumanBody implements Male, Female{
    public void show(){
        System.out.println("Implementation of show method defined inside interfaces Male and Female");
    }

    public void displayChild(){
        System.out.println("Method defined inside child class");
    }

}
