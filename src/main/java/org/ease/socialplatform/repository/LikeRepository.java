package org.ease.socialplatform.repository;

import org.ease.socialplatform.entity.Like;
import org.ease.socialplatform.entity.Posts;
import org.ease.socialplatform.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LikeRepository extends JpaRepository<Like, Long> {

    boolean existsByUserAndPost(User user, Posts post);

    long countByPost(Posts post);

}
