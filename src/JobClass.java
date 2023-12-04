/*
Note: Work in Progress
 */
public class JobClass {
    private String Mainjob;

    public JobClass(){

    }
    public String mainJob(int job){
        if (job == 1){
            this.Mainjob = "warrior";
        } else if (job == 2){
            this.Mainjob = "ranger";
        } else if (job == 3){
            this.Mainjob ="mage";
        }
        return Mainjob;
    }
}
