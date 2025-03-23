package com.nob.pick.project.query.vo;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ResponseParticipantVO {
    private int id;               // 팀원 번호
    private boolean isManager;     	  // 방장 여부 (Y/N)

    private int projectRoomId;    // 프로젝트 방 번호 (FK)
    private int memberId;         // 회원 번호 (FK)
}
