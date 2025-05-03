import java.util.ArrayList;
public class Main{
    public static void main(String[] args){
        ClubMembers c = new ClubMembers();
        String[] members={
            "XIA, PEISU","ELLIAS, CLARENCE","VON AHN,LUIS"
        };
        c.addMembers(members, 2025);
        System.out.println(c.getMemberList());
        MemberInfo[] roster={
            new MemberInfo("Smith, Jane", 2019, false),
            new MemberInfo("Fox, Steve", 2018, true),
            new MemberInfo("Xin, Micahel", 2017, false),
            new MemberInfo("Garcia, Maria", 2020, true),

        };
        ArrayList<MemberInfo> memeberList=new ArrayList<>();
        for(MemberInfo m:roster)memeberList.add(m);
        c.setMembersList(memeberList);
        System.out.println(c.removeMembers(2018));
        System.out.println(c.getMemberList());
    }
}