//Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
//и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения,
//вместо этого, необходимо повторно запросить у пользователя ввод данных.

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program1 {
        public static void main(String[] args) {
            float numer = 0;
            boolean sin = true;
            do{
                try{
                    Scanner in = new Scanner(System.in);
                    System.out.print("Введите число (дробь вводить через запятую): ");
                    numer = in.nextFloat();
                    sin = false;
                }catch(InputMismatchException e){
                    System.out.println("Введённые данные не являются числом, поробуйте снова.");
                }
            }while(sin);
            System.out.println(numer);
        }
    }
