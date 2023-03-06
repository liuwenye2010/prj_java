//https://www.runoob.com/java/java-package.html
//https://www.runoob.com/w3cnote/java-compile-with-package.html
package mypack;
public class A {
    String name;
    int age;
    public void setName(String _name){
        this.name =_name;
    }
    public void setAge(int _age){
        this.age = _age;
    }
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public static void main(String[] args){
        A a = new A();
        //a.setName("zs");
        a.name="Run: zs";
        a.setAge(18);
        System.out.println(a.getName()+a.getAge());
    }
}