package frogger;

import java.util.ArrayList;
import java.util.List;

/**
 * Refactor Task 2.
 *
 * @author Zishen Wen (F22), Deyuan Chen (S22)
 */
public class Records {
    private final List<FroggerID> records;

    public Records() {
        this.records = new ArrayList<>();
    }

    /**
     * Adds a frogger's record.
     *
     * @param froggerID the FroggerID instance containing frogger's details
     * @return false if the record already exists, else true.
     */
    public boolean addRecord(FroggerID froggerID) {
        if (this.records.contains(froggerID)) {
            return false;
        }
        this.records.add(froggerID);
        return true;
    }
}
