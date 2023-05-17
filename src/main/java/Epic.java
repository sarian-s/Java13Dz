public class Epic extends Task{
    protected String[] subtasks;

    public Epic(int id, String[] subtasks){
        super (id);
        this.subtasks = subtasks;
     }
    public String[] getSubtasks() {
        return subtasks;
    }
    @Override
    public boolean matches(String query) {
        for (String n:subtasks) {
            if (n.contains(query)) {
                return true;
            }
        }

        return false;
    }
}
