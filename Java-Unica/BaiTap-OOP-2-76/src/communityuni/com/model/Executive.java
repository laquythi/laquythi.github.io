package communityuni.com.model;

public class Executive extends Employee {
    private double bonus;

    // method
    public void awardBonus(double bonus){
        this.bonus = bonus;
        System.out.println("lanh bonus = " + bonus);
    }
    public double pay(){
        return super.pay() + this.bonus;
    }
}
