package case_01.strategy;

import case_01.CheckStrategy;
import case_01.ConflictInfo;
import case_01.Feature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

@Service
@Order(5)
public class FeatureReturnTypeCheckStrategy implements CheckStrategy<Feature, Feature, ConflictInfo> {
    @Override
    public boolean checkIsConflict(Feature importEntity, Feature existEntity, ConflictInfo conflictInfo) {
        if (!importEntity.getReturnType().equals(existEntity.getReturnType())) {
            conflictInfo.setIsConflict(true);
            return true;
        }
        return false;
    }
}
