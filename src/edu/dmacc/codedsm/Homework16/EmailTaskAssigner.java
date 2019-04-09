package edu.dmacc.codedsm.Homework16;

public class EmailTaskAssigner implements TaskAssigner {

    public EmailTaskAssigner() {
        System.out.println("This is from EmailTaskAssigner");
    }

    @Override
    public String userAndPriority(String user, int priority) {
        return "Task user is: " + user + ". Task priority is: " + priority + ".";
    }

}
