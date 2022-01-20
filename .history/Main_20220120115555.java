//課題4
//import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //課題2
        //名前,年齢をPersonクラスを使ったものに変更する
        String name = "KateJones";
        int age = 20;

        //課題3
        //身長,体重,BMIをHealthクラスで定義および計算するように変更する
        double height = 1.735;
        double weight = 67.0;
        double bmi = weight / height / height;

        //課題4
        //名前,年齢,身長,体重を入力する機能
        //Scanner scanner = new Scanner(System.in);
        //
        //scanner.close();

        //課題1
        //名前,年齢,身長,体重,BMIの表示
        System.out.println("私の名前はkateJonesです");
        System.out.println("年齢は20歳です");
        System.out.println("身長は1.735mです");
        System.out.println("体重は67.0kgです");
        System.out.println("BMIは22.257472448072814です");

    }
    //課題3
    //課題1の名前,年齢,身長,体重,BMIの表示機能をprintDataメソッドに移動
    //BMIが標準値を満たしているかの表示
    //public static void printData(Person person) {
    //
    //}
}