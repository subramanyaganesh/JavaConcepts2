package ANNONIMUSINNERCLASS_WRAPPING;

public class AnonymousInnerClass implements Content {
    int i = 100;

    public Content myFunction(String s) {


        if (s.equals("hi")) {
            return new Content() {   /////able to create object of interface
                //note in case of annonimus innercalss only object can be returned
                int i = 9;

                @Override
                public int value() {
                    return i;
                }
            };
        } else if (s.equals("bye")) {
            return new Content() {
                int i = 15;

                @Override
                public int value() {
                    return i;
                }
            };
        } else if (s.equals("good")) {
            return new Content() {
                @Override
                public int value() {
                    return i;
                }
            };
        }
        return null;
    }

    @Override
    public int value() {
        return i;
    }

    public static void main(String[] args) {
        AnonymousInnerClass anonimusInnerClass = new AnonymousInnerClass();
        System.out.println(anonimusInnerClass.value());

        Content c = anonimusInnerClass.myFunction("hi");
        System.out.println(c.value());

        c = anonimusInnerClass.myFunction("bye");
        System.out.println(c.value());

        c = new AnonymousInnerClass().myFunction("good");
        System.out.println(c.value());
    }

}
