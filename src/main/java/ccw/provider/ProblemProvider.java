package ccw.provider;

import ccw.dto.ProblemMetadata;
import org.springframework.stereotype.Service;

/**
 * Created by my on 2017. 2. 5..
 */

public interface ProblemProvider {
    ProblemMetadata getProblemMetadataById(String problemId);
}
