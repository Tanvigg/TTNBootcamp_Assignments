package java2;

public class q9_metalTable extends q9_table {
    @Override
    public void stressTest() {

        System.out.println("Passed Stress Test");
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void fireTest() {
        //To change body of implemented methods use File | Settings | File Templates.
        System.out.println("Passed Fire Test");
    }

    @Override
    public String tableType() {
        //To change body of implemented methods use File | Settings | File Templates.
        String s = "This is a metal Table";
        return s;
    }
}
