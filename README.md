Втора лабораториска вежба по Софтверско инженерство 

Викторија Николовска, бр на индекс 183074

Група на код:
Ја добив групата на код 5

Control Flow Graph
![GitHub Logo](/SI_Lab2-v2.png)




Цикломатска комплексност 

Цикломатската комплексност на овој код е 7, истата е добиена преу формулата E-N+2, каде што N e број а јазли,а E број на ребра. Во случајов N=19 и E=24, па така цикломатската комплексност изнесува 7.


Тест случаи според критериумот Every statement

list=null  1,2,3,4,18 -Листата е празна па така ќе фрли IllegalArgumentException.

list=0,0,#,0    1,2,5,6.1,6.2,7,8,9,10,11,12,13,16,6.3,6.2,7,14,15,16,6.3,17,18 - Листата содржи 4 елементи со кои се извршува кодот и се добива позитивен излез.


Тест случаи според критериумот Every path

list=null 1,2,3,4,18 - Листата е празна па така ќе фрли IllegalArgumentException.

list=0,0,0  1,2,5,6.1,6.2,7,8,9,11,13,16,6.3(6.2,7,8,9,11,13,16)17,18

list=#,#,#  1,2,5,6.1,6.2,(7,14,15,16,6.3,6.2),17,18

list=#,0,0  1,2,3,6.1,6.2,7,8,9,10,11,13,16,6.3,6.2,7,14,15,16,17,18

list=0,0,#  1,2,3,6.1,6.2,7,8,9,11,12,13,16,6.3,6.2,7,14,15,16,17,18



