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

import schema.tables.OauthProviderScope;


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
public class OauthProviderScopeRecord extends UpdatableRecordImpl<OauthProviderScopeRecord> implements Record4<Integer, String, String, Byte> {

    private static final long serialVersionUID = 641132102;

    /**
     * Setter for <code>bitnami_edx.oauth_provider_scope.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>bitnami_edx.oauth_provider_scope.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>bitnami_edx.oauth_provider_scope.name</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>bitnami_edx.oauth_provider_scope.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>bitnami_edx.oauth_provider_scope.url</code>.
     */
    public void setUrl(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>bitnami_edx.oauth_provider_scope.url</code>.
     */
    public String getUrl() {
        return (String) get(2);
    }

    /**
     * Setter for <code>bitnami_edx.oauth_provider_scope.is_readonly</code>.
     */
    public void setIsReadonly(Byte value) {
        set(3, value);
    }

    /**
     * Getter for <code>bitnami_edx.oauth_provider_scope.is_readonly</code>.
     */
    public Byte getIsReadonly() {
        return (Byte) get(3);
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
    public Row4<Integer, String, String, Byte> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, String, String, Byte> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return OauthProviderScope.OAUTH_PROVIDER_SCOPE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return OauthProviderScope.OAUTH_PROVIDER_SCOPE.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return OauthProviderScope.OAUTH_PROVIDER_SCOPE.URL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field4() {
        return OauthProviderScope.OAUTH_PROVIDER_SCOPE.IS_READONLY;
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
        return getUrl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value4() {
        return getIsReadonly();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OauthProviderScopeRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OauthProviderScopeRecord value2(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OauthProviderScopeRecord value3(String value) {
        setUrl(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OauthProviderScopeRecord value4(Byte value) {
        setIsReadonly(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OauthProviderScopeRecord values(Integer value1, String value2, String value3, Byte value4) {
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
     * Create a detached OauthProviderScopeRecord
     */
    public OauthProviderScopeRecord() {
        super(OauthProviderScope.OAUTH_PROVIDER_SCOPE);
    }

    /**
     * Create a detached, initialised OauthProviderScopeRecord
     */
    public OauthProviderScopeRecord(Integer id, String name, String url, Byte isReadonly) {
        super(OauthProviderScope.OAUTH_PROVIDER_SCOPE);

        set(0, id);
        set(1, name);
        set(2, url);
        set(3, isReadonly);
    }
}
