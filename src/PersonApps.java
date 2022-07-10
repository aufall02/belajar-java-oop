public class PersonApps {
    public static void main(String[] args) {
//        Membuat object
        var person1 = new Person("Aufal","Pasuruan"); //memanggil Constractor
//        manipulasi field
        person1.name = "Aufal";
        person1.address = "Pasuruan";
//        person1.country = "Pasuruan"; tidak bisa dirubah karna sudah final
//        memanggil atribut
        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);
//        memanggil method
        person1.sayHello("Budi");


        Person person2 = new Person("Agung");

        Person person3;
        person3 = new Person();
        person3.name = "Joko";
        person3.sayHello("Budi");

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
        /*
        note :
        semua object yang belum dideklarasikan akan bernilai null
        Constractor adalah Method yang akan dipanggil ketika pertamakali Object dibuat
        untuk membuat Constractor nama method harus sama dengan nama Class & tidak membutuhkan void atau return value
        syarat Constrator Overloading type parameter harus berbeda atau jumlah parameter harus berbeda
        cara memanggil Constructor lain , kita hanya perlu memanggilnya seperti memeanggil Method. namum dengan kata kunci this
        variable shadoeing terjadi ketika kita membuat nama variable yang sama didalam scope yang menutupi variable denga nama yang sama  di scope diatasnya
        this keyword digunakan untuk mengatasi maslah variable shadowing
        this bisa digunakan untuk mengakse field atau atribut  milik object saat ini  dan juga bisa digunakan untuk memanggil method
        Inheritance -> pewarisan atau menurunkan  sebuah class ke class lain(classParent classChild)
        class child hanya bisa mempunyai satu class parent namu class parent bisa mempunyai banyak class  cild
        untuk melakukan Inheritance menggunakan kata kunci extends
         */
    }
}
