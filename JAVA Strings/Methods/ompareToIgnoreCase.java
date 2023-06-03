class CompareToIgnoreDemo{
    public static void main(String[] args){
        String str1="RAJMULIK";
        String  str2= "rajmulik";
        System.out.println(str1.compareToIgnoreCase(str2)); //0
        String str3="java";
        System.out.println(str1.compareToIgnoreCase(str3)); // 8
    }
}
//Compares two strings lexicographically, ignoring case differences
//a negative integer, zero, or a positive integer as the specified
//String is greater than, equal to, or less than this String, ignoring case considerations.