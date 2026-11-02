
# Kalkulator BMI

Aplikasi Kalkulator BMI merupakan aplikasi desktop berbasis Java yang dikembangkan menggunakan JavaFX untuk membangun GUI. Aplikasi ini dibuat untuk menghitung nilai BMI berdasarkan data berat badan dan tinggi badan yang dimasukkan oleh pengguna.

## Fitur

- Input berat badan dalam satuan kilogram (kg).
- Input tinggi badan dalam satuan sentimeter (cm).
- Pilihan jenis kelamin.
- Perhitungan Body Mass Index (BMI).
- Menampilkan hasil perhitungan BMI.
- Validasi input untuk memastikan data yang dimasukkan sesuai.

## Teknologi yang Digunakan

- Java JDK 17
- JavaFX 21
- Apache Maven
- Apache NetBeans IDE
- Scene Builder

## Tampilan Aplikasi



## Rumus Perhitungan

Rumus BMI:

BMI = Berat Badan (kg) / Tinggi Badan (m)²

## Struktur Project

```text
kalkulatorBMI/
├── src/
│   └── main/
│       ├── java/
│       │   └── main/
│       │       └── Main.java
│       └── resources/
│           └── ...
├── pom.xml
└── README.md
```

## Cara Menjalankan

### 1. Clone Repository

Buka terminal atau Command Prompt, kemudian jalankan:

```bash
git clone https://github.com/jasminmutiara35-dev/KalkulatorBMI
```

### 2. Masuk ke Direktori Project

```bash
cd kalkulatorBMI
```

### 3. Periksa Instalasi Java dan Maven

Pastikan Java dan Maven sudah terpasang:

```bash
java -version
mvn -version
```

### 4. Buka Project

Buka Apache NetBeans, kemudian pilih **File → Open Project**. Cari folder project `kalkulatorBMI`.

### 5. Jalankan Aplikasi

Buka terminal pada direktori utama project, kemudian jalankan:

```bash
mvn javafx:run
```

Tunggu hingga proses build selesai. Jika berhasil, aplikasi Kalkulator BMI akan terbuka.

## Cara Menggunakan Aplikasi

1. Jalankan aplikasi Kalkulator BMI.
2. Pilih jenis kelamin.
3. Masukkan berat badan pada kolom yang tersedia.
4. Masukkan tinggi badan pada kolom yang tersedia.
5. Klik tombol **Hitung BMI**.
6. Hasil perhitungan akan ditampilkan pada aplikasi.

---

