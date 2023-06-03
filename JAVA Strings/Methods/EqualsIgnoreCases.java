class EqualsIgnoreDemo{
    public static void main(String[] args){
        String str1="RAJMULIK";
        String  str2= "rajmulik";
        System.out.println(str1.equalsIgnoreCase(str2) ); //true
        String str3="java";
        System.out.println(str1.equalsIgnoreCase(str3)); // false
    }
}

//true if the argument is not null and it represents an equivalent String ignoring case; false otherwise