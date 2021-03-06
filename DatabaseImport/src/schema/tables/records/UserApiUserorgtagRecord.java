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

import schema.tables.UserApiUserorgtag;


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
public class UserApiUserorgtagRecord extends UpdatableRecordImpl<UserApiUserorgtagRecord> implements Record7<Integer, Timestamp, Timestamp, String, String, String, Integer> {

    private static final long serialVersionUID = 12682195;

    /**
     * Setter for <code>bitnami_edx.user_api_userorgtag.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>bitnami_edx.user_api_userorgtag.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>bitnami_edx.user_api_userorgtag.created</code>.
     */
    public void setCreated(Timestamp value) {
        set(1, value);
    }

    /**
     * Getter for <code>bitnami_edx.user_api_userorgtag.created</code>.
     */
    public Timestamp getCreated() {
        return (Timestamp) get(1);
    }

    /**
     * Setter for <code>bitnami_edx.user_api_userorgtag.modified</code>.
     */
    public void setModified(Timestamp value) {
        set(2, value);
    }

    /**
     * Getter for <code>bitnami_edx.user_api_userorgtag.modified</code>.
     */
    public Timestamp getModified() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>bitnami_edx.user_api_userorgtag.key</code>.
     */
    public void setKey(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>bitnami_edx.user_api_userorgtag.key</code>.
     */
    public String getKey() {
        return (String) get(3);
    }

    /**
     * Setter for <code>bitnami_edx.user_api_userorgtag.org</code>.
     */
    public void setOrg(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>bitnami_edx.user_api_userorgtag.org</code>.
     */
    public String getOrg() {
        return (String) get(4);
    }

    /**
     * Setter for <code>bitnami_edx.user_api_userorgtag.value</code>.
     */
    public void setValue(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>bitnami_edx.user_api_userorgtag.value</code>.
     */
    public String getValue() {
        return (String) get(5);
    }

    /**
     * Setter for <code>bitnami_edx.user_api_userorgtag.user_id</code>.
     */
    public void setUserId(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>bitnami_edx.user_api_userorgtag.user_id</code>.
     */
    public Integer getUserId() {
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
    public Row7<Integer, Timestamp, Timestamp, String, String, String, Integer> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Integer, Timestamp, Timestamp, String, String, String, Integer> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return UserApiUserorgtag.USER_API_USERORGTAG.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field2() {
        return UserApiUserorgtag.USER_API_USERORGTAG.CREATED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field3() {
        return UserApiUserorgtag.USER_API_USERORGTAG.MODIFIED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return UserApiUserorgtag.USER_API_USERORGTAG.KEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return UserApiUserorgtag.USER_API_USERORGTAG.ORG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return UserApiUserorgtag.USER_API_USERORGTAG.VALUE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return UserApiUserorgtag.USER_API_USERORGTAG.USER_ID;
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
        return getKey();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getOrg();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserApiUserorgtagRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserApiUserorgtagRecord value2(Timestamp value) {
        setCreated(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserApiUserorgtagRecord value3(Timestamp value) {
        setModified(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserApiUserorgtagRecord value4(String value) {
        setKey(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserApiUserorgtagRecord value5(String value) {
        setOrg(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserApiUserorgtagRecord value6(String value) {
        setValue(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserApiUserorgtagRecord value7(Integer value) {
        setUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserApiUserorgtagRecord values(Integer value1, Timestamp value2, Timestamp value3, String value4, String value5, String value6, Integer value7) {
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
     * Create a detached UserApiUserorgtagRecord
     */
    public UserApiUserorgtagRecord() {
        super(UserApiUserorgtag.USER_API_USERORGTAG);
    }

    /**
     * Create a detached, initialised UserApiUserorgtagRecord
     */
    public UserApiUserorgtagRecord(Integer id, Timestamp created, Timestamp modified, String key, String org, String value, Integer userId) {
        super(UserApiUserorgtag.USER_API_USERORGTAG);

        set(0, id);
        set(1, created);
        set(2, modified);
        set(3, key);
        set(4, org);
        set(5, value);
        set(6, userId);
    }
}
