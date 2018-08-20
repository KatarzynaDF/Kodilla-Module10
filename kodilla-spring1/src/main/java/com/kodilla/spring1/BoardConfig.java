package portfolio9;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;

@Configuration
public class BoardConfig {



        @Bean
        public TaskList createToDoList() {
            return new TaskList();
        }

        @Bean
        public TaskList createProgressList() {
            return new TaskList();
        }

        @Bean
        public TaskList createDoneList() {
            return new TaskList();
        }

    @Bean
    public Board createBoard() {
        return new Board(createToDoList(), createProgressList(), createDoneList());
    }
    }

