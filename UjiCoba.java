import java.util.Scanner;

interface panggil{
    void pitbull();
    void dalmation();
    void cihuahua();
    void kintamani();
}

abstract class menu implements panggil{}

class anjing extends menu{
    String name;
    String color;
    String ras;
    int age;
    
    public void pitbull() {
        this.name = "Rocky";
        this.color = "Coklat";
        this.ras = "Pitbull";
        this.age = 2;
        System.out.println("\nNama : "+name+"\nWarna : "+color+"\nRas : "+ras+"\nUmur : "+age+" tahun");
    }
    public void dalmation() {
        this.name = "Milky";
        this.color = "Putih";
        this.ras = "Dalmation";
        this.age = 1;
        System.out.println("\nNama : "+name+"\nWarna : "+color+"\nRas : "+ras+"\nUmur : "+age+" tahun");
    }
    public void cihuahua() {
        this.name = "Cilik";
        this.color = "Emas";
        this.ras = "Cihuahua";
        this.age = 3;
        System.out.println("\nNama : "+name+"\nWarna : "+color+"\nRas : "+ras+"\nUmur : "+age+" tahun");
    }
    public void kintamani(){
        this.name = "Snowy";
        this.color = "Putih";
        this.ras = "Kintamani";
        this.age = 1;
        System.out.println("\nNama : "+name+"\nWarna : "+color+"\nRas : "+ras+"\nUmur : "+age+" tahun");
    }
}

class ProgramMain {
    
    public static void main (String args[ ]) {
        
        Scanner myObj = new Scanner(System.in);
        System.out.println("\nSelamat datang program mencari anjing\n");
        System.out.println("Daftar anjing : \n1.Pitbull\n2.Dalmation\n3.Cihuauha\n4.Kintamani\n");
        System.out.print("Pilih no untuk mengetahui detail anjing : ");
        int pilih = myObj.nextInt();
        panggil a=new print();
        
        System.out.println("Berikut detail anjing : ");
        switch(pilih){
            case 1:
                a.pitbull();
                break;
            case 2:
                a.dalmation();
                break;
            case 3:
                a.cihuahua();
                break;
            case 4:
                a.kintamani();
                break;
            default:
                System.out.println("Maaf, perintah salah, program out");
            }
        System.out.println("\nTerimakasih dan sampai jumpa");
    }
    


}
