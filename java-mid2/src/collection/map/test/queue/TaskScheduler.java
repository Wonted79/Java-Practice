package collection.map.test.queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class TaskScheduler {
    //size로 크기를 제한하여 Null Except 방지 OR queue size 이용 및 Null이 아닐때만 다음 queue 참조
    private Queue<Task> taskQueue = new ArrayDeque<>();
    //private int size = 0;

    public void addTask(Task task){
        taskQueue.offer(task);
        //size++;
    }

    public int getRemainingTasks(){
        return taskQueue.size();
    }

    public void processNextTask(){
        Task task = taskQueue.poll();
        if(task!= null){
            taskQueue.poll().execute();
        }
        //size--;
    }
}
