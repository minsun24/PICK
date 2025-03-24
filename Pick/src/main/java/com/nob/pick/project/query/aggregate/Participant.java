package com.nob.pick.project.query.aggregate;

import lombok.Getter;
import lombok.ToString;

import java.util.List;

@Getter
@ToString
public class Participant {
    private int id;                                 // 팀원 번호
    private boolean isManager;                      // 방장 여부 (Y/N)
    private int projectRoomId;                      // 프로젝트 방 번호 (FK)

    private  int memberId;                          // 회원 번호 (FK)
}
