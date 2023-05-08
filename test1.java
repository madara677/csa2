package CSA2;

public class test1 {

        public static void main(String[] args) {
            Monkey monkey = new Monkey("猴子");
            People people = new People("人类");

            monkey.speak();
            people.speak();
            people.think();
        }
    }


class Monkey {
    private String name;

    public Monkey(String s) {
        name = s;
    }

    public void speak() {
        System.out.println("咿咿呀呀......");
    }
}

class People extends Monkey {
    public People(String s) {
        super(s);
    }

    @Override
    public void speak() {
        System.out.println("小样儿，不错嘛！会说话了！");
    }

    public void think() {
        System.out.println("别说话！认真思考！");
    }
}