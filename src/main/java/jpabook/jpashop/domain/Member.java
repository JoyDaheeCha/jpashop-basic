package jpabook.jpashop.domain;

import javax.persistence.*;

@Entity
public class Member {

    @Id @GeneratedValue
    @Column(name="MEMBER_ID")
    private Long Id;

    @Column(name="USERNAME")
    private String username;

    @Column(name="TEAM_ID")
    private Long teamId;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Long getTeamId() {
        return teamId;
    }

    public void setTeamId(Long teamId) {
        this.teamId = teamId;
    }
}
