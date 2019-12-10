package medium;

public class Main {

    public static void main(String[] args) {
        System.out.println(new J(new X("x")));
    }

    static class X {
        public String x;

        public X(String x) {
            this.x = x;
        }

        @Override
        public String toString() {
            return x;
        }
    }

    static class A {
        protected String a;
        protected X x;

        public A(String a, X x) {
            this.a = a;
            this.x = x;
        }

        @Override
        public String toString() {
            return a + " " + x.x;
        }
    }

    static class B extends A {
        protected String b = "b";

        public B(X x) {
            super("a", x);
        }

        @Override
        public String toString() {
            return b;
        }
    }

    static class C extends B {
        protected String c = "c";

        public C(X x) {
            super(x);
        }

        @Override
        public String toString() {
            return c;
        }
    }

    static class D extends C {
        protected String d = "d";

        public D(X x) {
            super(x);
        }

        @Override
        public String toString() {
            return d;
        }
    }

    static class E extends D {
        protected String e = "e";

        public E(X x) {
            super(x);
        }

        @Override
        public String toString() {
            return e;
        }
    }

    static class F extends E {
        protected String f = "f";

        public F(X x) {
            super(x);
        }

        @Override
        public String toString() {
            return f;
        }
    }

    static class G extends F {
        protected String g = "g";

        public G(X x) {
            super(x);
        }

        @Override
        public String toString() {
            return g;
        }
    }

    static class H extends G {
        protected String h = "h";

        public H(X x) {
            super(x);
        }

        @Override
        public String toString() {
            return h;
        }
    }

    static class I extends H {
        protected String i = "i";

        public I(X x) {
            super(x);
        }

        @Override
        public String toString() {
            return i;
        }
    }

    static class J extends I {
        protected String j = "j";

        public J(X x) {
            super(x);
        }

        @Override
        public String toString() {
            return x + " " + a + " " + b + " " + c + " " + d + " " + e + " " + f + " " + g + " " + h + " " + i + " " + j;
        }
    }
}
