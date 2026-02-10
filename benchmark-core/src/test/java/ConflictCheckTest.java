import case_01.CheckStrategy;
import case_01.ConflictInfo;
import case_01.Feature;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class ConflictCheckTest {
    @Test
    public void testFeatureConflictCheck() {
        Feature importFeature = new Feature("Feature1", "script1", "String", "JAVA");
        Feature existFeature = new Feature("Feature1", "script2", "Integer", "PYTHON");

        ConflictInfo conflictInfo = new ConflictInfo();

        for(CheckStrategy<Feature, Feature, ConflictInfo> strategy : checkStrategies) {
            if(strategy.checkIsConflict(importFeature, existFeature, conflictInfo)) {
                // have conflict - need user to solve the conflict
                break;
            }
        }

        assert conflictInfo.isConflict();
        assert !conflictInfo.isReplaceable();
    }

    @Autowired
    private List<CheckStrategy<Feature, Feature, ConflictInfo>> checkStrategies;
}
