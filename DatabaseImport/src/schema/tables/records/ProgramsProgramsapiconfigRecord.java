/**
 * This class is generated by jOOQ
 */
package schema.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record16;
import org.jooq.Row16;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.UInteger;

import schema.tables.ProgramsProgramsapiconfig;


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
public class ProgramsProgramsapiconfigRecord extends UpdatableRecordImpl<ProgramsProgramsapiconfigRecord> implements Record16<Integer, Timestamp, Byte, String, String, Integer, Byte, Integer, UInteger, String, String, Byte, Byte, UInteger, Byte, Byte> {

    private static final long serialVersionUID = -1850169913;

    /**
     * Setter for <code>bitnami_edx.programs_programsapiconfig.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>bitnami_edx.programs_programsapiconfig.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>bitnami_edx.programs_programsapiconfig.change_date</code>.
     */
    public void setChangeDate(Timestamp value) {
        set(1, value);
    }

    /**
     * Getter for <code>bitnami_edx.programs_programsapiconfig.change_date</code>.
     */
    public Timestamp getChangeDate() {
        return (Timestamp) get(1);
    }

    /**
     * Setter for <code>bitnami_edx.programs_programsapiconfig.enabled</code>.
     */
    public void setEnabled(Byte value) {
        set(2, value);
    }

    /**
     * Getter for <code>bitnami_edx.programs_programsapiconfig.enabled</code>.
     */
    public Byte getEnabled() {
        return (Byte) get(2);
    }

    /**
     * Setter for <code>bitnami_edx.programs_programsapiconfig.internal_service_url</code>.
     */
    public void setInternalServiceUrl(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>bitnami_edx.programs_programsapiconfig.internal_service_url</code>.
     */
    public String getInternalServiceUrl() {
        return (String) get(3);
    }

    /**
     * Setter for <code>bitnami_edx.programs_programsapiconfig.public_service_url</code>.
     */
    public void setPublicServiceUrl(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>bitnami_edx.programs_programsapiconfig.public_service_url</code>.
     */
    public String getPublicServiceUrl() {
        return (String) get(4);
    }

    /**
     * Setter for <code>bitnami_edx.programs_programsapiconfig.api_version_number</code>.
     */
    public void setApiVersionNumber(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>bitnami_edx.programs_programsapiconfig.api_version_number</code>.
     */
    public Integer getApiVersionNumber() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>bitnami_edx.programs_programsapiconfig.enable_student_dashboard</code>.
     */
    public void setEnableStudentDashboard(Byte value) {
        set(6, value);
    }

    /**
     * Getter for <code>bitnami_edx.programs_programsapiconfig.enable_student_dashboard</code>.
     */
    public Byte getEnableStudentDashboard() {
        return (Byte) get(6);
    }

    /**
     * Setter for <code>bitnami_edx.programs_programsapiconfig.changed_by_id</code>.
     */
    public void setChangedById(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>bitnami_edx.programs_programsapiconfig.changed_by_id</code>.
     */
    public Integer getChangedById() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>bitnami_edx.programs_programsapiconfig.cache_ttl</code>.
     */
    public void setCacheTtl(UInteger value) {
        set(8, value);
    }

    /**
     * Getter for <code>bitnami_edx.programs_programsapiconfig.cache_ttl</code>.
     */
    public UInteger getCacheTtl() {
        return (UInteger) get(8);
    }

    /**
     * Setter for <code>bitnami_edx.programs_programsapiconfig.authoring_app_css_path</code>.
     */
    public void setAuthoringAppCssPath(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>bitnami_edx.programs_programsapiconfig.authoring_app_css_path</code>.
     */
    public String getAuthoringAppCssPath() {
        return (String) get(9);
    }

    /**
     * Setter for <code>bitnami_edx.programs_programsapiconfig.authoring_app_js_path</code>.
     */
    public void setAuthoringAppJsPath(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>bitnami_edx.programs_programsapiconfig.authoring_app_js_path</code>.
     */
    public String getAuthoringAppJsPath() {
        return (String) get(10);
    }

    /**
     * Setter for <code>bitnami_edx.programs_programsapiconfig.enable_studio_tab</code>.
     */
    public void setEnableStudioTab(Byte value) {
        set(11, value);
    }

    /**
     * Getter for <code>bitnami_edx.programs_programsapiconfig.enable_studio_tab</code>.
     */
    public Byte getEnableStudioTab() {
        return (Byte) get(11);
    }

    /**
     * Setter for <code>bitnami_edx.programs_programsapiconfig.enable_certification</code>.
     */
    public void setEnableCertification(Byte value) {
        set(12, value);
    }

    /**
     * Getter for <code>bitnami_edx.programs_programsapiconfig.enable_certification</code>.
     */
    public Byte getEnableCertification() {
        return (Byte) get(12);
    }

    /**
     * Setter for <code>bitnami_edx.programs_programsapiconfig.max_retries</code>.
     */
    public void setMaxRetries(UInteger value) {
        set(13, value);
    }

    /**
     * Getter for <code>bitnami_edx.programs_programsapiconfig.max_retries</code>.
     */
    public UInteger getMaxRetries() {
        return (UInteger) get(13);
    }

    /**
     * Setter for <code>bitnami_edx.programs_programsapiconfig.xseries_ad_enabled</code>.
     */
    public void setXseriesAdEnabled(Byte value) {
        set(14, value);
    }

    /**
     * Getter for <code>bitnami_edx.programs_programsapiconfig.xseries_ad_enabled</code>.
     */
    public Byte getXseriesAdEnabled() {
        return (Byte) get(14);
    }

    /**
     * Setter for <code>bitnami_edx.programs_programsapiconfig.program_listing_enabled</code>.
     */
    public void setProgramListingEnabled(Byte value) {
        set(15, value);
    }

    /**
     * Getter for <code>bitnami_edx.programs_programsapiconfig.program_listing_enabled</code>.
     */
    public Byte getProgramListingEnabled() {
        return (Byte) get(15);
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
    // Record16 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row16<Integer, Timestamp, Byte, String, String, Integer, Byte, Integer, UInteger, String, String, Byte, Byte, UInteger, Byte, Byte> fieldsRow() {
        return (Row16) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row16<Integer, Timestamp, Byte, String, String, Integer, Byte, Integer, UInteger, String, String, Byte, Byte, UInteger, Byte, Byte> valuesRow() {
        return (Row16) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return ProgramsProgramsapiconfig.PROGRAMS_PROGRAMSAPICONFIG.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field2() {
        return ProgramsProgramsapiconfig.PROGRAMS_PROGRAMSAPICONFIG.CHANGE_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field3() {
        return ProgramsProgramsapiconfig.PROGRAMS_PROGRAMSAPICONFIG.ENABLED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return ProgramsProgramsapiconfig.PROGRAMS_PROGRAMSAPICONFIG.INTERNAL_SERVICE_URL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return ProgramsProgramsapiconfig.PROGRAMS_PROGRAMSAPICONFIG.PUBLIC_SERVICE_URL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return ProgramsProgramsapiconfig.PROGRAMS_PROGRAMSAPICONFIG.API_VERSION_NUMBER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field7() {
        return ProgramsProgramsapiconfig.PROGRAMS_PROGRAMSAPICONFIG.ENABLE_STUDENT_DASHBOARD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field8() {
        return ProgramsProgramsapiconfig.PROGRAMS_PROGRAMSAPICONFIG.CHANGED_BY_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UInteger> field9() {
        return ProgramsProgramsapiconfig.PROGRAMS_PROGRAMSAPICONFIG.CACHE_TTL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return ProgramsProgramsapiconfig.PROGRAMS_PROGRAMSAPICONFIG.AUTHORING_APP_CSS_PATH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return ProgramsProgramsapiconfig.PROGRAMS_PROGRAMSAPICONFIG.AUTHORING_APP_JS_PATH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field12() {
        return ProgramsProgramsapiconfig.PROGRAMS_PROGRAMSAPICONFIG.ENABLE_STUDIO_TAB;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field13() {
        return ProgramsProgramsapiconfig.PROGRAMS_PROGRAMSAPICONFIG.ENABLE_CERTIFICATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UInteger> field14() {
        return ProgramsProgramsapiconfig.PROGRAMS_PROGRAMSAPICONFIG.MAX_RETRIES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field15() {
        return ProgramsProgramsapiconfig.PROGRAMS_PROGRAMSAPICONFIG.XSERIES_AD_ENABLED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field16() {
        return ProgramsProgramsapiconfig.PROGRAMS_PROGRAMSAPICONFIG.PROGRAM_LISTING_ENABLED;
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
        return getInternalServiceUrl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getPublicServiceUrl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getApiVersionNumber();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value7() {
        return getEnableStudentDashboard();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value8() {
        return getChangedById();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UInteger value9() {
        return getCacheTtl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getAuthoringAppCssPath();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getAuthoringAppJsPath();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value12() {
        return getEnableStudioTab();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value13() {
        return getEnableCertification();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UInteger value14() {
        return getMaxRetries();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value15() {
        return getXseriesAdEnabled();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value16() {
        return getProgramListingEnabled();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProgramsProgramsapiconfigRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProgramsProgramsapiconfigRecord value2(Timestamp value) {
        setChangeDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProgramsProgramsapiconfigRecord value3(Byte value) {
        setEnabled(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProgramsProgramsapiconfigRecord value4(String value) {
        setInternalServiceUrl(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProgramsProgramsapiconfigRecord value5(String value) {
        setPublicServiceUrl(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProgramsProgramsapiconfigRecord value6(Integer value) {
        setApiVersionNumber(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProgramsProgramsapiconfigRecord value7(Byte value) {
        setEnableStudentDashboard(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProgramsProgramsapiconfigRecord value8(Integer value) {
        setChangedById(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProgramsProgramsapiconfigRecord value9(UInteger value) {
        setCacheTtl(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProgramsProgramsapiconfigRecord value10(String value) {
        setAuthoringAppCssPath(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProgramsProgramsapiconfigRecord value11(String value) {
        setAuthoringAppJsPath(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProgramsProgramsapiconfigRecord value12(Byte value) {
        setEnableStudioTab(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProgramsProgramsapiconfigRecord value13(Byte value) {
        setEnableCertification(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProgramsProgramsapiconfigRecord value14(UInteger value) {
        setMaxRetries(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProgramsProgramsapiconfigRecord value15(Byte value) {
        setXseriesAdEnabled(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProgramsProgramsapiconfigRecord value16(Byte value) {
        setProgramListingEnabled(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProgramsProgramsapiconfigRecord values(Integer value1, Timestamp value2, Byte value3, String value4, String value5, Integer value6, Byte value7, Integer value8, UInteger value9, String value10, String value11, Byte value12, Byte value13, UInteger value14, Byte value15, Byte value16) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        value15(value15);
        value16(value16);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ProgramsProgramsapiconfigRecord
     */
    public ProgramsProgramsapiconfigRecord() {
        super(ProgramsProgramsapiconfig.PROGRAMS_PROGRAMSAPICONFIG);
    }

    /**
     * Create a detached, initialised ProgramsProgramsapiconfigRecord
     */
    public ProgramsProgramsapiconfigRecord(Integer id, Timestamp changeDate, Byte enabled, String internalServiceUrl, String publicServiceUrl, Integer apiVersionNumber, Byte enableStudentDashboard, Integer changedById, UInteger cacheTtl, String authoringAppCssPath, String authoringAppJsPath, Byte enableStudioTab, Byte enableCertification, UInteger maxRetries, Byte xseriesAdEnabled, Byte programListingEnabled) {
        super(ProgramsProgramsapiconfig.PROGRAMS_PROGRAMSAPICONFIG);

        set(0, id);
        set(1, changeDate);
        set(2, enabled);
        set(3, internalServiceUrl);
        set(4, publicServiceUrl);
        set(5, apiVersionNumber);
        set(6, enableStudentDashboard);
        set(7, changedById);
        set(8, cacheTtl);
        set(9, authoringAppCssPath);
        set(10, authoringAppJsPath);
        set(11, enableStudioTab);
        set(12, enableCertification);
        set(13, maxRetries);
        set(14, xseriesAdEnabled);
        set(15, programListingEnabled);
    }
}
