public class TrafficLight {
    private String warna;
    private int durasi;

    public TrafficLight(String warna, int durasi) {
        this.warna = warna;
        this.durasi = durasi;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public int getDurasi() {
        return durasi;
    }

    public void setDurasi(int durasi) {
        this.durasi = durasi;
    }

    public boolean isRed() {
        return "merah".equalsIgnoreCase(warna);
    }

    public boolean isGreen() {
        return "hijau".equalsIgnoreCase(warna);
    }

    public void printInfo() {
        System.out.println("Warna: " + warna + ", Durasi: " + durasi + " detik");
    }
}

class TrafficLigh {
    public static void main(String[] args) {

        TrafficLight trafficLight = new TrafficLight("merah", 30);
        trafficLight.printInfo();


        trafficLight.setWarna("hijau");
        trafficLight.setDurasi(60);
        System.out.println("Setelah perubahan:");
        trafficLight.printInfo();


        if (trafficLight.isRed()) {
            System.out.println("Lampu sedang merah.");
        } else if (trafficLight.isGreen()) {
            System.out.println("Lampu sedang hijau.");
        } else {
            System.out.println("Lampu tidak merah atau hijau.");
        }
    }
}
