/**
 * This class is generated by jOOQ
 */
package schema.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;

import schema.tables.StudentUsersignupsource;


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
public class StudentUsersignupsourceRecord extends UpdatableRecordImpl<StudentUsersignupsourceRecord> implements Record3<Integer, String, Integer> {

    private static final long serialVersionUID = 1675274129;

    /**
     * Setter for <code>bitnami_edx.student_usersignupsource.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>bitnami_edx.student_usersignupsource.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>bitnami_edx.student_usersignupsource.site</code>.
     */
    public void setSite(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>bitnami_edx.student_usersignupsource.site</code>.
     */
    public String getSite() {
        return (String) get(1);
    }

    /**
     * Setter for <code>bitnami_edx.student_usersignupsource.user_id</code>.
     */
    public void setUserId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>bitnami_edx.student_usersignupsource.user_id</code>.
     */
    public Integer getUserId() {
        return (Integer) get(2);
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
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, String, Integer> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, String, Integer> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return StudentUsersignupsource.STUDENT_USERSIGNUPSOURCE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return StudentUsersignupsource.STUDENT_USERSIGNUPSOURCE.SITE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return StudentUsersignupsource.STUDENT_USERSIGNUPSOURCE.USER_ID;
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
        return getSite();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StudentUsersignupsourceRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StudentUsersignupsourceRecord value2(String value) {
        setSite(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StudentUsersignupsourceRecord value3(Integer value) {
        setUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StudentUsersignupsourceRecord values(Integer value1, String value2, Integer value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached StudentUsersignupsourceRecord
     */
    public StudentUsersignupsourceRecord() {
        super(StudentUsersignupsource.STUDENT_USERSIGNUPSOURCE);
    }

    /**
     * Create a detached, initialised StudentUsersignupsourceRecord
     */
    public StudentUsersignupsourceRecord(Integer id, String site, Integer userId) {
        super(StudentUsersignupsource.STUDENT_USERSIGNUPSOURCE);

        set(0, id);
        set(1, site);
        set(2, userId);
    }
}