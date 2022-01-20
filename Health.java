class Health {
    public double height, weight;

    //課題3
    //身長と体重のデータの更新
    public void update(double height, double weight) {
        this.height = height;
        this.weight = weight;
    }

    //課題3
    //BMIの計算結果を返す
    public double bmi() {
        return weight / height / height;
    }

    //課題3
    //BMIが標準値であればtrue,標準値でなければfalseを返す
    public boolean isHealthy() {
        return 18.5 <= bmi() && bmi() < 25.0;
    }
}