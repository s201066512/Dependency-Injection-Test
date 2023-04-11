/*
dependency injection
classB has a method called bMethod, and it prints "aiden"
classA has aMethod which uses bMethod and adds "tenn"
however, the two are in separate classes
one way to use bMethod in classA would be to create a new object of classB in classA and use the method on classB like so:

classA{
    classB b = new classB();
    public String aMethod(){
        return b.bMethod() + "tenn";
    }
    public static void main(String[] args){
        classA a = new classA();
        System.out.println(a.aMethod());
    }
}
that would do the same thing as what I have below
but, it's bad practice to do it like that because if I were to change classB to classC and use cMethod, I'd need to change more stuff (not really in this case because it's a simple program but yeah)
to be honest I'm not actually entirely sure why it's better to do it this way instead
I'll ask tomorrow
* */
public class classA {
    classB B;
    public classA(classB b){
        B = b;
    }
    public String aMethod(){
        return B.bMethod() + "tenn";
    }

    public static void main(String[] args) {
        classB b = new classB();
        classA a = new classA(b);
        System.out.print(a.aMethod());
    }
}