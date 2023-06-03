
class CompareToDemo{
    public static void main(String[] args){
        String str1="Raj";
        String str2="raj";
        System.out.println(str1.compareTo(str2)); // O/P : -32 (R[82] - r[114] = -32)

    }
}
//If raj = raj then O/P = 0
//if Not Same Returns Difference

//The ASCII values for uppercase letters range from 65 to 90,
// while the ASCII values for lowercase letters range from 97 to 122.

//the value 0 if the argument string is equal to this string;
// a value less than 0 if this string is lexicographically less than the string argument;
// and a value greater than 0 if this string is lexicographically greater than the string argument.