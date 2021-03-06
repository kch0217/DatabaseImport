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
import schema.tables.records.VerifyStudentSoftwaresecurephotoverificationRecord;


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
public class VerifyStudentSoftwaresecurephotoverification extends TableImpl<VerifyStudentSoftwaresecurephotoverificationRecord> {

    private static final long serialVersionUID = -593873680;

    /**
     * The reference instance of <code>bitnami_edx.verify_student_softwaresecurephotoverification</code>
     */
    public static final VerifyStudentSoftwaresecurephotoverification VERIFY_STUDENT_SOFTWARESECUREPHOTOVERIFICATION = new VerifyStudentSoftwaresecurephotoverification();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<VerifyStudentSoftwaresecurephotoverificationRecord> getRecordType() {
        return VerifyStudentSoftwaresecurephotoverificationRecord.class;
    }

    /**
     * The column <code>bitnami_edx.verify_student_softwaresecurephotoverification.id</code>.
     */
    public final TableField<VerifyStudentSoftwaresecurephotoverificationRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.verify_student_softwaresecurephotoverification.status</code>.
     */
    public final TableField<VerifyStudentSoftwaresecurephotoverificationRecord, String> STATUS = createField("status", org.jooq.impl.SQLDataType.VARCHAR.length(100).nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.verify_student_softwaresecurephotoverification.status_changed</code>.
     */
    public final TableField<VerifyStudentSoftwaresecurephotoverificationRecord, Timestamp> STATUS_CHANGED = createField("status_changed", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.verify_student_softwaresecurephotoverification.name</code>.
     */
    public final TableField<VerifyStudentSoftwaresecurephotoverificationRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.verify_student_softwaresecurephotoverification.face_image_url</code>.
     */
    public final TableField<VerifyStudentSoftwaresecurephotoverificationRecord, String> FACE_IMAGE_URL = createField("face_image_url", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.verify_student_softwaresecurephotoverification.photo_id_image_url</code>.
     */
    public final TableField<VerifyStudentSoftwaresecurephotoverificationRecord, String> PHOTO_ID_IMAGE_URL = createField("photo_id_image_url", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.verify_student_softwaresecurephotoverification.receipt_id</code>.
     */
    public final TableField<VerifyStudentSoftwaresecurephotoverificationRecord, String> RECEIPT_ID = createField("receipt_id", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.verify_student_softwaresecurephotoverification.created_at</code>.
     */
    public final TableField<VerifyStudentSoftwaresecurephotoverificationRecord, Timestamp> CREATED_AT = createField("created_at", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.verify_student_softwaresecurephotoverification.updated_at</code>.
     */
    public final TableField<VerifyStudentSoftwaresecurephotoverificationRecord, Timestamp> UPDATED_AT = createField("updated_at", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.verify_student_softwaresecurephotoverification.display</code>.
     */
    public final TableField<VerifyStudentSoftwaresecurephotoverificationRecord, Byte> DISPLAY = createField("display", org.jooq.impl.SQLDataType.TINYINT.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.verify_student_softwaresecurephotoverification.submitted_at</code>.
     */
    public final TableField<VerifyStudentSoftwaresecurephotoverificationRecord, Timestamp> SUBMITTED_AT = createField("submitted_at", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>bitnami_edx.verify_student_softwaresecurephotoverification.reviewing_service</code>.
     */
    public final TableField<VerifyStudentSoftwaresecurephotoverificationRecord, String> REVIEWING_SERVICE = createField("reviewing_service", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.verify_student_softwaresecurephotoverification.error_msg</code>.
     */
    public final TableField<VerifyStudentSoftwaresecurephotoverificationRecord, String> ERROR_MSG = createField("error_msg", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.verify_student_softwaresecurephotoverification.error_code</code>.
     */
    public final TableField<VerifyStudentSoftwaresecurephotoverificationRecord, String> ERROR_CODE = createField("error_code", org.jooq.impl.SQLDataType.VARCHAR.length(50).nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.verify_student_softwaresecurephotoverification.photo_id_key</code>.
     */
    public final TableField<VerifyStudentSoftwaresecurephotoverificationRecord, String> PHOTO_ID_KEY = createField("photo_id_key", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>bitnami_edx.verify_student_softwaresecurephotoverification.copy_id_photo_from_id</code>.
     */
    public final TableField<VerifyStudentSoftwaresecurephotoverificationRecord, Integer> COPY_ID_PHOTO_FROM_ID = createField("copy_id_photo_from_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>bitnami_edx.verify_student_softwaresecurephotoverification.reviewing_user_id</code>.
     */
    public final TableField<VerifyStudentSoftwaresecurephotoverificationRecord, Integer> REVIEWING_USER_ID = createField("reviewing_user_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>bitnami_edx.verify_student_softwaresecurephotoverification.user_id</code>.
     */
    public final TableField<VerifyStudentSoftwaresecurephotoverificationRecord, Integer> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>bitnami_edx.verify_student_softwaresecurephotoverification</code> table reference
     */
    public VerifyStudentSoftwaresecurephotoverification() {
        this("verify_student_softwaresecurephotoverification", null);
    }

    /**
     * Create an aliased <code>bitnami_edx.verify_student_softwaresecurephotoverification</code> table reference
     */
    public VerifyStudentSoftwaresecurephotoverification(String alias) {
        this(alias, VERIFY_STUDENT_SOFTWARESECUREPHOTOVERIFICATION);
    }

    private VerifyStudentSoftwaresecurephotoverification(String alias, Table<VerifyStudentSoftwaresecurephotoverificationRecord> aliased) {
        this(alias, aliased, null);
    }

    private VerifyStudentSoftwaresecurephotoverification(String alias, Table<VerifyStudentSoftwaresecurephotoverificationRecord> aliased, Field<?>[] parameters) {
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
    public Identity<VerifyStudentSoftwaresecurephotoverificationRecord, Integer> getIdentity() {
        return Keys.IDENTITY_VERIFY_STUDENT_SOFTWARESECUREPHOTOVERIFICATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<VerifyStudentSoftwaresecurephotoverificationRecord> getPrimaryKey() {
        return Keys.KEY_VERIFY_STUDENT_SOFTWARESECUREPHOTOVERIFICATION_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<VerifyStudentSoftwaresecurephotoverificationRecord>> getKeys() {
        return Arrays.<UniqueKey<VerifyStudentSoftwaresecurephotoverificationRecord>>asList(Keys.KEY_VERIFY_STUDENT_SOFTWARESECUREPHOTOVERIFICATION_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<VerifyStudentSoftwaresecurephotoverificationRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<VerifyStudentSoftwaresecurephotoverificationRecord, ?>>asList(Keys.D01DCE17B91C9382BD80D4BE23A3E0CF, Keys.VERIFY_STUDEN_REVIEWING_USER_ID_727FAE1D0BCF8AAF_FK_AUTH_USER_ID, Keys.VERIFY_STUDENT_SOFTWARE_USER_ID_61FFAB9C12020106_FK_AUTH_USER_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VerifyStudentSoftwaresecurephotoverification as(String alias) {
        return new VerifyStudentSoftwaresecurephotoverification(alias, this);
    }

    /**
     * Rename this table
     */
    public VerifyStudentSoftwaresecurephotoverification rename(String name) {
        return new VerifyStudentSoftwaresecurephotoverification(name, null);
    }
}
