package com.javarush.task.task30.task3007;

/* 
Найдем число 2 в максимальной степени
Реализуй логику метода maxPowerOf2, который должен возвращать число 2 в максимальной степени, которое получается поместить в переданное число.
Аргументом maxPowerOf2 может быть только положительное целое число.

Используй только операции:
1. Побитовые сдвиги.
2. Побитовое OR.
3. Побитовое AND.
4. Побитовый унарный оператор NOT.
5. Присваивание (можно совмещать разрешенные операции с присваивание, например, &=).
6. Круглые скобки.
Не оставляй комментарии.
Не объявляй никаких переменных, используй только x, который приходит как аргумент метода maxPowerOf2.
Метод main не принимает участия в тестировании.


Требования:
1. В классе Solution должен присутствовать метод maxPowerOf2(int).
2. В классе Solution в методе maxPowerOf2(int) используй только разрешенные операции.
3. В классе Solution в методе maxPowerOf2(int) используй только разрешенные операции.
4. Метод maxPowerOf2(int) должен возвращать число 2 в максимальной степени, которое получается поместить в переданное число.
*/
public class Solution {
    public static void main(String[] args) {
        System.out.println(maxPowerOf2(140_000));   //131072
        System.out.println(maxPowerOf2(1026));      //1024
        System.out.println(maxPowerOf2(17));        //16
    }

    public static int maxPowerOf2(int x) {
x|=x>>1;
x|=x>>2;
x|=x>>4;
x|=x>>8;
x|=x>>8;
x|=x>>8;


        return x^(x>>1);
    }
}