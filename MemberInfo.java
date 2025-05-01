public class MemberInfo{
    private String Name;
    private int grad;
    private boolean rep;
    public MemberInfo(String name,int gradYear,boolean hasGoodStanding){
        Name=name;
        grad=gradYear;
        rep=hasGoodStanding;
    }
    public String getName(){
        return Name;
    }
    public int getGradYear(){
        return grad;
    }
    public boolean inGoodStanding(){
        return rep;
    }
    public String toString(){
     String s="\nName: "+ Name + "\n";
     s+="Year: "+grad+"\n";
     return s+"Good Standing: "+rep+"\n";
    }
}