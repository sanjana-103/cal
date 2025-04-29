class ArithmeticOp{
    int a=10;
    int b=20;
    void display(){
        System.out.println("ADD:"+(a+b));
        System.out.println("SUB:"+(a-b));
        System.out.println("MUL:"+(a*b));
        System.out.println("DIV:"+(a/b));

    }

}
class simple {
    public static void main(String[] args) {
        ArithmeticOp a1=new ArithmeticOp();
        a1.display();
    }
    
}
