package com.company.LinkedListKunal;

public class mainOfCustomLL {
    public static void main(String[] args) {
        CustomLL f=new CustomLL();
        f.addEnd(1);
        f.addEnd(1);
        f.addEnd(2);
        f.addEnd(5);
        f.addEnd(9);
        f.addEnd(91);
        CustomLL s=new CustomLL();
        s.addEnd(21);
        s.addEnd(121);
        s.addEnd(211);
        s.addEnd(511);
        s.addEnd(911);
        s.addEnd(9111);

        f.display();
        System.out.println();
        s.display();
        System.out.println();

        CustomLL ans=CustomLL.merge(f,s);

        ans.display();
    }
}
