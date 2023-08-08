//Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
//Пользователю должно показаться сообщение, что пустые строки вводить нельзя.

import java.util.Scanner;

public class Program4 {
    public static void main(String[] args){
        String string = null;

        try{
            Scanner to = new Scanner(System.in);
            System.out.println("Введите строку: ");
            string = to.nextLine();
            if (string == ""){
                throw new RuntimeException();
            }
        } catch (RuntimeException e){
            System.out.println("Пустая строка невозможна ");
        }
        System.out.println("Ввод: " + string);
    }
}
