package com.reddit.clone.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.Instant;
import java.util.List;

import static jakarta.persistence.FetchType.LAZY;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SubReddit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long subRedditId;
    private String name;
    private String description;
    private Instant createdDate;
    @OneToMany(fetch = LAZY)
    private List <Post>post;
    @ManyToOne(fetch = LAZY)
    private User user;
}
