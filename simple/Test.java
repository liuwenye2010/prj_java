//https://www.runoob.com/java/java-package.html
//https://www.runoob.com/w3cnote/java-compile-with-package.html
package mypack1;
import mypack.A;
public class Test{
    public static void main(String[] args){
        A a = new A();
        a.setName("zs");
        //a.name="zs";
        a.setAge(18);
        System.out.println(a.getName()+a.getAge());
    }
}