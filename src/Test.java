public class Test {


    class User{
        int  id;
        String name;
        User(int id , String name) {
            this.id = id;
            this.name = name;
        }
    }
    public static void main(String[] args) {
        Test test=new Test();
        Test.User user = test.new User(1,"laila");
        System.out.println("user name is " + user.name);
    }
}





