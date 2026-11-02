/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import model.BmiModel;
import model.BmiModel.JenisKelamin;

public class BmiController {

    @FXML private TextField tfBerat;
    @FXML private TextField tfTinggi;
    @FXML private RadioButton rbPria;
    @FXML private RadioButton rbWanita;
    @FXML private ToggleGroup groupGender;
    @FXML private Label lblHasil;
    @FXML private Label lblKategori;
    @FXML private Label lblIdeal;

    @FXML
    private void hitung() {
        try {
            double berat = bacaAngka(tfBerat.getText());
            double tinggi = bacaAngka(tfTinggi.getText());

            JenisKelamin gender = rbWanita.isSelected()
                    ? JenisKelamin.WANITA
                    : JenisKelamin.PRIA;

            BmiModel model = new BmiModel(berat, tinggi, gender);

            String warna = model.getWarna();
            String gaya = "-fx-font-weight: bold; -fx-text-fill: " + warna + ";";

            lblHasil.setStyle("-fx-font-size: 18px; " + gaya);
            lblHasil.setText(
                    String.format("BMI kamu: %.1f", model.getBmi())
            );

            lblKategori.setStyle("-fx-font-size: 14px; " + gaya);
            lblKategori.setText("Kategori: " + model.getKategori());

            lblIdeal.setText(
                    String.format(
                            "Perkiraan berat ideal: %.1f kg",
                            model.getBeratIdeal()
                    )
            );

        } catch (NumberFormatException ex) {
            tampilkanError("Masukkan angka yang valid!");
        } catch (IllegalArgumentException ex) {
            tampilkanError(ex.getMessage());
        }
    }

    @FXML
    private void reset() {
        tfBerat.clear();
        tfTinggi.clear();
        rbPria.setSelected(true);

        lblHasil.setText("");
        lblKategori.setText("");
        lblIdeal.setText("");
    }

    private double bacaAngka(String teks) {
        return Double.parseDouble(
                teks.trim().replace(',', '.')
        );
    }

    private void tampilkanError(String pesan) {
        lblHasil.setStyle(
                "-fx-font-size: 14px; -fx-text-fill: red;"
        );

        lblHasil.setText(pesan);
        lblKategori.setText("");
        lblIdeal.setText("");
    }
}
