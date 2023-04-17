package nextstep.favorite.domain;


import nextstep.member.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FavoriteRepository extends JpaRepository<Favorite, Long> {
    List<Favorite> findAllByMember(Member member);
    boolean existsByIdAndMember(Long id, Member member);
}