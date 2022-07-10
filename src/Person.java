class Person {
//    membuat field/properties/atribut
    String name;
    String address;
    final String country = "Indonesia";  //data tidak bisa dirubah & variable harus sudah ada nilainya
//    mmebuat Constractor
//    Constructor Overloading
    Person(String paramName, String paramAddress){
        name = paramName;
        address = paramAddress;
    }
    //variable shadowing
//    Person(String name, String address){
//        name = name;
//        address = address;
//   }
    Person(String paramName){
//        name = paramName;
        this(paramName,null);//memanggil Constractor lain -> memanggil constractor pertama
    }

    Person(){
    this(null);//memanggil Constractor 2
    }

//    membuat method

    void sayHello(String name){
        System.out.println("Hello "+name+", My Name is "+this.name);
    }
}
