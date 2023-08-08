//Если необходимо, исправьте данный код (задание 2 https:
////docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)
// Можно создать массив
public class Program2 {
    public static void main(String[] args){
        try {
            int[] intArray = {8, 3, 8, 5, 2, 11, 3, 1, 7, 2, 4};
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }
    }


}
