class Quiz3{
    public static void main(String[]args){
        //Quiz P1
        StringBuffer str=new StringBuffer(new String(new char[]{'D','B'}));
        str.append("Mysql");
        System.out.println(str);

        //Quiz P2
//        StringBuffer str1=new StringBuffer("DEMO");
//        StringBuffer str2 = new StringBuffer();
//        str2=str2.append("DEMO");
//        System.out.println(str1.capacity()==str2.capacity());
        //Quiz P3
//        String str = new StringBuffer("JamesGosling"); // ERROR sting cant be stored in stringBuffer
//        System.out.println(str.replace('J','G'));
        //QUIZ P4
//        StringBuffer str= new StringBuffer(400);
//        str.append(400);
//        str.setLength(str.length());
//        System.out.println(str.capacity());
        //QUIZ P5
//        StringBuffer str = new StringBuffer("AndroidOne");
//        str.delete(7,10);
//        str.insert(str.length(),true);
//        System.out.println(str);
        //QUIZ P6
//        StringBuffer str=new StringBuffer();
//        str.ensureCapacity(10);
//        System.out.println(str.capacity());
        //QUIZ P7
//        StringBuffer str = new StringBuffer(400);
//        str.append("Java_Development_Kit");
//        str.trimToSize();
//        str.setLength(10);
//        System.out.println(str.capacity());
//        System.out.println(str.length());
        //QUIZ P8
//        StringBuffer sbvar1 = "core2web";
//        System.out.println(sbvar1.intern());
        //QUIZ P9
//        StringBuffer sbvar1= new StringBuffer("core2web");
//        long lvar1= System.identityHashCode(sbvar1);
//        sbvar1.append(" technologies");
//        long lvar2= System.identityHashCode(sbvar1);
//        if(lvar1==lvar2)
//            System.out.println("true");
//        else
//            System.out.println("false");
        //QUIZ10
//        String svar = "Core2Web";
//        StringBuffer sbvar = new StringBuffer("Core2Web");
//        if(svar.equals(sbvar))
//            System.out.println("Equal");
//        else
//            System.out.println("Not Equal");
    }
}