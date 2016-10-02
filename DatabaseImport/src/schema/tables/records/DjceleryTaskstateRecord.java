/**
 * This class is generated by jOOQ
 */
package schema.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record15;
import org.jooq.Row15;
import org.jooq.impl.UpdatableRecordImpl;

import schema.tables.DjceleryTaskstate;


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
public class DjceleryTaskstateRecord extends UpdatableRecordImpl<DjceleryTaskstateRecord> implements Record15<Integer, String, String, String, Timestamp, String, String, Timestamp, Timestamp, String, String, Double, Integer, Integer, Byte> {

    private static final long serialVersionUID = 1832371507;

    /**
     * Setter for <code>bitnami_edx.djcelery_taskstate.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>bitnami_edx.djcelery_taskstate.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>bitnami_edx.djcelery_taskstate.state</code>.
     */
    public void setState(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>bitnami_edx.djcelery_taskstate.state</code>.
     */
    public String getState() {
        return (String) get(1);
    }

    /**
     * Setter for <code>bitnami_edx.djcelery_taskstate.task_id</code>.
     */
    public void setTaskId(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>bitnami_edx.djcelery_taskstate.task_id</code>.
     */
    public String getTaskId() {
        return (String) get(2);
    }

    /**
     * Setter for <code>bitnami_edx.djcelery_taskstate.name</code>.
     */
    public void setName(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>bitnami_edx.djcelery_taskstate.name</code>.
     */
    public String getName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>bitnami_edx.djcelery_taskstate.tstamp</code>.
     */
    public void setTstamp(Timestamp value) {
        set(4, value);
    }

    /**
     * Getter for <code>bitnami_edx.djcelery_taskstate.tstamp</code>.
     */
    public Timestamp getTstamp() {
        return (Timestamp) get(4);
    }

    /**
     * Setter for <code>bitnami_edx.djcelery_taskstate.args</code>.
     */
    public void setArgs(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>bitnami_edx.djcelery_taskstate.args</code>.
     */
    public String getArgs() {
        return (String) get(5);
    }

    /**
     * Setter for <code>bitnami_edx.djcelery_taskstate.kwargs</code>.
     */
    public void setKwargs(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>bitnami_edx.djcelery_taskstate.kwargs</code>.
     */
    public String getKwargs() {
        return (String) get(6);
    }

    /**
     * Setter for <code>bitnami_edx.djcelery_taskstate.eta</code>.
     */
    public void setEta(Timestamp value) {
        set(7, value);
    }

    /**
     * Getter for <code>bitnami_edx.djcelery_taskstate.eta</code>.
     */
    public Timestamp getEta() {
        return (Timestamp) get(7);
    }

    /**
     * Setter for <code>bitnami_edx.djcelery_taskstate.expires</code>.
     */
    public void setExpires(Timestamp value) {
        set(8, value);
    }

    /**
     * Getter for <code>bitnami_edx.djcelery_taskstate.expires</code>.
     */
    public Timestamp getExpires() {
        return (Timestamp) get(8);
    }

    /**
     * Setter for <code>bitnami_edx.djcelery_taskstate.result</code>.
     */
    public void setResult(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>bitnami_edx.djcelery_taskstate.result</code>.
     */
    public String getResult() {
        return (String) get(9);
    }

    /**
     * Setter for <code>bitnami_edx.djcelery_taskstate.traceback</code>.
     */
    public void setTraceback(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>bitnami_edx.djcelery_taskstate.traceback</code>.
     */
    public String getTraceback() {
        return (String) get(10);
    }

    /**
     * Setter for <code>bitnami_edx.djcelery_taskstate.runtime</code>.
     */
    public void setRuntime(Double value) {
        set(11, value);
    }

    /**
     * Getter for <code>bitnami_edx.djcelery_taskstate.runtime</code>.
     */
    public Double getRuntime() {
        return (Double) get(11);
    }

    /**
     * Setter for <code>bitnami_edx.djcelery_taskstate.retries</code>.
     */
    public void setRetries(Integer value) {
        set(12, value);
    }

    /**
     * Getter for <code>bitnami_edx.djcelery_taskstate.retries</code>.
     */
    public Integer getRetries() {
        return (Integer) get(12);
    }

    /**
     * Setter for <code>bitnami_edx.djcelery_taskstate.worker_id</code>.
     */
    public void setWorkerId(Integer value) {
        set(13, value);
    }

    /**
     * Getter for <code>bitnami_edx.djcelery_taskstate.worker_id</code>.
     */
    public Integer getWorkerId() {
        return (Integer) get(13);
    }

    /**
     * Setter for <code>bitnami_edx.djcelery_taskstate.hidden</code>.
     */
    public void setHidden(Byte value) {
        set(14, value);
    }

    /**
     * Getter for <code>bitnami_edx.djcelery_taskstate.hidden</code>.
     */
    public Byte getHidden() {
        return (Byte) get(14);
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
    // Record15 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row15<Integer, String, String, String, Timestamp, String, String, Timestamp, Timestamp, String, String, Double, Integer, Integer, Byte> fieldsRow() {
        return (Row15) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row15<Integer, String, String, String, Timestamp, String, String, Timestamp, Timestamp, String, String, Double, Integer, Integer, Byte> valuesRow() {
        return (Row15) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return DjceleryTaskstate.DJCELERY_TASKSTATE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return DjceleryTaskstate.DJCELERY_TASKSTATE.STATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return DjceleryTaskstate.DJCELERY_TASKSTATE.TASK_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return DjceleryTaskstate.DJCELERY_TASKSTATE.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return DjceleryTaskstate.DJCELERY_TASKSTATE.TSTAMP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return DjceleryTaskstate.DJCELERY_TASKSTATE.ARGS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return DjceleryTaskstate.DJCELERY_TASKSTATE.KWARGS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field8() {
        return DjceleryTaskstate.DJCELERY_TASKSTATE.ETA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field9() {
        return DjceleryTaskstate.DJCELERY_TASKSTATE.EXPIRES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return DjceleryTaskstate.DJCELERY_TASKSTATE.RESULT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return DjceleryTaskstate.DJCELERY_TASKSTATE.TRACEBACK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field12() {
        return DjceleryTaskstate.DJCELERY_TASKSTATE.RUNTIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field13() {
        return DjceleryTaskstate.DJCELERY_TASKSTATE.RETRIES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field14() {
        return DjceleryTaskstate.DJCELERY_TASKSTATE.WORKER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field15() {
        return DjceleryTaskstate.DJCELERY_TASKSTATE.HIDDEN;
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
        return getState();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getTaskId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value5() {
        return getTstamp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getArgs();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getKwargs();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value8() {
        return getEta();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value9() {
        return getExpires();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getResult();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getTraceback();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value12() {
        return getRuntime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value13() {
        return getRetries();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value14() {
        return getWorkerId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value15() {
        return getHidden();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DjceleryTaskstateRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DjceleryTaskstateRecord value2(String value) {
        setState(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DjceleryTaskstateRecord value3(String value) {
        setTaskId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DjceleryTaskstateRecord value4(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DjceleryTaskstateRecord value5(Timestamp value) {
        setTstamp(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DjceleryTaskstateRecord value6(String value) {
        setArgs(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DjceleryTaskstateRecord value7(String value) {
        setKwargs(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DjceleryTaskstateRecord value8(Timestamp value) {
        setEta(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DjceleryTaskstateRecord value9(Timestamp value) {
        setExpires(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DjceleryTaskstateRecord value10(String value) {
        setResult(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DjceleryTaskstateRecord value11(String value) {
        setTraceback(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DjceleryTaskstateRecord value12(Double value) {
        setRuntime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DjceleryTaskstateRecord value13(Integer value) {
        setRetries(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DjceleryTaskstateRecord value14(Integer value) {
        setWorkerId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DjceleryTaskstateRecord value15(Byte value) {
        setHidden(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DjceleryTaskstateRecord values(Integer value1, String value2, String value3, String value4, Timestamp value5, String value6, String value7, Timestamp value8, Timestamp value9, String value10, String value11, Double value12, Integer value13, Integer value14, Byte value15) {
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
        value13(value13);
        value14(value14);
        value15(value15);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached DjceleryTaskstateRecord
     */
    public DjceleryTaskstateRecord() {
        super(DjceleryTaskstate.DJCELERY_TASKSTATE);
    }

    /**
     * Create a detached, initialised DjceleryTaskstateRecord
     */
    public DjceleryTaskstateRecord(Integer id, String state, String taskId, String name, Timestamp tstamp, String args, String kwargs, Timestamp eta, Timestamp expires, String result, String traceback, Double runtime, Integer retries, Integer workerId, Byte hidden) {
        super(DjceleryTaskstate.DJCELERY_TASKSTATE);

        set(0, id);
        set(1, state);
        set(2, taskId);
        set(3, name);
        set(4, tstamp);
        set(5, args);
        set(6, kwargs);
        set(7, eta);
        set(8, expires);
        set(9, result);
        set(10, traceback);
        set(11, runtime);
        set(12, retries);
        set(13, workerId);
        set(14, hidden);
    }
}
