/**
 * This class is generated by jOOQ
 */
package schema.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.UpdatableRecordImpl;

import schema.tables.ThirdPartyAuthSamlconfiguration;


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
public class ThirdPartyAuthSamlconfigurationRecord extends UpdatableRecordImpl<ThirdPartyAuthSamlconfigurationRecord> implements Record9<Integer, Timestamp, Byte, String, String, String, String, String, Integer> {

    private static final long serialVersionUID = 1200491404;

    /**
     * Setter for <code>bitnami_edx.third_party_auth_samlconfiguration.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>bitnami_edx.third_party_auth_samlconfiguration.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>bitnami_edx.third_party_auth_samlconfiguration.change_date</code>.
     */
    public void setChangeDate(Timestamp value) {
        set(1, value);
    }

    /**
     * Getter for <code>bitnami_edx.third_party_auth_samlconfiguration.change_date</code>.
     */
    public Timestamp getChangeDate() {
        return (Timestamp) get(1);
    }

    /**
     * Setter for <code>bitnami_edx.third_party_auth_samlconfiguration.enabled</code>.
     */
    public void setEnabled(Byte value) {
        set(2, value);
    }

    /**
     * Getter for <code>bitnami_edx.third_party_auth_samlconfiguration.enabled</code>.
     */
    public Byte getEnabled() {
        return (Byte) get(2);
    }

    /**
     * Setter for <code>bitnami_edx.third_party_auth_samlconfiguration.private_key</code>.
     */
    public void setPrivateKey(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>bitnami_edx.third_party_auth_samlconfiguration.private_key</code>.
     */
    public String getPrivateKey() {
        return (String) get(3);
    }

    /**
     * Setter for <code>bitnami_edx.third_party_auth_samlconfiguration.public_key</code>.
     */
    public void setPublicKey(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>bitnami_edx.third_party_auth_samlconfiguration.public_key</code>.
     */
    public String getPublicKey() {
        return (String) get(4);
    }

    /**
     * Setter for <code>bitnami_edx.third_party_auth_samlconfiguration.entity_id</code>.
     */
    public void setEntityId(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>bitnami_edx.third_party_auth_samlconfiguration.entity_id</code>.
     */
    public String getEntityId() {
        return (String) get(5);
    }

    /**
     * Setter for <code>bitnami_edx.third_party_auth_samlconfiguration.org_info_str</code>.
     */
    public void setOrgInfoStr(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>bitnami_edx.third_party_auth_samlconfiguration.org_info_str</code>.
     */
    public String getOrgInfoStr() {
        return (String) get(6);
    }

    /**
     * Setter for <code>bitnami_edx.third_party_auth_samlconfiguration.other_config_str</code>.
     */
    public void setOtherConfigStr(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>bitnami_edx.third_party_auth_samlconfiguration.other_config_str</code>.
     */
    public String getOtherConfigStr() {
        return (String) get(7);
    }

    /**
     * Setter for <code>bitnami_edx.third_party_auth_samlconfiguration.changed_by_id</code>.
     */
    public void setChangedById(Integer value) {
        set(8, value);
    }

    /**
     * Getter for <code>bitnami_edx.third_party_auth_samlconfiguration.changed_by_id</code>.
     */
    public Integer getChangedById() {
        return (Integer) get(8);
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
    // Record9 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<Integer, Timestamp, Byte, String, String, String, String, String, Integer> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<Integer, Timestamp, Byte, String, String, String, String, String, Integer> valuesRow() {
        return (Row9) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return ThirdPartyAuthSamlconfiguration.THIRD_PARTY_AUTH_SAMLCONFIGURATION.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field2() {
        return ThirdPartyAuthSamlconfiguration.THIRD_PARTY_AUTH_SAMLCONFIGURATION.CHANGE_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field3() {
        return ThirdPartyAuthSamlconfiguration.THIRD_PARTY_AUTH_SAMLCONFIGURATION.ENABLED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return ThirdPartyAuthSamlconfiguration.THIRD_PARTY_AUTH_SAMLCONFIGURATION.PRIVATE_KEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return ThirdPartyAuthSamlconfiguration.THIRD_PARTY_AUTH_SAMLCONFIGURATION.PUBLIC_KEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return ThirdPartyAuthSamlconfiguration.THIRD_PARTY_AUTH_SAMLCONFIGURATION.ENTITY_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return ThirdPartyAuthSamlconfiguration.THIRD_PARTY_AUTH_SAMLCONFIGURATION.ORG_INFO_STR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return ThirdPartyAuthSamlconfiguration.THIRD_PARTY_AUTH_SAMLCONFIGURATION.OTHER_CONFIG_STR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field9() {
        return ThirdPartyAuthSamlconfiguration.THIRD_PARTY_AUTH_SAMLCONFIGURATION.CHANGED_BY_ID;
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
        return getChangeDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value3() {
        return getEnabled();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getPrivateKey();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getPublicKey();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getEntityId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getOrgInfoStr();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getOtherConfigStr();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value9() {
        return getChangedById();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ThirdPartyAuthSamlconfigurationRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ThirdPartyAuthSamlconfigurationRecord value2(Timestamp value) {
        setChangeDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ThirdPartyAuthSamlconfigurationRecord value3(Byte value) {
        setEnabled(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ThirdPartyAuthSamlconfigurationRecord value4(String value) {
        setPrivateKey(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ThirdPartyAuthSamlconfigurationRecord value5(String value) {
        setPublicKey(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ThirdPartyAuthSamlconfigurationRecord value6(String value) {
        setEntityId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ThirdPartyAuthSamlconfigurationRecord value7(String value) {
        setOrgInfoStr(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ThirdPartyAuthSamlconfigurationRecord value8(String value) {
        setOtherConfigStr(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ThirdPartyAuthSamlconfigurationRecord value9(Integer value) {
        setChangedById(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ThirdPartyAuthSamlconfigurationRecord values(Integer value1, Timestamp value2, Byte value3, String value4, String value5, String value6, String value7, String value8, Integer value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ThirdPartyAuthSamlconfigurationRecord
     */
    public ThirdPartyAuthSamlconfigurationRecord() {
        super(ThirdPartyAuthSamlconfiguration.THIRD_PARTY_AUTH_SAMLCONFIGURATION);
    }

    /**
     * Create a detached, initialised ThirdPartyAuthSamlconfigurationRecord
     */
    public ThirdPartyAuthSamlconfigurationRecord(Integer id, Timestamp changeDate, Byte enabled, String privateKey, String publicKey, String entityId, String orgInfoStr, String otherConfigStr, Integer changedById) {
        super(ThirdPartyAuthSamlconfiguration.THIRD_PARTY_AUTH_SAMLCONFIGURATION);

        set(0, id);
        set(1, changeDate);
        set(2, enabled);
        set(3, privateKey);
        set(4, publicKey);
        set(5, entityId);
        set(6, orgInfoStr);
        set(7, otherConfigStr);
        set(8, changedById);
    }
}
