package case_01.strategy;

import case_01.CheckStrategy;
import case_01.ConflictInfo;
import case_01.Feature;

public class FeatureScriptTypeCheckStrategy implements CheckStrategy<Feature, Feature, ConflictInfo> {
    @Override
    public boolean checkIsConflict(Feature importEntity, Feature existEntity, ConflictInfo conflictInfo) {
        if (!importEntity.getScriptType().equals(existEntity.getScriptType())) {
            conflictInfo.setIsConflict(true);
            return true;
        }
        return false;
    }
}
