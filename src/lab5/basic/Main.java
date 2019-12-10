package basic;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<A> array = new ArrayList<A>() {
            {
                add(new A());
                add(new B());
                add(new C());
                add(new D());
                add(new E());
                add(new F());
                add(new G());
                add(new H());
                add(new I());
                add(new J());
            }
        };
        System.out.println(array);
    }

    static class A {
        public String a = "a";

        @Override
        public String toString() {
            return a;
        }
    }

    static class B extends A {
        public String b = "b";

        @Override
        public String toString() {
            return b;
        }
    }

    static class C extends B {
        public String c = "c";

        @Override
        public String toString() {
            return c;
        }
    }

    static class D extends C {
        public String d = "d";

        @Override
        public String toString() {
            return d;
        }
    }

    static class E extends D {
        public String e = "e";

        @Override
        public String toString() {
            return e;
        }
    }

    static class F extends E {
        public String f = "f";

        @Override
        public String toString() {
            return f;
        }
    }

    static class G extends F {
        public String g = "g";

        @Override
        public String toString() {
            return g;
        }
    }

    static class H extends G {
        public String h = "h";

        @Override
        public String toString() {
            return h;
        }
    }

    static class I extends H {
        public String i = "i";

        @Override
        public String toString() {
            return i;
        }
    }

    static class J extends I {
        public String j = "j";

        @Override
        public String toString() {
            return j;
        }
    }
}
