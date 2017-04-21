package example;


import reglament.Bug;
import reglament.BugTracker;

public class BugzillaBTPlugin extends BugTracker {

    @Override
    public Bug createBug(Bug bug) {
        String test = ((BugzillaBug)bug).bugzillaTest;
        int bugId = searchBug(bug);
        if (bugId>0) {
            leaveComment(bug);
            return bug;
        } else {
            //rest query to create Bug
            return bug;
        }
    }

    @Override
    public int searchBug(Bug bug) {
        return 0;
    }

    @Override
    public int leaveComment(Bug bug) {
        return 0;
    }
}
