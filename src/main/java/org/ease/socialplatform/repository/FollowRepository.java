package org.ease.socialplatform.repository;

import org.ease.socialplatform.entity.Follow;
import org.ease.socialplatform.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface FollowRepository extends JpaRepository<Follow, Long> {

    Optional<Follow> findByFollowerAndFollowing(User follower, User following);

    List<Follow> findByFollowing(User following);

    List<Follow> findByFollower(User follower);

    boolean existsByFollowerAndFollowing(User follower, User following);

}