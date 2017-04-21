package reglament;


public abstract class BugTracker implements BugTrackerInterface{

    public abstract int searchBug(Bug bug);
    public abstract int leaveComment(Bug bug);

}
