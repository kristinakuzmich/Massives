public class Str {
    public static void main(String[] args) {
        int i=34;
        double d = 3.14;
        byte b=1;
        short s=12;
        long l=123;
        char c='y';
        float f= 3.14f;
        boolean bo=true;

        Integer in=Integer.valueOf(i);
        Double dou = Double.valueOf(d);
        Byte by=Byte.valueOf(b);
        Short sh=Short.valueOf(s);
        Long lo=Long.valueOf(l);
        Character ch= Character.valueOf(c);
        Float fl=Float.valueOf(f);
        Boolean boo=Boolean.valueOf(bo);

        System.out.println(in+"\n"+dou+"\n"+by+"\n"+sh+"\n"+lo+"\n"+ch+"\n"+fl+"\n"+boo);
    }
}
