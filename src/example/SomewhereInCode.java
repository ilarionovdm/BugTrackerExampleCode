package example;

import reglament.Bug;
import core.BugFactory;
import core.BugTrackerFactory;
import reglament.BugTrackerInterface;

public class SomewhereInCode {

    public void someFunction() {
        //found bug
        //fill the information about step and test
        Bug bug = BugFactory.getBug(1, 1, "");
        BugTrackerInterface bti = BugTrackerFactory.getBugTracker();
        bti.createBug(bug);
        if (bug.noErrors) {

        } else {

        }
    }
}
