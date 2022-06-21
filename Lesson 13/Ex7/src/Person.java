public class Person {
    protected String name;
    protected int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //Person{name=Case Maxwell,age=30}
    public String toString(){
        return "Person{name=" + name + "," + "age=" +age +"}";
    }

}
