package ccw.dto;

import lombok.Data;

import java.util.List;

/**
 * Created by my on 2017. 2. 5..
 */

@Data
public class ProblemMetadata {
    private String problemId;

    private List<String> inputs;
    private List<String> outpus;

    private int timeLimit;
    private int memoryLimit;
}
