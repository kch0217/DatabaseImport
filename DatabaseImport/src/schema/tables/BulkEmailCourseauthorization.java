/**
 * This class is generated by jOOQ
 */
package schema.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;

import schema.BitnamiEdx;
import schema.Keys;
import schema.tables.records.BulkEmailCourseauthorizationRecord;


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
public class BulkEmailCourseauthorization extends TableImpl<BulkEmailCourseauthorizationRecord> {

    private static final long serialVersionUID = 1079954600;

    /**
     * The reference instance of <code>bitnami_edx.bulk_email_courseauthorization</code>
     */
    public static final BulkEmailCourseauthorization BULK_EMAIL_COURSEAUTHORIZATION = new BulkEmailCourseauthorization();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<BulkEmailCourseauthorizationRecord> getRecordType() {
        return BulkEmailCourseauthorizationRecord.class;
    }

    /**
     * The column <code>bitnami_edx.bulk_email_courseauthorization.id</code>.
     */
    public final TableField<BulkEmailCourseauthorizationRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.bulk_email_courseauthorization.course_id</code>.
     */
    public final TableField<BulkEmailCourseauthorizationRecord, String> COURSE_ID = createField("course_id", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.bulk_email_courseauthorization.email_enabled</code>.
     */
    public final TableField<BulkEmailCourseauthorizationRecord, Byte> EMAIL_ENABLED = createField("email_enabled", org.jooq.impl.SQLDataType.TINYINT.nullable(false), this, "");

    /**
     * Create a <code>bitnami_edx.bulk_email_courseauthorization</code> table reference
     */
    public BulkEmailCourseauthorization() {
        this("bulk_email_courseauthorization", null);
    }

    /**
     * Create an aliased <code>bitnami_edx.bulk_email_courseauthorization</code> table reference
     */
    public BulkEmailCourseauthorization(String alias) {
        this(alias, BULK_EMAIL_COURSEAUTHORIZATION);
    }

    private BulkEmailCourseauthorization(String alias, Table<BulkEmailCourseauthorizationRecord> aliased) {
        this(alias, aliased, null);
    }

    private BulkEmailCourseauthorization(String alias, Table<BulkEmailCourseauthorizationRecord> aliased, Field<?>[] parameters) {
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
    public Identity<BulkEmailCourseauthorizationRecord, Integer> getIdentity() {
        return Keys.IDENTITY_BULK_EMAIL_COURSEAUTHORIZATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<BulkEmailCourseauthorizationRecord> getPrimaryKey() {
        return Keys.KEY_BULK_EMAIL_COURSEAUTHORIZATION_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<BulkEmailCourseauthorizationRecord>> getKeys() {
        return Arrays.<UniqueKey<BulkEmailCourseauthorizationRecord>>asList(Keys.KEY_BULK_EMAIL_COURSEAUTHORIZATION_PRIMARY, Keys.KEY_BULK_EMAIL_COURSEAUTHORIZATION_COURSE_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BulkEmailCourseauthorization as(String alias) {
        return new BulkEmailCourseauthorization(alias, this);
    }

    /**
     * Rename this table
     */
    public BulkEmailCourseauthorization rename(String name) {
        return new BulkEmailCourseauthorization(name, null);
    }
}