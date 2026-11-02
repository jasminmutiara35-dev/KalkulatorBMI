package application;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class KalkulatorBMIController {

    @FXML
    private TextField txtBerat;

    @FXML
    private TextField txtTinggi;

    @FXML
    private RadioButton rbPerempuan;

    @FXML
    private RadioButton rbLakiLaki;

    @FXML
    private Label lblHasil;

    @FXML
    private Label lblKategori;

    @FXML
    private Button btnHitung;

    @FXML
    private void hitungBMI() {
        try {
            double berat = Double.parseDouble(txtBerat.getText());
            double tinggi = Double.parseDouble(txtTinggi.getText()) / 100;

            if (berat <= 0 || tinggi <= 0) {
                lblHasil.setText("Masukkan angka yang valid!");
                return;
            }

            double bmi = berat / (tinggi * tinggi);

            lblHasil.setText(String.format("Hasil BMI: %.2f", bmi));

            if (bmi < 18.5) {
                lblKategori.setText("Kategori: Berat badan kurang");
            } else if (bmi < 25) {
                lblKategori.setText("Kategori: Normal");
            } else if (bmi < 30) {
                lblKategori.setText("Kategori: Berat badan berlebih");
            } else {
                lblKategori.setText("Kategori: Obesitas");
            }

        } catch (NumberFormatException e) {
            lblHasil.setText("Masukkan berat dan tinggi dengan benar!");
        }
    }
}