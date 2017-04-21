package core;


import example.BugzillaBTPlugin;
import reglament.BugTracker;

public class BugTrackerFactory {

    public static BugTracker getBugTracker(){
        switch ("properties added plugin"){
            case "Bugzilla":return new BugzillaBTPlugin();
            default: return new BugzillaBTPlugin();
        }
    }

}
