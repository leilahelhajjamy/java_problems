public class UncheckedCustomException extends RuntimeException {
        UncheckedCustomException(String message){

            super(message);
        }

}



class Test2{
    public static void main(String[] args) {
        throw new UncheckedCustomException("unchecked custom exception");
    }
}