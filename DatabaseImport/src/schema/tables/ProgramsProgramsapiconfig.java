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
import org.jooq.types.UInteger;

import schema.BitnamiEdx;
import schema.Keys;
import schema.tables.records.ProgramsProgramsapiconfigRecord;


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
public class ProgramsProgramsapiconfig extends TableImpl<ProgramsProgramsapiconfigRecord> {

    private static final long serialVersionUID = 948016506;

    /**
     * The reference instance of <code>bitnami_edx.programs_programsapiconfig</code>
     */
    public static final ProgramsProgramsapiconfig PROGRAMS_PROGRAMSAPICONFIG = new ProgramsProgramsapiconfig();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ProgramsProgramsapiconfigRecord> getRecordType() {
        return ProgramsProgramsapiconfigRecord.class;
    }

    /**
     * The column <code>bitnami_edx.programs_programsapiconfig.id</code>.
     */
    public final TableField<ProgramsProgramsapiconfigRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.programs_programsapiconfig.change_date</code>.
     */
    public final TableField<ProgramsProgramsapiconfigRecord, Timestamp> CHANGE_DATE = createField("change_date", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.programs_programsapiconfig.enabled</code>.
     */
    public final TableField<ProgramsProgramsapiconfigRecord, Byte> ENABLED = createField("enabled", org.jooq.impl.SQLDataType.TINYINT.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.programs_programsapiconfig.internal_service_url</code>.
     */
    public final TableField<ProgramsProgramsapiconfigRecord, String> INTERNAL_SERVICE_URL = createField("internal_service_url", org.jooq.impl.SQLDataType.VARCHAR.length(200).nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.programs_programsapiconfig.public_service_url</code>.
     */
    public final TableField<ProgramsProgramsapiconfigRecord, String> PUBLIC_SERVICE_URL = createField("public_service_url", org.jooq.impl.SQLDataType.VARCHAR.length(200).nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.programs_programsapiconfig.api_version_number</code>.
     */
    public final TableField<ProgramsProgramsapiconfigRecord, Integer> API_VERSION_NUMBER = createField("api_version_number", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.programs_programsapiconfig.enable_student_dashboard</code>.
     */
    public final TableField<ProgramsProgramsapiconfigRecord, Byte> ENABLE_STUDENT_DASHBOARD = createField("enable_student_dashboard", org.jooq.impl.SQLDataType.TINYINT.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.programs_programsapiconfig.changed_by_id</code>.
     */
    public final TableField<ProgramsProgramsapiconfigRecord, Integer> CHANGED_BY_ID = createField("changed_by_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>bitnami_edx.programs_programsapiconfig.cache_ttl</code>.
     */
    public final TableField<ProgramsProgramsapiconfigRecord, UInteger> CACHE_TTL = createField("cache_ttl", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.programs_programsapiconfig.authoring_app_css_path</code>.
     */
    public final TableField<ProgramsProgramsapiconfigRecord, String> AUTHORING_APP_CSS_PATH = createField("authoring_app_css_path", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.programs_programsapiconfig.authoring_app_js_path</code>.
     */
    public final TableField<ProgramsProgramsapiconfigRecord, String> AUTHORING_APP_JS_PATH = createField("authoring_app_js_path", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.programs_programsapiconfig.enable_studio_tab</code>.
     */
    public final TableField<ProgramsProgramsapiconfigRecord, Byte> ENABLE_STUDIO_TAB = createField("enable_studio_tab", org.jooq.impl.SQLDataType.TINYINT.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.programs_programsapiconfig.enable_certification</code>.
     */
    public final TableField<ProgramsProgramsapiconfigRecord, Byte> ENABLE_CERTIFICATION = createField("enable_certification", org.jooq.impl.SQLDataType.TINYINT.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.programs_programsapiconfig.max_retries</code>.
     */
    public final TableField<ProgramsProgramsapiconfigRecord, UInteger> MAX_RETRIES = createField("max_retries", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.programs_programsapiconfig.xseries_ad_enabled</code>.
     */
    public final TableField<ProgramsProgramsapiconfigRecord, Byte> XSERIES_AD_ENABLED = createField("xseries_ad_enabled", org.jooq.impl.SQLDataType.TINYINT.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.programs_programsapiconfig.program_listing_enabled</code>.
     */
    public final TableField<ProgramsProgramsapiconfigRecord, Byte> PROGRAM_LISTING_ENABLED = createField("program_listing_enabled", org.jooq.impl.SQLDataType.TINYINT.nullable(false), this, "");

    /**
     * Create a <code>bitnami_edx.programs_programsapiconfig</code> table reference
     */
    public ProgramsProgramsapiconfig() {
        this("programs_programsapiconfig", null);
    }

    /**
     * Create an aliased <code>bitnami_edx.programs_programsapiconfig</code> table reference
     */
    public ProgramsProgramsapiconfig(String alias) {
        this(alias, PROGRAMS_PROGRAMSAPICONFIG);
    }

    private ProgramsProgramsapiconfig(String alias, Table<ProgramsProgramsapiconfigRecord> aliased) {
        this(alias, aliased, null);
    }

    private ProgramsProgramsapiconfig(String alias, Table<ProgramsProgramsapiconfigRecord> aliased, Field<?>[] parameters) {
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
    public Identity<ProgramsProgramsapiconfigRecord, Integer> getIdentity() {
        return Keys.IDENTITY_PROGRAMS_PROGRAMSAPICONFIG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ProgramsProgramsapiconfigRecord> getPrimaryKey() {
        return Keys.KEY_PROGRAMS_PROGRAMSAPICONFIG_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ProgramsProgramsapiconfigRecord>> getKeys() {
        return Arrays.<UniqueKey<ProgramsProgramsapiconfigRecord>>asList(Keys.KEY_PROGRAMS_PROGRAMSAPICONFIG_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<ProgramsProgramsapiconfigRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<ProgramsProgramsapiconfigRecord, ?>>asList(Keys.PROGRAMS_PROGRAMSA_CHANGED_BY_ID_B7C3B49D5C0DCD3_FK_AUTH_USER_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProgramsProgramsapiconfig as(String alias) {
        return new ProgramsProgramsapiconfig(alias, this);
    }

    /**
     * Rename this table
     */
    public ProgramsProgramsapiconfig rename(String name) {
        return new ProgramsProgramsapiconfig(name, null);
    }
}
