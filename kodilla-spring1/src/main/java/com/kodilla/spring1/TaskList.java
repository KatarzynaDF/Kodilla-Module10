package portfolio9;

import org.springframework.stereotype.Service;

import java.net.PortUnreachableException;
import java.util.ArrayList;
import java.util.List;

@Service
public class TaskList {

    private List<String> tasks = new ArrayList<>();


    public TaskList() {
       tasks = new ArrayList<>();
    }

    public List<String> getTasks() {
        return tasks;
    }

    @Override
    public String toString() {
        return "TaskList{" +
                "tasks=" + tasks +
                '}';
    }
}
