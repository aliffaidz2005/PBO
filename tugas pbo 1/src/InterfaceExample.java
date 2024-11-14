// Contoh Interface
interface Animal {
    // Interface hanya dapat mendeklarasikan metode, tanpa implementasi.
    void sound(); // Metode abstrak, tanpa implementasi
    void move();
}

// Contoh Kelas Abstrak
abstract class Bird {
    // Kelas abstrak dapat memiliki metode abstrak maupun metode dengan implementasi.
    abstract void sound(); // Metode abstrak
    void fly() { // Metode dengan implementasi
        System.out.println("Burung ini bisa terbang!");
    }
}

// Kelas Konkret yang Mengimplementasikan Interface
class Dog implements Animal {
    // Harus mengimplementasikan semua metode dari interface Animal
    public void sound() {
        System.out.println("Anjing menggonggong");
    }

    public void move() {
        System.out.println("Anjing berjalan dengan empat kaki");
    }
}

// Kelas Konkret yang Mewarisi Kelas Abstrak
class Eagle extends Bird {
    // Hanya perlu mengimplementasikan metode abstrak dari kelas Bird
    public void sound() {
        System.out.println("Elang menjerit");
    }
}

// Kelas Utama untuk Menguji Perbedaan
public class InterfaceExample{
    public static void main(String[] args) {
        // Menggunakan interface
        Animal dog = new Dog();
        dog.sound();
        dog.move();

        // Menggunakan abstract class
        Bird eagle = new Eagle();
        eagle.sound();
        eagle.fly();
    }
}

/* PENJELASAN:
1. Interface:
   - Interface hanya mendeklarasikan metode tanpa implementasi.
   - Kelas yang mengimplementasikan interface wajib mengimplementasikan semua metode dari interface.
   - Interface digunakan untuk mendefinisikan kontrak yang harus dipenuhi oleh kelas tanpa memperhatikan bagaimana metode-metode tersebut diimplementasikan.

2. Kelas Abstrak:
   - Kelas abstrak dapat memiliki metode abstrak dan metode yang sudah diimplementasikan.
   - Kelas yang mewarisi kelas abstrak hanya perlu mengimplementasikan metode-metode abstrak, dan dapat menggunakan metode-metode yang sudah diimplementasikan.
   - Kelas abstrak digunakan jika ada sebagian perilaku yang ingin diwariskan ke subclass, sementara bagian lainnya bisa dibiarkan untuk diimplementasikan oleh subclass.

Kesimpulan:
- Gunakan *interface* ketika semua metode perlu diimplementasikan oleh kelas yang menggunakannya.
- Gunakan *kelas abstrak* ketika ingin memberikan sebagian implementasi atau perilaku kepada kelas yang diwariskan.
*/
