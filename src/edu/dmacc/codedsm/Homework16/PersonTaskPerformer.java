package edu.dmacc.codedsm.Homework16;

import java.util.List;

public class PersonTaskPerformer extends TaskPerformer {

    public PersonTaskPerformer() {
        System.out.println("This is from PersonTaskPerformer");
    }

    @Override
    public void performTask(Task task, User user) {
        super.performTask(task, user);
    }
}