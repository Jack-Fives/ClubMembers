import java.util.ArrayList;
public class ClubMembers{
    private ArrayList<MemberInfo> membersList;
    public ClubMembers(){
        membersList=new ArrayList<MemberInfo>();
    }
    public void addMembers(String[] names,int gradYear){
        for(String s:names){
            membersList.add(new MemberInfo(s,gradYear,true));
        }
    }
    public ArrayList<MemberInfo> getMemberList(){
        return membersList;
    }
    
    public ArrayList<MemberInfo> removeMembers(int year){
        ArrayList<MemberInfo> alumni=new ArrayList<MemberInfo>();
        for(int i=0;i<membersList.size();i++){
            MemberInfo member=membersList.get(i);
            if(member.getGradYear()<=year){
                if(member.inGoodStanding()){
                    alumni.add(member);
                }
                
            }
        }
    }
}