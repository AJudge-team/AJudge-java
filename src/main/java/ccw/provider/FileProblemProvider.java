package ccw.provider;

import ccw.dto.ProblemMetadata;
import org.springframework.stereotype.Service;

/**
 * Created by my on 2017. 2. 5..
 */

@Service
public class FileProblemProvider implements ProblemProvider {

    @Override
    public ProblemMetadata getProblemMetadataById(String problemId) {

        ProblemMetadata p = new ProblemMetadata();

        return p;
    }
}
