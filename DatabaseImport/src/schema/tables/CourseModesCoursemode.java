/**
 * This class is generated by jOOQ
 */
package schema.tables;


import java.sql.Date;
import java.sql.Timestamp;
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
import schema.tables.records.CourseModesCoursemodeRecord;


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
public class CourseModesCoursemode extends TableImpl<CourseModesCoursemodeRecord> {

    private static final long serialVersionUID = -1719167675;

    /**
     * The reference instance of <code>bitnami_edx.course_modes_coursemode</code>
     */
    public static final CourseModesCoursemode COURSE_MODES_COURSEMODE = new CourseModesCoursemode();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CourseModesCoursemodeRecord> getRecordType() {
        return CourseModesCoursemodeRecord.class;
    }

    /**
     * The column <code>bitnami_edx.course_modes_coursemode.id</code>.
     */
    public final TableField<CourseModesCoursemodeRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.course_modes_coursemode.course_id</code>.
     */
    public final TableField<CourseModesCoursemodeRecord, String> COURSE_ID = createField("course_id", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.course_modes_coursemode.mode_slug</code>.
     */
    public final TableField<CourseModesCoursemodeRecord, String> MODE_SLUG = createField("mode_slug", org.jooq.impl.SQLDataType.VARCHAR.length(100).nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.course_modes_coursemode.mode_display_name</code>.
     */
    public final TableField<CourseModesCoursemodeRecord, String> MODE_DISPLAY_NAME = createField("mode_display_name", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.course_modes_coursemode.min_price</code>.
     */
    public final TableField<CourseModesCoursemodeRecord, Integer> MIN_PRICE = createField("min_price", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.course_modes_coursemode.currency</code>.
     */
    public final TableField<CourseModesCoursemodeRecord, String> CURRENCY = createField("currency", org.jooq.impl.SQLDataType.VARCHAR.length(8).nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.course_modes_coursemode.expiration_datetime</code>.
     */
    public final TableField<CourseModesCoursemodeRecord, Timestamp> EXPIRATION_DATETIME = createField("expiration_datetime", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>bitnami_edx.course_modes_coursemode.expiration_date</code>.
     */
    public final TableField<CourseModesCoursemodeRecord, Date> EXPIRATION_DATE = createField("expiration_date", org.jooq.impl.SQLDataType.DATE, this, "");

    /**
     * The column <code>bitnami_edx.course_modes_coursemode.suggested_prices</code>.
     */
    public final TableField<CourseModesCoursemodeRecord, String> SUGGESTED_PRICES = createField("suggested_prices", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.course_modes_coursemode.description</code>.
     */
    public final TableField<CourseModesCoursemodeRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>bitnami_edx.course_modes_coursemode.sku</code>.
     */
    public final TableField<CourseModesCoursemodeRecord, String> SKU = createField("sku", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>bitnami_edx.course_modes_coursemode.expiration_datetime_is_explicit</code>.
     */
    public final TableField<CourseModesCoursemodeRecord, Byte> EXPIRATION_DATETIME_IS_EXPLICIT = createField("expiration_datetime_is_explicit", org.jooq.impl.SQLDataType.TINYINT.nullable(false), this, "");

    /**
     * Create a <code>bitnami_edx.course_modes_coursemode</code> table reference
     */
    public CourseModesCoursemode() {
        this("course_modes_coursemode", null);
    }

    /**
     * Create an aliased <code>bitnami_edx.course_modes_coursemode</code> table reference
     */
    public CourseModesCoursemode(String alias) {
        this(alias, COURSE_MODES_COURSEMODE);
    }

    private CourseModesCoursemode(String alias, Table<CourseModesCoursemodeRecord> aliased) {
        this(alias, aliased, null);
    }

    private CourseModesCoursemode(String alias, Table<CourseModesCoursemodeRecord> aliased, Field<?>[] parameters) {
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
    public Identity<CourseModesCoursemodeRecord, Integer> getIdentity() {
        return Keys.IDENTITY_COURSE_MODES_COURSEMODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<CourseModesCoursemodeRecord> getPrimaryKey() {
        return Keys.KEY_COURSE_MODES_COURSEMODE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CourseModesCoursemodeRecord>> getKeys() {
        return Arrays.<UniqueKey<CourseModesCoursemodeRecord>>asList(Keys.KEY_COURSE_MODES_COURSEMODE_PRIMARY, Keys.KEY_COURSE_MODES_COURSEMODE_COURSE_MODES_COURSEMODE_COURSE_ID_6FBB1796ACE558B4_UNIQ);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CourseModesCoursemode as(String alias) {
        return new CourseModesCoursemode(alias, this);
    }

    /**
     * Rename this table
     */
    public CourseModesCoursemode rename(String name) {
        return new CourseModesCoursemode(name, null);
    }
}
