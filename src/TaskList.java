public class TaskList {
    private TaskListNode head;
    private int size;

    public int getSize(){
        return size;
    }

    public void addSorted(Task task){
        TaskListNode n = new TaskListNode(task);
        TaskListNode prev = null;
        TaskListNode curr = head;

        while(curr != null && curr.task.duration > task.duration){
            prev = curr;
            curr = curr.getNext();
        }
        if(prev == null){
            n.setNext(curr);
            head = n;
        }else{
            prev.setNext(n);
            n.setNext(curr);
        }
        size++;
    }
    public int clear(){
        int temp = size;
        head = null;
        size = 0;
        return temp;
    }
    public Task[] asArray(){
        Task[] array = new Task[size];
        TaskListNode curr = head;
        for (int i = 0; i < array.length; i++) {
            array[i] = curr.task;
            curr = curr.getNext();
        }
        return array;
    }
    public TaskList getTaskListWithin(int minDuration, int maxDuration){
        TaskList list = new TaskList();
        TaskListNode curr = head;
        while(curr != null && curr.task.duration >= maxDuration){
            curr = curr.getNext();
        }
        while(curr !=null && curr.task.duration > minDuration){
            list.addSorted(curr.task);
            curr = curr.getNext();
        }
        return list;
    }
    public Task getShortestTask(){
        if(head == null){
            return null;
        }
        Task shortest = head.task;
        TaskListNode curr = head;
        while(curr != null){
            if(shortest.duration > curr.task.duration){
                shortest = curr.task;
            }
            curr = curr.getNext();
        }
        return shortest;
    }
    public Task getLongestTask(){
        if(head == null){
            return null;
        }
        Task longest = head.task;
        TaskListNode curr = head;
        while(curr != null){
            if(longest.duration < curr.task.duration){
                longest = curr.task;
            }
            curr = curr.getNext();
        }
        return longest;
    }
    public int remove(int duration){
        if(head == null){
            return 0;
        }
        int temp = size;
        TaskListNode prev = null;
        TaskListNode curr = head;
        while(curr != null && curr.task.duration >= duration){
            if(curr.task.duration == duration){
                if(curr == head){
                    head = head.getNext();
                    curr = curr.getNext();
                    size--;
                }else{
                    prev.setNext(curr.getNext());
                    curr = curr.getNext();
                    size--;
                }
            }else{
                prev = curr;
                curr = curr.getNext();
            }
        }
        return temp-size; // temp-size is 0 if nothing deleted
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        TaskListNode curr = head;
        while(curr != null){
            sb.append(curr.task.toString());
            curr = curr.getNext();
            if(curr !=null){
                sb.append("\n ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public static TaskList from(Task... tasks){
        TaskList tl = new TaskList();
        for (Task task : tasks) {
            tl.addSorted(task);
        }
        return tl;
    }
}
