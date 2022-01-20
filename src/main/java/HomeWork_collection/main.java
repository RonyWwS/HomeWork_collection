package HomeWork_collection;


//1. Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся). Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем). Посчитать сколько раз встречается каждое слово.
//        2. Написать простой класс ТелефонныйСправочник, который хранит в себе список фамилий и телефонных номеров. В этот телефонный справочник с помощью метода add() можно добавлять записи. С помощью метода get() искать номер телефона по фамилии. Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев), тогда при запросе такой фамилии должны выводиться все телефоны.
//        Желательно как можно меньше добавлять своего, чего нет в задании (т.е. не надо в телефонную запись добавлять еще дополнительные поля (имя, отчество, адрес), делать взаимодействие с пользователем через консоль и т.д.). Консоль желательно не использовать (в том числе Scanner), тестировать просто из метода main() прописывая add() и get().

import java.util.*;

public class main {
    public static void main(String[] args) {

        String[] words = {
                "Word", "HashMap", "Collections", "Cat",
                "Owl", "Phone", "Cinema", "Example",
                "Word", "Desert", "Cinema", "Snowball",
                "Door", "Work", "Home work", "Home",
                "Home", "Tree", "Collections", "Dog"
        };

        Example_1(words);
        Example_2();
    }

    private static void Example_2() {
        Phonebook pb = new Phonebook();

        pb.add("Ivanov", "123");
        pb.add("Petrov", "456");
        pb.add("Sidorov", "356");
        pb.add("Cat Boris", "954");
        pb.add("Cat Boris", "426");
        pb.add("Cat Boris", "963");
        pb.add("Sberbank", "900");

        System.out.println(pb.get("Cat Boris"));
    }

    private static void Example_1(String[] words) {
        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        System.out.println(map);
        System.out.println("");

        Set<String> uniq = new HashSet<>(Arrays.asList(words));
        System.out.println(uniq);
        System.out.println("");
    }
}
