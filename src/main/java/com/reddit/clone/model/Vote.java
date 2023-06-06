package com.reddit.clone.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "vote")
@Data
public class Vote {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private enum voteType{UP,DOWN};
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(referencedColumnName = "user_id", name = "user_id")
    private User user;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(referencedColumnName = "post_id", name = "post_id")
    private Post post;
}
