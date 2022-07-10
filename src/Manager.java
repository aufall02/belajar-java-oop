
//parentClass
class Manager {
    String name,company;

    Manager(String name){
        this.name = name;
    }
    Manager(String name,String company){
     this.name = name;
     this.company = company;
    }

    void sayHello(String name){
        System.out.println("Hi "+name+ ", My Name Is Mansger "+this.name);
    }
}

/*
note :

untuk memanggil Constractor dari parent class kita harus mengaksesnya dari dalam class child Constractor
jika sebuah class parent tidak memeliki Constractor yang Tidak ada  parameter-nya(Constractor default), maka cild class  wajib mengakses Constractor class parent  tersebut
 */
