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

import schema.tables.DjangoCommentClientRole;


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
public class DjangoCommentClientRoleRecord extends UpdatableRecordImpl<DjangoCommentClientRoleRecord> implements Record3<Integer, String, String> {

    private static final long serialVersionUID = -1137755726;

    /**
     * Setter for <code>bitnami_edx.django_comment_client_role.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>bitnami_edx.django_comment_client_role.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>bitnami_edx.django_comment_client_role.name</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>bitnami_edx.django_comment_client_role.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>bitnami_edx.django_comment_client_role.course_id</code>.
     */
    public void setCourseId(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>bitnami_edx.django_comment_client_role.course_id</code>.
     */
    public String getCourseId() {
        return (String) get(2);
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
    public Row3<Integer, String, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, String, String> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return DjangoCommentClientRole.DJANGO_COMMENT_CLIENT_ROLE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return DjangoCommentClientRole.DJANGO_COMMENT_CLIENT_ROLE.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return DjangoCommentClientRole.DJANGO_COMMENT_CLIENT_ROLE.COURSE_ID;
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
        return getName();
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
    public DjangoCommentClientRoleRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DjangoCommentClientRoleRecord value2(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DjangoCommentClientRoleRecord value3(String value) {
        setCourseId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DjangoCommentClientRoleRecord values(Integer value1, String value2, String value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached DjangoCommentClientRoleRecord
     */
    public DjangoCommentClientRoleRecord() {
        super(DjangoCommentClientRole.DJANGO_COMMENT_CLIENT_ROLE);
    }

    /**
     * Create a detached, initialised DjangoCommentClientRoleRecord
     */
    public DjangoCommentClientRoleRecord(Integer id, String name, String courseId) {
        super(DjangoCommentClientRole.DJANGO_COMMENT_CLIENT_ROLE);

        set(0, id);
        set(1, name);
        set(2, courseId);
    }
}