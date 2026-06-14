package org.ease.socialplatform.repository;

import org.ease.socialplatform.entity.Posts;
import org.ease.socialplatform.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.awt.print.Pageable;

@Repository
public interface PostRepository extends JpaRepository<Posts, Long> {

    Page<Posts> findByUser(User user, Pageable pageable);

    Page<Posts> findByTitleContainingIgnoreCase(String title, Pageable pageable);

}
