class ManagerApps {
    public static void main(String[] args) {
        //membuat Object Dari ClassParent
        var manager = new Manager("Aufal");
        manager.sayHello("budi");

        //membuat Object Dari ClassChild
        var vp = new VicePresident("Basofi");
        vp.sayHello("Niko");

        System.out.println(manager);
        System.out.println(manager.toString());
        System.out.println(vp);
        System.out.println(vp.toString());

        /*
        note :
        Class Object adalah SuperClass untuk semua class yang ada di java
        Overriding : mendeklarasiakan ulang method di child class, yang sudah ada di parentClass
        Overloading : Mendeklarasikan ulang method yang sama di class yang sama
        ketika melakakan Overriding secara Otomatis  ketika kita sudah membuat Object dari childClass, method yang di Class Parent tidak bisa diakses lagi

         */
    }
}

