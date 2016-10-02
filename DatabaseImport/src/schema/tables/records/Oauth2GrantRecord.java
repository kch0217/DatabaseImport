/**
 * This class is generated by jOOQ
 */
package schema.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;

import schema.tables.Oauth2Grant;


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
public class Oauth2GrantRecord extends UpdatableRecordImpl<Oauth2GrantRecord> implements Record7<Integer, String, Timestamp, String, Integer, Integer, Integer> {

    private static final long serialVersionUID = 755842468;

    /**
     * Setter for <code>bitnami_edx.oauth2_grant.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>bitnami_edx.oauth2_grant.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>bitnami_edx.oauth2_grant.code</code>.
     */
    public void setCode(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>bitnami_edx.oauth2_grant.code</code>.
     */
    public String getCode() {
        return (String) get(1);
    }

    /**
     * Setter for <code>bitnami_edx.oauth2_grant.expires</code>.
     */
    public void setExpires(Timestamp value) {
        set(2, value);
    }

    /**
     * Getter for <code>bitnami_edx.oauth2_grant.expires</code>.
     */
    public Timestamp getExpires() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>bitnami_edx.oauth2_grant.redirect_uri</code>.
     */
    public void setRedirectUri(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>bitnami_edx.oauth2_grant.redirect_uri</code>.
     */
    public String getRedirectUri() {
        return (String) get(3);
    }

    /**
     * Setter for <code>bitnami_edx.oauth2_grant.scope</code>.
     */
    public void setScope(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>bitnami_edx.oauth2_grant.scope</code>.
     */
    public Integer getScope() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>bitnami_edx.oauth2_grant.client_id</code>.
     */
    public void setClientId(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>bitnami_edx.oauth2_grant.client_id</code>.
     */
    public Integer getClientId() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>bitnami_edx.oauth2_grant.user_id</code>.
     */
    public void setUserId(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>bitnami_edx.oauth2_grant.user_id</code>.
     */
    public Integer getUserId() {
        return (Integer) get(6);
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
    // Record7 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Integer, String, Timestamp, String, Integer, Integer, Integer> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Integer, String, Timestamp, String, Integer, Integer, Integer> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Oauth2Grant.OAUTH2_GRANT.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Oauth2Grant.OAUTH2_GRANT.CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field3() {
        return Oauth2Grant.OAUTH2_GRANT.EXPIRES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Oauth2Grant.OAUTH2_GRANT.REDIRECT_URI;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return Oauth2Grant.OAUTH2_GRANT.SCOPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return Oauth2Grant.OAUTH2_GRANT.CLIENT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return Oauth2Grant.OAUTH2_GRANT.USER_ID;
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
        return getCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value3() {
        return getExpires();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getRedirectUri();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getScope();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getClientId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Oauth2GrantRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Oauth2GrantRecord value2(String value) {
        setCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Oauth2GrantRecord value3(Timestamp value) {
        setExpires(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Oauth2GrantRecord value4(String value) {
        setRedirectUri(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Oauth2GrantRecord value5(Integer value) {
        setScope(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Oauth2GrantRecord value6(Integer value) {
        setClientId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Oauth2GrantRecord value7(Integer value) {
        setUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Oauth2GrantRecord values(Integer value1, String value2, Timestamp value3, String value4, Integer value5, Integer value6, Integer value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached Oauth2GrantRecord
     */
    public Oauth2GrantRecord() {
        super(Oauth2Grant.OAUTH2_GRANT);
    }

    /**
     * Create a detached, initialised Oauth2GrantRecord
     */
    public Oauth2GrantRecord(Integer id, String code, Timestamp expires, String redirectUri, Integer scope, Integer clientId, Integer userId) {
        super(Oauth2Grant.OAUTH2_GRANT);

        set(0, id);
        set(1, code);
        set(2, expires);
        set(3, redirectUri);
        set(4, scope);
        set(5, clientId);
        set(6, userId);
    }
}