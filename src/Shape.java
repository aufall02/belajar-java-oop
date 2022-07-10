class Shape {
    int getCorner(){
        return 0;
    }
}
class Rectangle extends Shape{
    int getCorner(){
        return 4;
    }

    int  getParentCorner(){
        return super.getCorner();
    }
}

/*
super keyword : digunakan untuk mengakses method class parent yang sudah terkanjur kita Overriding(field parent juga bisa di akses menggnakan keyword super)
 */
