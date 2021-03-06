/**
 * This class is generated by jOOQ
 */
package schema.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;

import schema.tables.CoursewareStudentmodulehistory;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CoursewareStudentmodulehistoryRecord extends UpdatableRecordImpl<CoursewareStudentmodulehistoryRecord> implements Record7<Integer, String, Timestamp, String, Double, Double, Integer> {

    private static final long serialVersionUID = 1414468530;

    /**
     * Setter for <code>bitnami_edx.courseware_studentmodulehistory.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>bitnami_edx.courseware_studentmodulehistory.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>bitnami_edx.courseware_studentmodulehistory.version</code>.
     */
    public void setVersion(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>bitnami_edx.courseware_studentmodulehistory.version</code>.
     */
    public String getVersion() {
        return (String) get(1);
    }

    /**
     * Setter for <code>bitnami_edx.courseware_studentmodulehistory.created</code>.
     */
    public void setCreated(Timestamp value) {
        set(2, value);
    }

    /**
     * Getter for <code>bitnami_edx.courseware_studentmodulehistory.created</code>.
     */
    public Timestamp getCreated() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>bitnami_edx.courseware_studentmodulehistory.state</code>.
     */
    public void setState(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>bitnami_edx.courseware_studentmodulehistory.state</code>.
     */
    public String getState() {
        return (String) get(3);
    }

    /**
     * Setter for <code>bitnami_edx.courseware_studentmodulehistory.grade</code>.
     */
    public void setGrade(Double value) {
        set(4, value);
    }

    /**
     * Getter for <code>bitnami_edx.courseware_studentmodulehistory.grade</code>.
     */
    public Double getGrade() {
        return (Double) get(4);
    }

    /**
     * Setter for <code>bitnami_edx.courseware_studentmodulehistory.max_grade</code>.
     */
    public void setMaxGrade(Double value) {
        set(5, value);
    }

    /**
     * Getter for <code>bitnami_edx.courseware_studentmodulehistory.max_grade</code>.
     */
    public Double getMaxGrade() {
        return (Double) get(5);
    }

    /**
     * Setter for <code>bitnami_edx.courseware_studentmodulehistory.student_module_id</code>.
     */
    public void setStudentModuleId(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>bitnami_edx.courseware_studentmodulehistory.student_module_id</code>.
     */
    public Integer getStudentModuleId() {
        return (Integer) get(6);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Integer, String, Timestamp, String, Double, Double, Integer> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Integer, String, Timestamp, String, Double, Double, Integer> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return CoursewareStudentmodulehistory.COURSEWARE_STUDENTMODULEHISTORY.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return CoursewareStudentmodulehistory.COURSEWARE_STUDENTMODULEHISTORY.VERSION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field3() {
        return CoursewareStudentmodulehistory.COURSEWARE_STUDENTMODULEHISTORY.CREATED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return CoursewareStudentmodulehistory.COURSEWARE_STUDENTMODULEHISTORY.STATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field5() {
        return CoursewareStudentmodulehistory.COURSEWARE_STUDENTMODULEHISTORY.GRADE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field6() {
        return CoursewareStudentmodulehistory.COURSEWARE_STUDENTMODULEHISTORY.MAX_GRADE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return CoursewareStudentmodulehistory.COURSEWARE_STUDENTMODULEHISTORY.STUDENT_MODULE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getVersion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value3() {
        return getCreated();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getState();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value5() {
        return getGrade();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value6() {
        return getMaxGrade();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getStudentModuleId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CoursewareStudentmodulehistoryRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CoursewareStudentmodulehistoryRecord value2(String value) {
        setVersion(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CoursewareStudentmodulehistoryRecord value3(Timestamp value) {
        setCreated(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CoursewareStudentmodulehistoryRecord value4(String value) {
        setState(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CoursewareStudentmodulehistoryRecord value5(Double value) {
        setGrade(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CoursewareStudentmodulehistoryRecord value6(Double value) {
        setMaxGrade(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CoursewareStudentmodulehistoryRecord value7(Integer value) {
        setStudentModuleId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CoursewareStudentmodulehistoryRecord values(Integer value1, String value2, Timestamp value3, String value4, Double value5, Double value6, Integer value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CoursewareStudentmodulehistoryRecord
     */
    public CoursewareStudentmodulehistoryRecord() {
        super(CoursewareStudentmodulehistory.COURSEWARE_STUDENTMODULEHISTORY);
    }

    /**
     * Create a detached, initialised CoursewareStudentmodulehistoryRecord
     */
    public CoursewareStudentmodulehistoryRecord(Integer id, String version, Timestamp created, String state, Double grade, Double maxGrade, Integer studentModuleId) {
        super(CoursewareStudentmodulehistory.COURSEWARE_STUDENTMODULEHISTORY);

        set(0, id);
        set(1, version);
        set(2, created);
        set(3, state);
        set(4, grade);
        set(5, maxGrade);
        set(6, studentModuleId);
    }
}
