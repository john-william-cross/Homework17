package edu.dmacc.codedsm.Homework16;

public class EmailTaskAssigner extends TaskAssigner {
    @Override
    public String assignTask(String User, Integer Priority) {
        return super.assignTask(User, Priority);
    }

    public EmailTaskAssigner() {
        System.out.println("This is from EmailTaskAssigner");
    }

}
