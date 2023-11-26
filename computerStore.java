import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class computerStore {
    public static void main(String[] args) {
        computer computer1 = new computer("lenovo", 757,
                new ArrayList<String>(Arrays.asList("Чёрный", "Белый", "Серый")), 29, 8);
        computer computer2 = new computer("Samsung", 690,
                new ArrayList<String>(Arrays.asList("Чёрный", "Белый", "Серый", "Розовый")), 31, 4);
        computer computer3 = new computer("Microsoft", 796, new ArrayList<String>(Arrays.asList("Чёрный", "Белый")), 28,
                8);
        HashSet<computer> hashSet = new HashSet<>(Arrays.asList(computer1, computer2, computer3));

        int minWeight = computer1.weight;
        int minSize = computer1.size;
        int minMemory = computer3.memory;
        for (computer el : hashSet) {
            if (el.weight < minWeight) {
                minWeight = el.weight;
            }
            if (el.size < minSize) {
                minSize = el.size;
            }
            if (el.memory < minMemory) {
                minMemory = el.memory;
            }
        }
        System.out.println("Выводим справочные данные по минимальным критерям магазина: ");
        System.out.printf(
                "%d - минимальное значение веса, %d - минимальный размер диагонали, %d - минимальный размер ОЗУ \n\n",
                minWeight, minSize, minMemory);

        System.out.println("Выберите цифру, соответсвтующую необходимому критерию: ");
        Map<Integer, String> srt = Sort();
        for (var item : srt.entrySet()) {
            System.out.printf("%d - %s \n", item.getKey(), item.getValue());
        }

        Scanner iScanner = new Scanner(System.in, "ibm866");
        System.out.println("Введите цифру критерия: ");
        String citic = iScanner.nextLine();
        while (!citic.equals("0")) {
            if (citic.equals("1")) {
                System.out.println("Введите минимальный вес: ");
                int min1 = iScanner.nextInt();
                System.out.println(SortComputerWeight(hashSet, min1));
                System.out.println("Введите цифру критерия: ");
            }
            if (citic.equals("2")) {
                System.out.println("Введите минимальный размер диагонали: ");
                int min2 = iScanner.nextInt();
                System.out.println(SortComputerSize(hashSet, min2));
                System.out.println("Введите цифру критерия: ");
            }
            if (citic.equals("3")) {
                System.out.println("Введите минимальный размер ОЗУ: ");
                int min3 = iScanner.nextInt();
                System.out.println("Выводим возможные варианты: ");
                hashSet = SortComputerMemory(hashSet, min3);
                for (computer el : hashSet) {
                    System.out.printf("%s - марка компьютера, %d грамм - вес компьютера, %d мм - длина диагонали, %d Гбайт - размер ОЗУ \n", el.marka, el.weight, el.size, el.memory);
                    System.out.println("Доступные цвета: ");
                    for (String col : el.color) {
                        System.out.printf("%s \n", col);
                    }
                    System.out.println();
                }
                System.out.println("Введите цифру критерия: ");
            }
            citic = iScanner.nextLine();
        }

        // ArrayList<Integer> SortWeight = new ArrayList<>();
        // ArrayList<Integer> SortMemory = new ArrayList<>();
        // ArrayList<Integer> SortSize = new ArrayList<>();
        // for (computer el : hashSet){
        // SortWeight.add(el.weight);
        // SortSize.add(el.size);
        // SortMemory.add(el.memory);
        // }

        // Collections.sort(SortWeight);
        // Collections.sort(SortMemory);
        // Collections.sort(SortSize);

        // HashSet<computer> hashSortWeight = new HashSet<>();
        // HashSet<computer> hashSortmemory = new HashSet<>();
        // HashSet<computer> hashSortsize = new HashSet<>();

        // (computer el : hashSet){

        // }

    }

    public static Map<Integer, String> Sort() {
        Map<Integer, String> sort = new HashMap<>();
        sort.put(1, "Вес");
        sort.put(2, "Размер диагонали");
        sort.put(3, "ОЗУ");
        sort.put(0, "Выход");
        return sort;
    }

    public static HashSet<computer> SortComputerWeight(HashSet<computer> hashSet, int minWeight) {
        HashSet<computer> hashsort = new HashSet<>();
        for (computer el : hashSet) {
            if (el.weight >= minWeight) {
                hashsort.add(el);
            }
        }
        return hashsort;
    }

    public static HashSet<computer> SortComputerSize(HashSet<computer> hashSet, int minSize) {
        HashSet<computer> hashsort = new HashSet<>();
        for (computer el : hashSet) {
            if (el.weight >= minSize) {
                hashsort.add(el);
            }
        }
        return hashsort;
    }

    public static HashSet<computer> SortComputerMemory(HashSet<computer> hashSet, int minMemory) {
        HashSet<computer> hashsort = new HashSet<>();
        for (computer el : hashSet) {
            if (el.weight >= minMemory) {
                hashsort.add(el);
            }
        }
        return hashsort;
    }
}
