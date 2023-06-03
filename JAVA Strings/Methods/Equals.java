class EqualDemo{
    public static void main(String[] args){
        String str1="Raj";
        String str2="raj";
        String str3= new String("Raj");
        System.out.println(str1.equals(str2)); //false
        System.out.println(str1.equals(str3)); //true
    }
}

//true if the given object represents a String equivalent to this string, false otherwise