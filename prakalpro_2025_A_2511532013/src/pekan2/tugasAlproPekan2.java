package pekan2;  

public class tugasAlproPekan2 {
    public static void main(String[] args) {
        // deklarasi variabel
        int nilai = 85;          // int
        float rataRata = 82.5f;  // float
        char grade;              // char
        boolean lulus;           // boolean

        // menentukan grade
        if (nilai >= 80) {
            grade = 'A';
        } else if (nilai >= 70) {
            grade = 'B';
        } else if (nilai >= 60) {
            grade = 'C';
        } else {
            grade = 'D';
        }

        // menentukan status kelulusan
        lulus = (nilai >= 60);

        // output ke layar
        System.out.println("=== Data Nilai Mahasiswa ===");
        System.out.println("Nilai     : " + nilai);
        System.out.println("Rata-rata : " + rataRata);
        System.out.println("Grade     : " + grade);
        System.out.println("Lulus     : " + lulus);
    }
}
