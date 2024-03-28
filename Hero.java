package tugasPemlanPraktikum3;

public class Hero {
        private String name;
        private double hp;
        private double attack;
        private double defense;
        public Hero() {
        }
        public Hero(String name, double hp, double attack, double defense) {
            this.name = name;
            this.hp = hp;
            this.attack = attack;
            this.defense = defense;
        }
        public void setName(String name) {
            this.name = name;
        }
        public String getName() {
            return name;
        }
        public void setHp(double hp) {
            this.hp = hp;
        }
        public double getHp() {
            return hp;
        }
        public void setAttack(double attack) {
            this.attack = attack;
        }
        public double getAttack() {
            return attack;
        }
        public void setDefense(double defense) {
            this.defense = defense;
        }
        public double getDefense() {
            return defense;
        }
        public void displayStatus() {
            System.out.println("Nama: " + name);
            System.out.println("HP: " + hp);
            System.out.println("Attack: " + attack);
            System.out.println("Defense: " + defense);
        }
        public void hero1Serang(Hero hero1, Hero hero2){
            double damage1 = hero1.getAttack() - hero2.getDefense();
            if (damage1 < 1) {
                damage1 = 1;
            }
            hero2.setHp(hero2.getHp() - damage1);
            System.out.println(hero1.getName() + " menyerang " + hero2.getName() + " dengan kerusakan " + damage1);
            System.out.println(hero2.getName() + " memiliki sisa HP " + hero2.getHp());
        }
        public void hero2Serang(Hero hero2, Hero hero1){
            double damage2 = hero2.getAttack() - hero1.getDefense();
            if (damage2 < 1) {
                damage2 = 1;
            }
            hero1.setHp(hero1.getHp() - damage2);
            System.out.println(hero2.getName() + " menyerang " + hero1.getName() + " dengan kerusakan " + damage2);
            System.out.println(hero1.getName() + " memiliki sisa HP " + hero1.getHp());
        }
 }   