/**
 * This class is generated by jOOQ
 */
package schema.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record12;
import org.jooq.Row12;
import org.jooq.impl.UpdatableRecordImpl;

import schema.tables.InstructorTaskInstructortask;


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
public class InstructorTaskInstructortaskRecord extends UpdatableRecordImpl<InstructorTaskInstructortaskRecord> implements Record12<Integer, String, String, String, String, String, String, String, Timestamp, Timestamp, String, Integer> {

    private static final long serialVersionUID = -1807599987;

    /**
     * Setter for <code>bitnami_edx.instructor_task_instructortask.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>bitnami_edx.instructor_task_instructortask.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>bitnami_edx.instructor_task_instructortask.task_type</code>.
     */
    public void setTaskType(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>bitnami_edx.instructor_task_instructortask.task_type</code>.
     */
    public String getTaskType() {
        return (String) get(1);
    }

    /**
     * Setter for <code>bitnami_edx.instructor_task_instructortask.course_id</code>.
     */
    public void setCourseId(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>bitnami_edx.instructor_task_instructortask.course_id</code>.
     */
    public String getCourseId() {
        return (String) get(2);
    }

    /**
     * Setter for <code>bitnami_edx.instructor_task_instructortask.task_key</code>.
     */
    public void setTaskKey(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>bitnami_edx.instructor_task_instructortask.task_key</code>.
     */
    public String getTaskKey() {
        return (String) get(3);
    }

    /**
     * Setter for <code>bitnami_edx.instructor_task_instructortask.task_input</code>.
     */
    public void setTaskInput(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>bitnami_edx.instructor_task_instructortask.task_input</code>.
     */
    public String getTaskInput() {
        return (String) get(4);
    }

    /**
     * Setter for <code>bitnami_edx.instructor_task_instructortask.task_id</code>.
     */
    public void setTaskId(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>bitnami_edx.instructor_task_instructortask.task_id</code>.
     */
    public String getTaskId() {
        return (String) get(5);
    }

    /**
     * Setter for <code>bitnami_edx.instructor_task_instructortask.task_state</code>.
     */
    public void setTaskState(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>bitnami_edx.instructor_task_instructortask.task_state</code>.
     */
    public String getTaskState() {
        return (String) get(6);
    }

    /**
     * Setter for <code>bitnami_edx.instructor_task_instructortask.task_output</code>.
     */
    public void setTaskOutput(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>bitnami_edx.instructor_task_instructortask.task_output</code>.
     */
    public String getTaskOutput() {
        return (String) get(7);
    }

    /**
     * Setter for <code>bitnami_edx.instructor_task_instructortask.created</code>.
     */
    public void setCreated(Timestamp value) {
        set(8, value);
    }

    /**
     * Getter for <code>bitnami_edx.instructor_task_instructortask.created</code>.
     */
    public Timestamp getCreated() {
        return (Timestamp) get(8);
    }

    /**
     * Setter for <code>bitnami_edx.instructor_task_instructortask.updated</code>.
     */
    public void setUpdated(Timestamp value) {
        set(9, value);
    }

    /**
     * Getter for <code>bitnami_edx.instructor_task_instructortask.updated</code>.
     */
    public Timestamp getUpdated() {
        return (Timestamp) get(9);
    }

    /**
     * Setter for <code>bitnami_edx.instructor_task_instructortask.subtasks</code>.
     */
    public void setSubtasks(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>bitnami_edx.instructor_task_instructortask.subtasks</code>.
     */
    public String getSubtasks() {
        return (String) get(10);
    }

    /**
     * Setter for <code>bitnami_edx.instructor_task_instructortask.requester_id</code>.
     */
    public void setRequesterId(Integer value) {
        set(11, value);
    }

    /**
     * Getter for <code>bitnami_edx.instructor_task_instructortask.requester_id</code>.
     */
    public Integer getRequesterId() {
        return (Integer) get(11);
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
    // Record12 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<Integer, String, String, String, String, String, String, String, Timestamp, Timestamp, String, Integer> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<Integer, String, String, String, String, String, String, String, Timestamp, Timestamp, String, Integer> valuesRow() {
        return (Row12) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return InstructorTaskInstructortask.INSTRUCTOR_TASK_INSTRUCTORTASK.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return InstructorTaskInstructortask.INSTRUCTOR_TASK_INSTRUCTORTASK.TASK_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return InstructorTaskInstructortask.INSTRUCTOR_TASK_INSTRUCTORTASK.COURSE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return InstructorTaskInstructortask.INSTRUCTOR_TASK_INSTRUCTORTASK.TASK_KEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return InstructorTaskInstructortask.INSTRUCTOR_TASK_INSTRUCTORTASK.TASK_INPUT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return InstructorTaskInstructortask.INSTRUCTOR_TASK_INSTRUCTORTASK.TASK_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return InstructorTaskInstructortask.INSTRUCTOR_TASK_INSTRUCTORTASK.TASK_STATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return InstructorTaskInstructortask.INSTRUCTOR_TASK_INSTRUCTORTASK.TASK_OUTPUT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field9() {
        return InstructorTaskInstructortask.INSTRUCTOR_TASK_INSTRUCTORTASK.CREATED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field10() {
        return InstructorTaskInstructortask.INSTRUCTOR_TASK_INSTRUCTORTASK.UPDATED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return InstructorTaskInstructortask.INSTRUCTOR_TASK_INSTRUCTORTASK.SUBTASKS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field12() {
        return InstructorTaskInstructortask.INSTRUCTOR_TASK_INSTRUCTORTASK.REQUESTER_ID;
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
        return getTaskType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getCourseId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getTaskKey();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getTaskInput();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getTaskId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getTaskState();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getTaskOutput();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value9() {
        return getCreated();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value10() {
        return getUpdated();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getSubtasks();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value12() {
        return getRequesterId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InstructorTaskInstructortaskRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InstructorTaskInstructortaskRecord value2(String value) {
        setTaskType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InstructorTaskInstructortaskRecord value3(String value) {
        setCourseId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InstructorTaskInstructortaskRecord value4(String value) {
        setTaskKey(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InstructorTaskInstructortaskRecord value5(String value) {
        setTaskInput(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InstructorTaskInstructortaskRecord value6(String value) {
        setTaskId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InstructorTaskInstructortaskRecord value7(String value) {
        setTaskState(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InstructorTaskInstructortaskRecord value8(String value) {
        setTaskOutput(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InstructorTaskInstructortaskRecord value9(Timestamp value) {
        setCreated(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InstructorTaskInstructortaskRecord value10(Timestamp value) {
        setUpdated(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InstructorTaskInstructortaskRecord value11(String value) {
        setSubtasks(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InstructorTaskInstructortaskRecord value12(Integer value) {
        setRequesterId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InstructorTaskInstructortaskRecord values(Integer value1, String value2, String value3, String value4, String value5, String value6, String value7, String value8, Timestamp value9, Timestamp value10, String value11, Integer value12) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached InstructorTaskInstructortaskRecord
     */
    public InstructorTaskInstructortaskRecord() {
        super(InstructorTaskInstructortask.INSTRUCTOR_TASK_INSTRUCTORTASK);
    }

    /**
     * Create a detached, initialised InstructorTaskInstructortaskRecord
     */
    public InstructorTaskInstructortaskRecord(Integer id, String taskType, String courseId, String taskKey, String taskInput, String taskId, String taskState, String taskOutput, Timestamp created, Timestamp updated, String subtasks, Integer requesterId) {
        super(InstructorTaskInstructortask.INSTRUCTOR_TASK_INSTRUCTORTASK);

        set(0, id);
        set(1, taskType);
        set(2, courseId);
        set(3, taskKey);
        set(4, taskInput);
        set(5, taskId);
        set(6, taskState);
        set(7, taskOutput);
        set(8, created);
        set(9, updated);
        set(10, subtasks);
        set(11, requesterId);
    }
}
