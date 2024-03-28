package tugasPemlanPraktikum3;

import java.util.Scanner;

public class MainHero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Permainan Hero Berantem\n" + "Player 1 : Silahkan masukkan hero Anda!\n"+ "Untuk bagian angka, mohon masukkan angka antara 0 hingga 500!\n" + "============================================");
        System.out.print("Nama Hero: ");
        String name1 = scanner.nextLine();
        System.out.print("Health Point: ");
        double hp1 = scanner.nextDouble();
        System.out.print("Attack: ");
        double attack1 = scanner.nextDouble();
        System.out.print("Defense: ");
        double defense1 = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("\nPermainan adu hero\n" + "Player 2 : Silahkan masukkan hero Anda!\n"+ "Untuk bagian angka, mohon masukkan angka antara 0 hingga 500!\n" + "============================================");
        System.out.print("Nama Hero: ");
        String name2 = scanner.nextLine();
        System.out.print("Health Point: ");
        double hp2 = scanner.nextDouble();
        System.out.print("Attack: ");
        double attack2 = scanner.nextDouble();
        System.out.print("Defense: ");
        double defense2 = scanner.nextDouble();
        System.out.println("============================================\n" + "============================================");
        Hero hero1 = new Hero(name1, hp1, attack1, defense1);
        Hero hero2 = new Hero(name2, hp2, attack2, defense2);
        int round = 0;
        while (hero1.getHp() > 0 && hero2.getHp() > 0) {
            round++;
            System.out.println("Ronde " + round);
            hero2.hero2Serang(hero2, hero1);
            hero1.hero1Serang(hero1, hero2);
        }
        if (hero1.getHp() > 0) {
            System.out.println("Pertarungan telah usai!\n" + hero2.getName() + " telah kalah!" + "\n============================================\n" + hero1.getName() + " adalah pemenangnya");
        } else {
            System.out.println("Pertarungan telah usai!\n" + hero1.getName() + " telah kalah!" + "\n============================================\n"+ hero2.getName() + " adalah pemenangnya");
        }
    }
}