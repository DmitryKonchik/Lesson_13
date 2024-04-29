public class Main {
    public static void main(String[] args) {

        System.out.println(User.Validation("skdgjjgkdjsk", "qwerty123", "qwerty123"));
        System.out.println(User.Validation("skdgjjgkdjsksljkgjkldhgjhsjghsdhlsdg", "qwerty123", "qwerty123"));
        System.out.println(User.Validation("skdgjjgkdjsk", "qwerty1234", "qwerty123"));
        System.out.println(User.Validation("skdgjjgkdjsk", "qwer ty123", "qwer ty123"));

        // HardTask

        //программа завершается в блоке try с помощью System.exit(0)
        //бесконечный цикл
        //пишут что так нельзя делать)
        try {
            System.out.println("В блоке try");
            while (true){
                System.out.println();
            }
//            System.exit(0);
        } catch (Exception e) {
            System.out.println("В блоке catch");
        } finally {
            System.out.println("В блоке finally");
        }
    }
}