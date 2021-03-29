package ru.progwards.java1.lessons.classes;

public class ComplexNum {
    int a;
    int b;
    int c;
    int d;
    int i;


    public ComplexNum(int a, int b){
        this.a = a;
        this.b = b;
    }
    public String toString(){

        return (a + "+" + b + "i");
    }

    public ComplexNum add(ComplexNum num){
        c = num.a;
        d = num.b;
        int sum_a = a + c;
        int sum_b = b + d;
        return new ComplexNum(sum_a ,sum_b);
    }

    public ComplexNum sub(ComplexNum num){
        c = num.a;
        d = num.b;
        int sub_a = a - c;
        int sub_b = b - d;
        return new ComplexNum(sub_a,sub_b);
    }

    public ComplexNum mul(ComplexNum num){
        c = num.a;
        d = num.b;
        int mul_a = a * c - b * d;
        int mul_b = b * c + a * d;
        return new ComplexNum(mul_a,mul_b);
    }

    public ComplexNum div(ComplexNum num){
        c = num.a;
        d = num.b;
        int div_a = (a * c + b * d)/(c * c + d * d);
        int div_b = (b * c - a * d)/(c * c + d * d);
        return new ComplexNum(div_a,div_b);
    }
    public static void main(String[] args) {
        ComplexNum a1 = new ComplexNum(6, 12);
        ComplexNum a2 = new ComplexNum(24, 30);
        System.out.println(a1.toString());
        System.out.println(a2.toString());
        System.out.println(a1.add(a2));
        System.out.println(a1.sub(a2));
        System.out.println(a1.mul(a2));
        System.out.println(a1.div(a2));
    }
}
