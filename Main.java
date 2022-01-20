//課題4(Bot)
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //課題2(Bot)
        //名前,年齢をPersonクラスを使ったものに変更する
        //String name = "KateJones";
        //int age = 20;

        //課題3
        //身長,体重,BMIをHealthクラスで定義および計算するように変更する
        //double height = 1.735;
        //double weight = 67.0;
        //double bmi = weight / height / height;

        //課題4(Bot)
        //名前,年齢,身長,体重を入力する機能
        Scanner scanner = new Scanner(System.in);
        System.out.println("ファーストネームを入力してください。");
        String firstName = scanner.nextLine();
        System.out.println("ラストネームを入力してください。");
        String lastName = scanner.nextLine();
        System.out.println("年齢を入力してください。");
        int age = scanner.nextInt();
        Person person = new Person(firstName, lastName, age);
        System.out.println("身長(m)を入力してください。");
        double height = scanner.nextDouble();
        System.out.println("体重(kg)を入力してください。");
        double weight = scanner.nextDouble();
        person.updateHealth(height, weight);
        printData(person);
        scanner.close();

        //課題1
        //名前,年齢,身長,体重,BMIの表示

    }
    //課題3
    //課題1の名前,年齢,身長,体重,BMIの表示機能をprintDataメソッドに移動
    //BMIが標準値を満たしているかの表示
    public static void printData(Person person) {
        System.out.println("私の名前は" + person.name + "です");
        System.out.println("年齢は" + person.age + "歳です");
        System.out.println("身長は" + person.health.height + "mです");
        System.out.println("体重は" + person.health.weight + "kgです");
        System.out.println("BMIは" + person.health.bmi() + "です");
        if (person.health.isHealthy()) {
            System.out.println("標準値です");
        } else {
            System.out.println("標準値の範囲外です");
        }
    }
}