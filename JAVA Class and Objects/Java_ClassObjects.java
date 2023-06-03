
class COC{
    int Members = 50;
    String Acc_name = "Warrior";
    static String Clan_name="Pune Fighters";
    void War(){
        System.out.println("Get Readys "+Clan_name);
        System.out.println("All "+Members);
    }
}
class Main {
    public static void main(String[] args) {
        COC obj1 = new COC();
        COC obj2 = new COC();
        obj1.War();
        obj2.War();
        System.out.println("-----------------------------");
        obj2.Members=30;
        obj2.Acc_name="persian";
        obj2.Clan_name="Indian";
        obj1.War();
        obj2.War();

    }
}