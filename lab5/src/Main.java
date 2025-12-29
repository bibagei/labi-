import java.io.*;
import java.util.*;

// КЛАСС COMPUTER
class Computer implements Comparable<Computer> {

    private double cpuFrequency;   // частота процессора (ГГц)
    private int ram;               // оперативная память (ГБ)
    private String videoCard;      // видеокарта (текстовое поле)
    private double performance;    // производительность

    public Computer(double cpuFrequency, int ram, String videoCard) {
        this.cpuFrequency = cpuFrequency;
        this.ram = ram;
        this.videoCard = videoCard;
        this.performance = calculatePerformance();
    }

    // вычисление производительности (произвольная формула)
    private double calculatePerformance() {
        return cpuFrequency * 1000 + ram * 50;
    }

    // сортировка по возрастанию текстового поля (видеокарта)
    @Override
    public int compareTo(Computer other) {
        return this.videoCard.compareTo(other.videoCard);
    }

    // удобочитаемый вывод
    @Override
    public String toString() {
        return "Компьютер: " +
                "CPU = " + cpuFrequency + " ГГц, " +
                "RAM = " + ram + " ГБ, " +
                "Видеокарта = " + videoCard + ", " +
                "Производительность = " + performance;
    }
}

// ГЛАВНЫЙ КЛАСС
public class Main {
    public static void main(String[] args) {

        List<Computer> computers = new ArrayList<>();

        // ===== ЧТЕНИЕ ИЗ ФАЙЛА =====
        // Файл input.txt должен содержать строки вида:
        // 3.2 16 RTX3060
        // 2.8 8 GTX1650

        try (BufferedReader br = new BufferedReader(new FileReader("input.txt"))) {
            String line;

            while ((line = br.readLine()) != null) {
                String[] data = line.split(" ");

                double cpu = Double.parseDouble(data[0]);
                int ram = Integer.parseInt(data[1]);
                String video = data[2];

                computers.add(new Computer(cpu, ram, video));
            }
        } catch (IOException e) {
            System.out.println("Ошибка чтения файла");
        }

        // ===== СОРТИРОВКА =====
        Collections.sort(computers);

        // ===== ЗАПИСЬ В ДРУГОЙ ФАЙЛ =====
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"))) {
            for (Computer c : computers) {
                bw.write(c.toString());
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Ошибка записи файла");
        }

        System.out.println("Готово. Данные отсортированы и записаны в файл.");
    }
}
