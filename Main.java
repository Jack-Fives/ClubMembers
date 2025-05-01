public class Main{
    public static void main(String[] args){
        ClubMembers c = new ClubMembers();
        String[] members={
            "XIA, PEISU","ELLIAS, CLARENCE","VON AHN,LUIS"
        };
        c.addMembers(members, 2025);
        System.out.println(c.getMemberList());
    }
}