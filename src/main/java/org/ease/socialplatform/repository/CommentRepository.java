package org.ease.socialplatform.repository;

import org.ease.socialplatform.entity.Comment;
import org.ease.socialplatform.entity.Posts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {

    List<Comment> findByPost(Posts post);

}