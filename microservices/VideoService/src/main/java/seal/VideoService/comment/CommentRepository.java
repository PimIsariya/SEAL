package seal.VideoService.comment;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long>{

    public List<Comment> findCommentByVideoId(int videoId);
    
}
