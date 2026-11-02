/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


package model;

public class BmiModel {

    public enum JenisKelamin {
        PRIA, WANITA
    }

    private final double beratKg;
    private final double tinggiCm;
    private final JenisKelamin jenisKelamin;

    public BmiModel(double beratKg, double tinggiCm,
                    JenisKelamin jenisKelamin) {
        if (beratKg <= 0 || tinggiCm <= 0) {
            throw new IllegalArgumentException(
                "Berat dan tinggi harus lebih dari 0"
            );
        }

        this.beratKg = beratKg;
        this.tinggiCm = tinggiCm;
        this.jenisKelamin = jenisKelamin;
    }

    public double getBmi() {
        double tinggiM = tinggiCm / 100.0;
        return beratKg / (tinggiM * tinggiM);
    }

    public String getKategori() {
        double bmi = getBmi();

        if (bmi < 18.5) {
            return "Kurus (Underweight)";
        } else if (bmi < 25) {
            return "Normal";
        } else if (bmi < 30) {
            return "Kelebihan berat badan (Overweight)";
        } else {
            return "Obesitas";
        }
    }

    public String getWarna() {
        double bmi = getBmi();

        if (bmi < 18.5) {
            return "#2980b9";
        } else if (bmi < 25) {
            return "#27ae60";
        } else if (bmi < 30) {
            return "#e67e22";
        } else {
            return "#c0392b";
        }
    }

    public double getBeratIdeal() {
        double inci = tinggiCm / 2.54;
        double lebihInci = Math.max(0, inci - 60);
        double dasar = (jenisKelamin == JenisKelamin.PRIA)
                ? 50.0 : 45.5;

        return dasar + 2.3 * lebihInci;
    }

    public JenisKelamin getJenisKelamin() {
        return jenisKelamin;
    }
}
