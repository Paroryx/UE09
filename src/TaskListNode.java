public class TaskListNode {
    protected Task task;
    private TaskListNode next;

    public TaskListNode(Task curr){
        this.task = curr;
    }
    public void setNext(TaskListNode nextNode){
        this.next = nextNode;
    }
    public TaskListNode getNext(){
        return next;
    }
}
