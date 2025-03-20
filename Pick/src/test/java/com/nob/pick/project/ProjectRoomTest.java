package com.nob.pick.project;

import com.nob.pick.project.query.dto.ProjectRoomDTO;
import com.nob.pick.project.query.service.ProjectRoomService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class ProjectRoomTest {
    @Autowired
    private ProjectRoomService projectRoomService;

    @Test
    @DisplayName("Select Finished Projects")
    public void selectFinishedProjects() {
        List<ProjectRoomDTO> finishedProjects = projectRoomService.getFinishedProjects();
        if(finishedProjects.size() > 0) {
            finishedProjects.forEach(System.out::println);
        }else{
            System.out.println("테스트 결과: No Finished Projects");
        }
    }
}
