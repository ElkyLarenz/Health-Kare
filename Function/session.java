package Function;

import Users.Child;

public class session {
    Staff currentStaff;
    Child currentChild;

    public session(String fn, String ln, int id)
    {
        currentStaff = new Staff(fn, ln, id);
    }

    public void pickChild(int id, String fn, String ln, int age)
    {
        currentChild = new Child(id, fn, ln, age);
    }
}
