/*
*All methods have the base elements of the return type and method name
*The base method would be returnType methodName(anyParamters) and then curly brackets
*You can also add an access modifier as a prefix so public, private, protected etc.
*Another modifier is static which allows you to access the method without creating an object
Examples below
*/
class Main {
  public static void main(String[] args) {// the must have line
    // I want to square root a number but it is not static
    Demo d = new Demo();// extra line boo
    int number = d.square(4);// non static
    System.out.println(number);
    number = Demo.staticSquare(6);// static so no object needs creating
    System.out.println(number);
    // What if I want to only use a method internally private is your friend
    d.multi(3, 5);

  }
}

class Demo {
  public Demo() {

  }

  int square(int x) {
    return x * x;
  }

  static int staticSquare(int x) {
    return x * x;
  }

  private int addition(int x, int y) {
    return x + y;
  }

  void multi(int x, int y) {//void just means no return value
    int temp = 0;
    for (int z = 1; z <= x; z++) {
      temp = addition(temp, y);//quirky example but yeah
    }
    System.out.println(temp);
  }
}