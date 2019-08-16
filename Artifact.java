/*
Музей древностей

Формулировка: Артефакты, хранящиеся в музее, бывают трех видов:
    Первый - неизвестно ничего, кроме порядкового номера, присвоенного музеем (2121).
    Второй - известны порядковый номер и культура, которой он был создан (2121, Ацтеки).
    Третий - известны порядковый номер, культура и век его создания (2121, Ацтеки, 12).
Задача: Создать класс, описывающий хранящиеся в музее древности, используя необходимое
количество кострукторов.
* */
package com;

public class Artifact {
    String culture;
    int century;

    static int counter = 0;

    public Artifact(){
        counter++;
        this.culture = "Неизвестно";
    }

    public Artifact(String culture){
        counter++;
        this.culture = culture;
    }

    public Artifact(String culture, int century){
        counter++;
        this.culture = culture;
        this.century = century;
    }

    public static void main(String[] args) {
        Artifact artifact1 = new Artifact();
        Artifact artifact2 = new Artifact("Ацтеки");
        Artifact artifact3 = new Artifact("Инки", 12);
        String[] catalog = {artifact1.culture, artifact2.culture, artifact3.culture};
        for (String s : catalog) System.out.println(s);
    }
}
