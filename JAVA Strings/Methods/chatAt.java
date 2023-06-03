class CharAtDemo{
    public static void main(String[] args){
        String name = "Rajmulik";
        System.out.println(name.charAt(3));     //m
        System.out.println(name.charAt(0));     //R
        System.out.println(name.charAt(8));     // StringIndexOutOfBoundsException: Index 8 out of bounds
    }
}