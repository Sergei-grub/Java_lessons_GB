package LastJavaHomework;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class NotebookFilter {
    public static void main(String[] args) {
        Notebook nb1 = new Notebook("Asus", "15 D543MA-DM1368", 32, 1000, "Windows 10", "черный");
        Notebook nb2 = new Notebook("Acer", "Aspire 3 A315-23-R0HR", 4, 256, "Windows 10", "белый");
        Notebook nb3 = new Notebook("MSI", "Modern 15 B11-002RU", 8, 256, "Windows 11", "черный");
        Notebook nb4 = new Notebook("Asus", "VivoBook Pro 14 K3400PA-KP109", 16, 512, "Windows 10", "серебристый");
        Notebook nb5 = new Notebook("Huawei", "MateBook D16 RLEF-X", 16, 512, "Windows 10", "серый");
        Notebook nb6 = new Notebook("Asus", "ROG Zephyrus G14 GA402RJ-L4045", 8, 1000, "Без ОС", "белый");
        Notebook nb7 = new Notebook("MSI", "Raider GE78 HX 13VH-094RU", 32, 2000, "Windows 11", "черный");
        Notebook nb8 = new Notebook("Apple", "MacBook Air", 8, 256, "macOS", "серый");

        HashSet<Notebook> notebooks = new HashSet<Notebook>(
                Arrays.asList(nb1, nb2, nb3, nb4, nb5, nb6, nb7, nb8));

        Scanner sc = new Scanner(System.in, StandardCharsets.UTF_8);

        System.out.println();
        System.out.println("Вы можете выбрать себе подходящий ноутбук\n");
        boolean filter = true;
        while (filter) {
            System.out.println("- по ОЗУ, введите - 1\n" +
                    "- по объему жесткого диска, введите - 2\n" +
                    "- по оперативной системе, введите - 3\n" +
                    "- по цвету, введите - 4\n" +
                    "Посмотреть все модели, введите - 5\n" +
                    "Для выхода из каталога, введите - 0");

            String operation = sc.nextLine();
            switch (operation) {
                case "1":
                    filterRAM(notebooks, sc);
                    break;
                case "2":
                    FilterHardDisk(notebooks, sc);
                    break;
                case "3":
                    filterOS(notebooks, sc);
                    break;
                case "4":
                    filterColor(notebooks, sc);
                    break;
                case "5":
                    showCatalog(notebooks);
                    break;
                case "0":
                    System.out.println("До новых встреч!");
                    filter = false;
                    break;
                default:
                    System.out.println("Введена некорректная операция");
                    System.out.println();
                    break;
            }
        }

    }
    // Фильт по ОЗУ
    public static void filterRAM(HashSet<Notebook> notebooks, Scanner scanner) {
        TreeSet<Integer> ram = new TreeSet<>();
        for (Notebook note : notebooks) {
            ram.add(note.getRam());
        }
        System.out.println();
        System.out.println("В каталоге представлены ноутбуки с оперативной памятью: "
                + ram.toString().replaceAll("^\\[|\\]$", "") + " Гб\n" +
                "Введите интересующее значение: ");

        String oper = scanner.nextLine();
        int filter = Integer.parseInt(oper);
        if (ram.contains(filter)) {
            System.out.println();
            System.out.println("Модели по вашему запросу: ");
            System.out.println();
            for (Notebook note : notebooks) {
                if (note.getRam() == filter) {
                    note.showInfo();
                }
            }
        } else {
            System.out.println("Неправильное значение. Введите значение снова");
            filterRAM(notebooks, scanner);
        }

    }
    // Фильт по объему жесткого диска
    public static void FilterHardDisk(HashSet<Notebook> notebooks, Scanner scanner) {
        TreeSet<Integer> hardDisk = new TreeSet<>();
        for (Notebook note : notebooks) {
            hardDisk.add(note.getHardDisk());
        }
        System.out.println();
        System.out.println("В каталоге представлены ноутбуки с объемом жесткого диска "
                + hardDisk.toString().replaceAll("^\\[|\\]$", "") + " Гб\n" +
                "Введите интересующее значение: ");

        String oper = scanner.nextLine();
        int filter = Integer.parseInt(oper);
        if (hardDisk.contains(filter)) {
            System.out.println();
            System.out.println("Модели по вашему запросу: ");
            System.out.println();
            for (Notebook note : notebooks) {
                if (note.getHardDisk() == filter) {
                    note.showInfo();
                }
            }
        } else {
            System.out.println("Неправильное значение. Введите значение снова");
            FilterHardDisk(notebooks, scanner);
        }
    }
    // Фильт по ОС
    public static void filterOS(HashSet<Notebook> notebooks, Scanner scanner) {
        TreeSet<String> operSystems = new TreeSet<>();
        for (Notebook note : notebooks) {
            operSystems.add(note.getOperSystem());
        }
        System.out.println();
        System.out.println("В нашем каталоге представлены операционные системы: "
                + operSystems.toString().replaceAll("^\\[|\\]$", "") + "\n" +
                "Введите интересующую ОС: ");

        String oper = scanner.nextLine().toUpperCase();
        if (operSystems.contains(oper)) {
            System.out.println();
            System.out.println("Модели по вашему запросу: ");
            System.out.println();
            for (Notebook note : notebooks) {
                if (note.getOperSystem().equals(oper)) {
                    note.showInfo();
                }
            }
        } else {
            System.out.println("Нет такой ОС. Введите значение снова");
            filterOS(notebooks, scanner);

        }
    }
    // Фильт по цвету
    public static void filterColor(HashSet<Notebook> notebooks, Scanner scanner){
        TreeSet<String> colors = new TreeSet<>();
        for (Notebook note: notebooks){
            colors.add(note.getColor());
        }
        System.out.println();
        System.out.println("В каталоге представлены ноутбуки следующих цветов: "
                + colors.toString().replaceAll("^\\[|\\]$", "") + "\n" +
                "Введите интересующий цвет: ");

        String oper = scanner.nextLine().toLowerCase();
        if (colors.contains(oper)) {
            System.out.println();
            System.out.println("Модели по вашему запросу: ");
            System.out.println();
            for (Notebook note : notebooks) {
                if (note.getColor().equals(oper)) {
                    note.showInfo();
                }
            }
        } else {
            System.out.println("Нет такого цвета. Введите значение снова");
            filterColor(notebooks, scanner);
        }
    }
    // Вывод полного каталога в консоль
    public static void showCatalog(HashSet<Notebook> notebooks){
        System.out.println();
        System.out.println("Каталог ноутбуков: ");
        System.out.println();
        for (Notebook note : notebooks) {
            note.showInfo();
        }
    }
}