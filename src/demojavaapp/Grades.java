package demojavaapp;

public class Grades {
    
    String name;
    int id;
    double p, m, pf, f;
    
    public void getName(String nm, int sid, double sp, double sm, double spf, double sf){
        this.name = nm;
        this.id = sid;
        this.p = sp;
        this.m = sm;
        this.pf = spf;
        this.f = sf; 
    }
    
    public void displayGrade(){
        
        double average = (this.p + this.m + this.pf + this.f)/4;
        
        String remarks = (average > 3.0) ? "Failed" : "Passed";
        
        System.out.printf("%-10d %-10s %-10.2f %-10.2f %-10.2f %-10.2f %-10.2f %-10s\n", 
                this.id, this.name, this.p, this.m, this.pf, this.f, average, remarks);
        
    }
    
}
