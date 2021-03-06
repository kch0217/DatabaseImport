/**
 * This class is generated by jOOQ
 */
package schema.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.UpdatableRecordImpl;

import schema.tables.CreditCreditrequest;


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
public class CreditCreditrequestRecord extends UpdatableRecordImpl<CreditCreditrequestRecord> implements Record9<Integer, Timestamp, Timestamp, String, String, String, String, Integer, Integer> {

    private static final long serialVersionUID = -1812982291;

    /**
     * Setter for <code>bitnami_edx.credit_creditrequest.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>bitnami_edx.credit_creditrequest.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>bitnami_edx.credit_creditrequest.created</code>.
     */
    public void setCreated(Timestamp value) {
        set(1, value);
    }

    /**
     * Getter for <code>bitnami_edx.credit_creditrequest.created</code>.
     */
    public Timestamp getCreated() {
        return (Timestamp) get(1);
    }

    /**
     * Setter for <code>bitnami_edx.credit_creditrequest.modified</code>.
     */
    public void setModified(Timestamp value) {
        set(2, value);
    }

    /**
     * Getter for <code>bitnami_edx.credit_creditrequest.modified</code>.
     */
    public Timestamp getModified() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>bitnami_edx.credit_creditrequest.uuid</code>.
     */
    public void setUuid(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>bitnami_edx.credit_creditrequest.uuid</code>.
     */
    public String getUuid() {
        return (String) get(3);
    }

    /**
     * Setter for <code>bitnami_edx.credit_creditrequest.username</code>.
     */
    public void setUsername(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>bitnami_edx.credit_creditrequest.username</code>.
     */
    public String getUsername() {
        return (String) get(4);
    }

    /**
     * Setter for <code>bitnami_edx.credit_creditrequest.parameters</code>.
     */
    public void setParameters(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>bitnami_edx.credit_creditrequest.parameters</code>.
     */
    public String getParameters() {
        return (String) get(5);
    }

    /**
     * Setter for <code>bitnami_edx.credit_creditrequest.status</code>.
     */
    public void setStatus(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>bitnami_edx.credit_creditrequest.status</code>.
     */
    public String getStatus() {
        return (String) get(6);
    }

    /**
     * Setter for <code>bitnami_edx.credit_creditrequest.course_id</code>.
     */
    public void setCourseId(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>bitnami_edx.credit_creditrequest.course_id</code>.
     */
    public Integer getCourseId() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>bitnami_edx.credit_creditrequest.provider_id</code>.
     */
    public void setProviderId(Integer value) {
        set(8, value);
    }

    /**
     * Getter for <code>bitnami_edx.credit_creditrequest.provider_id</code>.
     */
    public Integer getProviderId() {
        return (Integer) get(8);
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
    // Record9 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<Integer, Timestamp, Timestamp, String, String, String, String, Integer, Integer> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<Integer, Timestamp, Timestamp, String, String, String, String, Integer, Integer> valuesRow() {
        return (Row9) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return CreditCreditrequest.CREDIT_CREDITREQUEST.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field2() {
        return CreditCreditrequest.CREDIT_CREDITREQUEST.CREATED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field3() {
        return CreditCreditrequest.CREDIT_CREDITREQUEST.MODIFIED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return CreditCreditrequest.CREDIT_CREDITREQUEST.UUID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return CreditCreditrequest.CREDIT_CREDITREQUEST.USERNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return CreditCreditrequest.CREDIT_CREDITREQUEST.PARAMETERS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return CreditCreditrequest.CREDIT_CREDITREQUEST.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field8() {
        return CreditCreditrequest.CREDIT_CREDITREQUEST.COURSE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field9() {
        return CreditCreditrequest.CREDIT_CREDITREQUEST.PROVIDER_ID;
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
    public Timestamp value2() {
        return getCreated();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value3() {
        return getModified();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getUuid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getUsername();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getParameters();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value8() {
        return getCourseId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value9() {
        return getProviderId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CreditCreditrequestRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CreditCreditrequestRecord value2(Timestamp value) {
        setCreated(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CreditCreditrequestRecord value3(Timestamp value) {
        setModified(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CreditCreditrequestRecord value4(String value) {
        setUuid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CreditCreditrequestRecord value5(String value) {
        setUsername(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CreditCreditrequestRecord value6(String value) {
        setParameters(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CreditCreditrequestRecord value7(String value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CreditCreditrequestRecord value8(Integer value) {
        setCourseId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CreditCreditrequestRecord value9(Integer value) {
        setProviderId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CreditCreditrequestRecord values(Integer value1, Timestamp value2, Timestamp value3, String value4, String value5, String value6, String value7, Integer value8, Integer value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CreditCreditrequestRecord
     */
    public CreditCreditrequestRecord() {
        super(CreditCreditrequest.CREDIT_CREDITREQUEST);
    }

    /**
     * Create a detached, initialised CreditCreditrequestRecord
     */
    public CreditCreditrequestRecord(Integer id, Timestamp created, Timestamp modified, String uuid, String username, String parameters, String status, Integer courseId, Integer providerId) {
        super(CreditCreditrequest.CREDIT_CREDITREQUEST);

        set(0, id);
        set(1, created);
        set(2, modified);
        set(3, uuid);
        set(4, username);
        set(5, parameters);
        set(6, status);
        set(7, courseId);
        set(8, providerId);
    }
}
