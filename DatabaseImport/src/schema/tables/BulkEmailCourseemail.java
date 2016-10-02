/**
 * This class is generated by jOOQ
 */
package schema.tables;


import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;

import schema.BitnamiEdx;
import schema.Keys;
import schema.tables.records.BulkEmailCourseemailRecord;


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
public class BulkEmailCourseemail extends TableImpl<BulkEmailCourseemailRecord> {

    private static final long serialVersionUID = -2022634393;

    /**
     * The reference instance of <code>bitnami_edx.bulk_email_courseemail</code>
     */
    public static final BulkEmailCourseemail BULK_EMAIL_COURSEEMAIL = new BulkEmailCourseemail();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<BulkEmailCourseemailRecord> getRecordType() {
        return BulkEmailCourseemailRecord.class;
    }

    /**
     * The column <code>bitnami_edx.bulk_email_courseemail.id</code>.
     */
    public final TableField<BulkEmailCourseemailRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.bulk_email_courseemail.slug</code>.
     */
    public final TableField<BulkEmailCourseemailRecord, String> SLUG = createField("slug", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.bulk_email_courseemail.subject</code>.
     */
    public final TableField<BulkEmailCourseemailRecord, String> SUBJECT = createField("subject", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.bulk_email_courseemail.html_message</code>.
     */
    public final TableField<BulkEmailCourseemailRecord, String> HTML_MESSAGE = createField("html_message", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>bitnami_edx.bulk_email_courseemail.text_message</code>.
     */
    public final TableField<BulkEmailCourseemailRecord, String> TEXT_MESSAGE = createField("text_message", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>bitnami_edx.bulk_email_courseemail.created</code>.
     */
    public final TableField<BulkEmailCourseemailRecord, Timestamp> CREATED = createField("created", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.bulk_email_courseemail.modified</code>.
     */
    public final TableField<BulkEmailCourseemailRecord, Timestamp> MODIFIED = createField("modified", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.bulk_email_courseemail.course_id</code>.
     */
    public final TableField<BulkEmailCourseemailRecord, String> COURSE_ID = createField("course_id", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.bulk_email_courseemail.to_option</code>.
     */
    public final TableField<BulkEmailCourseemailRecord, String> TO_OPTION = createField("to_option", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.bulk_email_courseemail.template_name</code>.
     */
    public final TableField<BulkEmailCourseemailRecord, String> TEMPLATE_NAME = createField("template_name", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>bitnami_edx.bulk_email_courseemail.from_addr</code>.
     */
    public final TableField<BulkEmailCourseemailRecord, String> FROM_ADDR = createField("from_addr", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>bitnami_edx.bulk_email_courseemail.sender_id</code>.
     */
    public final TableField<BulkEmailCourseemailRecord, Integer> SENDER_ID = createField("sender_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>bitnami_edx.bulk_email_courseemail</code> table reference
     */
    public BulkEmailCourseemail() {
        this("bulk_email_courseemail", null);
    }

    /**
     * Create an aliased <code>bitnami_edx.bulk_email_courseemail</code> table reference
     */
    public BulkEmailCourseemail(String alias) {
        this(alias, BULK_EMAIL_COURSEEMAIL);
    }

    private BulkEmailCourseemail(String alias, Table<BulkEmailCourseemailRecord> aliased) {
        this(alias, aliased, null);
    }

    private BulkEmailCourseemail(String alias, Table<BulkEmailCourseemailRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return BitnamiEdx.BITNAMI_EDX;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<BulkEmailCourseemailRecord, Integer> getIdentity() {
        return Keys.IDENTITY_BULK_EMAIL_COURSEEMAIL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<BulkEmailCourseemailRecord> getPrimaryKey() {
        return Keys.KEY_BULK_EMAIL_COURSEEMAIL_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<BulkEmailCourseemailRecord>> getKeys() {
        return Arrays.<UniqueKey<BulkEmailCourseemailRecord>>asList(Keys.KEY_BULK_EMAIL_COURSEEMAIL_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<BulkEmailCourseemailRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<BulkEmailCourseemailRecord, ?>>asList(Keys.BULK_EMAIL_COURSEEMAI_SENDER_ID_37BE3A6322A26640_FK_AUTH_USER_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BulkEmailCourseemail as(String alias) {
        return new BulkEmailCourseemail(alias, this);
    }

    /**
     * Rename this table
     */
    public BulkEmailCourseemail rename(String name) {
        return new BulkEmailCourseemail(name, null);
    }
}
