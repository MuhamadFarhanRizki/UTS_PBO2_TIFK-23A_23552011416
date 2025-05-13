UTS Pemrograman Berorientasi Obyek 2
Mata Kuliah: Pemrograman Berorientasi Obyek 2
Dosen Pengampu: Muhammad Ikhwan Fathulloh
1. Profil
Nama: Muhamad Farhan Rizki
NIM: 23552011416
Studi Kasus: Pengembangan Aplikasi Todo List Web untuk Mahasiswa dan Dosen Universitas Teknologi Bandung (UTB)
2.Judul Studi Kasus
Perancangan Sistem Manajemen Tugas Pribadi Berbasis Web untuk Mahasiswa dan Dosen UTB Menggunakan Java Spring Boot dan Thymeleaf.
3.Penjelasan Studi Kasus
Universitas Teknologi Bandung (UTB) ingin membangun sebuah sistem manajemen tugas (Todo List) berbasis web yang dapat digunakan oleh mahasiswa dan dosen untuk mencatat, memantau, dan mengelola daftar tugas pribadi mereka secara online.
Aplikasi ini dibuat menggunakan Java Spring Boot untuk bagian server (backend) dan Thymeleaf untuk bagian tampilan (frontend). Sistem ini dikembangkan dengan pendekatan Model-View-Controller (MVC), yang memisahkan bagian logika program, tampilan pengguna, dan pengelolaan data agar lebih terstruktur dan mudah dikembangkan.
Fitur utama sistem meliputi:
•	Registrasi dan login pengguna (mahasiswa/dosen)
•	Menambah, mengedit, dan menghapus tugas
•	Menandai tugas sebagai selesai atau belum
•	Filter daftar tugas berdasarkan status (semua, selesai, belum selesai)
•	Tampilan web yang responsif dan mudah digunakan
Dengan adanya sistem ini, UTB berharap dapat meningkatkan produktivitas civitas akademika dalam mengatur aktivitas dan tanggung jawab pribadi secara lebih efektif dan terorganisir.
4. Penjelasan 4 Pilar OOP dalam Studi Kasus
A. Inheritance (Pewarisan)
Penjelasan: Pewarisan digunakan ketika sebuah class mewarisi properti atau method dari class lainnya.
Contoh Implementasi:
•	Class UserDetailsServiceImpl dan UserDetailsService mengimplementasikan interface UserDetailsService dari Spring Security.
public class UserDetailsServiceImpl implements UserDetailsService {
    ...
}
2. Encapsulation (Enkapsulasi)
Penjelasan: Enkapsulasi menyembunyikan data dalam class dan hanya memperbolehkan akses melalui method (getter/setter).
Contoh Implementasi:
•	Pada class User dan ToDo, semua properti dibuat private dan diakses melalui method getter dan setter.
@Entity
public class User {
    private Long id;
    private String username;
    private String password;

    public Long getId() { return id; }
    public void setUsername(String username) { this.username = username; }
}
3. Polymorphism (Polimorfisme)
Penjelasan: Polimorfisme memungkinkan objek untuk berperilaku berbeda tergantung konteksnya.
Contoh Implementasi:
•	Method loadUserByUsername() diimplementasikan berbeda oleh UserDetailsServiceImpl dan UserDetailsService.
@Override
public UserDetails loadUserByUsername(String username) {
    ...
}
4. Abstraction (Abstraksi)
Penjelasan: Abstraksi menyembunyikan detail implementasi dan hanya menampilkan fungsionalitas penting.
Contoh Implementasi:
•	Penggunaan interface UserRepository dan ToDoRepository yang hanya mendefinisikan operasi data, implementasinya di-handle oleh Spring JPA.
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}

5.Demo Proyek
GitHub: [Link Repository GitHub]
YouTube: [Link Demo YouTube]
