package core;

import example.BugzillaBug;
import reglament.Bug;

//нет, это не характеристика кода
public class BugFactory {

    public static Bug getBug(int step, int test, String screenshot){
        switch ("properties added plugin"){
            case "Bugzilla":return new BugzillaBug(step, test, screenshot);
            default: return new BugzillaBug(step, test, screenshot);
        }
    }
}
