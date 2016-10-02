/**
 * This class is generated by jOOQ
 */
package schema.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;

import schema.tables.BulkEmailCourseemailtemplate;


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
public class BulkEmailCourseemailtemplateRecord extends UpdatableRecordImpl<BulkEmailCourseemailtemplateRecord> implements Record4<Integer, String, String, String> {

    private static final long serialVersionUID = -263894806;

    /**
     * Setter for <code>bitnami_edx.bulk_email_courseemailtemplate.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>bitnami_edx.bulk_email_courseemailtemplate.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>bitnami_edx.bulk_email_courseemailtemplate.html_template</code>.
     */
    public void setHtmlTemplate(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>bitnami_edx.bulk_email_courseemailtemplate.html_template</code>.
     */
    public String getHtmlTemplate() {
        return (String) get(1);
    }

    /**
     * Setter for <code>bitnami_edx.bulk_email_courseemailtemplate.plain_template</code>.
     */
    public void setPlainTemplate(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>bitnami_edx.bulk_email_courseemailtemplate.plain_template</code>.
     */
    public String getPlainTemplate() {
        return (String) get(2);
    }

    /**
     * Setter for <code>bitnami_edx.bulk_email_courseemailtemplate.name</code>.
     */
    public void setName(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>bitnami_edx.bulk_email_courseemailtemplate.name</code>.
     */
    public String getName() {
        return (String) get(3);
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
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, String, String, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, String, String, String> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return BulkEmailCourseemailtemplate.BULK_EMAIL_COURSEEMAILTEMPLATE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return BulkEmailCourseemailtemplate.BULK_EMAIL_COURSEEMAILTEMPLATE.HTML_TEMPLATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return BulkEmailCourseemailtemplate.BULK_EMAIL_COURSEEMAILTEMPLATE.PLAIN_TEMPLATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return BulkEmailCourseemailtemplate.BULK_EMAIL_COURSEEMAILTEMPLATE.NAME;
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
        return getHtmlTemplate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getPlainTemplate();
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
    public BulkEmailCourseemailtemplateRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BulkEmailCourseemailtemplateRecord value2(String value) {
        setHtmlTemplate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BulkEmailCourseemailtemplateRecord value3(String value) {
        setPlainTemplate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BulkEmailCourseemailtemplateRecord value4(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BulkEmailCourseemailtemplateRecord values(Integer value1, String value2, String value3, String value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached BulkEmailCourseemailtemplateRecord
     */
    public BulkEmailCourseemailtemplateRecord() {
        super(BulkEmailCourseemailtemplate.BULK_EMAIL_COURSEEMAILTEMPLATE);
    }

    /**
     * Create a detached, initialised BulkEmailCourseemailtemplateRecord
     */
    public BulkEmailCourseemailtemplateRecord(Integer id, String htmlTemplate, String plainTemplate, String name) {
        super(BulkEmailCourseemailtemplate.BULK_EMAIL_COURSEEMAILTEMPLATE);

        set(0, id);
        set(1, htmlTemplate);
        set(2, plainTemplate);
        set(3, name);
    }
}
