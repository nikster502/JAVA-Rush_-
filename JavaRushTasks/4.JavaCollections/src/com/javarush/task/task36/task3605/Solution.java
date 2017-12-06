package com.javarush.task.task36.task3605;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeSet;

/* 
Использование TreeSet
Первым параметром приходит имя файла: файл1.
файл1 содержит только буквы латинского алфавита, пробелы, знаки препинания, тире, символы перевода каретки.
Отсортируй буквы по алфавиту и выведи на экран первые 5 различных букв в одну строку без разделителей.
Если файл1 содержит менее 5 различных букв, то выведи их все.
Буквы различного регистра считаются одинаковыми.
Регистр выводимых букв не влияет на результат.
Закрой потоки.

Пример 1 данных входного файла:
zBk yaz b-kN

Пример 1 вывода:
abkny

Пример 2 данных входного файла:
caAC
A, aB? bB

Пример 2 вывода:
abc

Подсказка: использовать TreeSet


Требования:
1. Программа должна использовать класс TreeSet.
2. У объекта типа TreeSet вызови метод add для добавления элементов.
3. Программа должна выводить результат на экран.
4. Вывод программы должен соответствовать условию задачи.
*/
public class Solution {
    public static void main(String[] args) throws IOException {
TreeSet<String> set = new TreeSet<>();
        try(FileReader reader = new FileReader(args[0]))
        {
            // читаем посимвольно
            int c;
            while((c=reader.read())!=-1){

               if (isLitter((char)c)){
set.add(Character.toString((char)c).toLowerCase());
               }
            }
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
        if (set.size()<5){
            set.forEach(System.out::print);
        }
        else {
            int count = 0;
            for (String s : set) {
                if (count==5)break;
                System.out.print(s);
                count++;
            }
        }
    }
    public static boolean isLitter(char c){
        if (c>=65&&c<=90||c>=97&&c<=122){
            return true;
        }

        return false;
    }
}
