package edu.dmacc.codedsm.Homework16;

import java.util.List;

public class TraineeTaskPerformer extends TaskPerformer {

    public TraineeTaskPerformer() {
        System.out.println("This is from TraineeTaskPerformer.");
    }

    @Override
    public void performTask(Task task, List<String> Users) {
        super.performTask(task, Users);
    }
}

