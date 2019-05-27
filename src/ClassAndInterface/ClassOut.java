package ClassAndInterface;

public class ClassOut {

    class ClassInner{}

    void init(){

        //sposoby tworzenia obiektow, gdy mamy klasy wewnetrzne

        ClassOut classOut=new ClassOut();
        ClassInner classInner=new ClassInner();
        ClassOut.ClassInner instance=new ClassInner();
        ClassOut.ClassInner instance2=classOut.new ClassInner();

    }


}
