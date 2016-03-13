package oca_casting;

public class TypeCasting {
    public static void main(String[] args) {
        CA a = new CB();
        CB b;
        b = (CB)a;

    }
}

class CA {}
class CB extends CA {}
class CC extends CB {}

