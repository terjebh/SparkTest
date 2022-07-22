package no.itfakultetet;
import org.apache.spark.sql.SparkSession;

import static org.apache.spark.sql.functions.concat;

public class SparkTestApp {

    public static void main(String[] args) {
        SparkTestApp app = new SparkTestApp();
        app.start();
    }

    private void start() {

        SparkSession spark = SparkSession.builder()
                .appName("SparkTest")
                .master("local")
                .getOrCreate();
    }

}
