/**
 * This class is generated by jOOQ
 */
package schema.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;

import schema.tables.UserApiUsercoursetag;


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
public class UserApiUsercoursetagRecord extends UpdatableRecordImpl<UserApiUsercoursetagRecord> implements Record5<Integer, String, String, String, Integer> {

    private static final long serialVersionUID = 1883464247;

    /**
     * Setter for <code>bitnami_edx.user_api_usercoursetag.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>bitnami_edx.user_api_usercoursetag.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>bitnami_edx.user_api_usercoursetag.key</code>.
     */
    public void setKey(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>bitnami_edx.user_api_usercoursetag.key</code>.
     */
    public String getKey() {
        return (String) get(1);
    }

    /**
     * Setter for <code>bitnami_edx.user_api_usercoursetag.course_id</code>.
     */
    public void setCourseId(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>bitnami_edx.user_api_usercoursetag.course_id</code>.
     */
    public String getCourseId() {
        return (String) get(2);
    }

    /**
     * Setter for <code>bitnami_edx.user_api_usercoursetag.value</code>.
     */
    public void setValue(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>bitnami_edx.user_api_usercoursetag.value</code>.
     */
    public String getValue() {
        return (String) get(3);
    }

    /**
     * Setter for <code>bitnami_edx.user_api_usercoursetag.user_id</code>.
     */
    public void setUserId(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>bitnami_edx.user_api_usercoursetag.user_id</code>.
     */
    public Integer getUserId() {
        return (Integer) get(4);
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
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, String, String, String, Integer> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, String, String, String, Integer> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return UserApiUsercoursetag.USER_API_USERCOURSETAG.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return UserApiUsercoursetag.USER_API_USERCOURSETAG.KEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return UserApiUsercoursetag.USER_API_USERCOURSETAG.COURSE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return UserApiUsercoursetag.USER_API_USERCOURSETAG.VALUE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return UserApiUsercoursetag.USER_API_USERCOURSETAG.USER_ID;
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
        return getKey();
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
        return getValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserApiUsercoursetagRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserApiUsercoursetagRecord value2(String value) {
        setKey(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserApiUsercoursetagRecord value3(String value) {
        setCourseId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserApiUsercoursetagRecord value4(String value) {
        setValue(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserApiUsercoursetagRecord value5(Integer value) {
        setUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserApiUsercoursetagRecord values(Integer value1, String value2, String value3, String value4, Integer value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached UserApiUsercoursetagRecord
     */
    public UserApiUsercoursetagRecord() {
        super(UserApiUsercoursetag.USER_API_USERCOURSETAG);
    }

    /**
     * Create a detached, initialised UserApiUsercoursetagRecord
     */
    public UserApiUsercoursetagRecord(Integer id, String key, String courseId, String value, Integer userId) {
        super(UserApiUsercoursetag.USER_API_USERCOURSETAG);

        set(0, id);
        set(1, key);
        set(2, courseId);
        set(3, value);
        set(4, userId);
    }
}