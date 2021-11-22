package ext.acms.acm.plugins.person.model;

import com.armedia.acm.plugins.casefile.model.CaseFile;
import com.armedia.acm.plugins.person.model.Identification;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.voodoodyne.jackson.jsog.JSOGGenerator;

import javax.persistence.*;
import java.util.Date;

@Entity
@DiscriminatorValue("ext.acms.acm.plugins.person.model.ExtIdentification")
@JsonIdentityInfo(generator = JSOGGenerator.class)
public class ExtIdentification extends Identification
{
    //NLM
    //License Expiration Date  cm_id_expiration_date
    @Column(name = "cm_id_expiration_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date idExpirationDate;

    //Grace Period Expiration Date  cm_id_grace_expiration_date
    @Column(name = "cm_id_grace_expiration_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date idGraceExpirationDate;

    //Alert Date cm_id_alert_date
    @Column(name = "cm_id_alert_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date idAlertDate;

    //Grace Period Days  cm_id_grace_expiration_days
    @Column(name = "cm_id_grace_expiration_days")
    private String idGraceExpirationDays;


    //License Qualifier/Sanction cm_id_qualifier_sanction
    @Column(name = "cm_id_qualifier_sanction")
    private String idQualifierSanction;

    //DNP
    // Role Code/Type cm_id_role_code_type
    @Column(name = "cm_id_role_code_type")
    private String idRoleCodeType;


    // Screening Date cm_id_screening_date
    @Column(name = "cm_id_screening_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date idScreeningDate;

    // Exclusion Type cm_id_exclusion_type
    @Column(name = "cm_id_exclusion_type")
    private String idExclusionType;

    // Sanction Date cm_id_sanction_date
    @Column(name = "cm_id_sanction_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date idSanctionDate;

    //NPPES
    // Case Type cm_id_case_type
    @Column(name = "cm_id_case_type")
    private String idCaseType;

    // Offense Type cm_id_offense_type
    @Column(name = "cm_id_offense_type")
    private String idOffenseType;

    // Disposition Date cm_id_disposition_date
    @Column(name = "cm_id_disposition_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date idDispositionDate;

    // Case Number  cm_id_case_number
    @Column(name = "cm_id_case_number")
    private String idCaseNumber;

    // Court Name cm_id_court_name
    @Column(name = "cm_id_court_name")
    private String idCourtName;

    // Docket Request Date
    @Column(name = "cm_id_docket_request_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date idDocketRequestDate;

    // Docket Response Date
    @Column(name = "cm_id_docket_response_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date idDocketResponseDate;

    //cm_id_docket_status
    @Column(name = "cm_id_docket_status")
    private String idDocketStatus;

    //LCM --None
    //CCM --none

    //MED
    //Provider/Supplier Type cm_id_provider_supplier_type
    @Column(name = "cm_id_provider_supplier_type")
    private String idProviderSupplierType;

    //cm_id_provider_tin_type
    @Column(name = "cm_id_provider_tin_type")
    private String idProviderTinType;

    public Date getIdExpirationDate() {
        return idExpirationDate;
    }

    public void setIdExpirationDate(Date idExpirationDate) {
        this.idExpirationDate = idExpirationDate;
    }

    public Date getIdGraceExpirationDate() {
        return idGraceExpirationDate;
    }

    public void setIdGraceExpirationDate(Date idGraceExpirationDate) {
        this.idGraceExpirationDate = idGraceExpirationDate;
    }

    public Date getIdAlertDate() {
        return idAlertDate;
    }

    public void setIdAlertDate(Date idAlertDate) {
        this.idAlertDate = idAlertDate;
    }

    public String getIdGraceExpirationDays() {
        return idGraceExpirationDays;
    }

    public void setIdGraceExpirationDays(String idGraceExpirationDays) {
        this.idGraceExpirationDays = idGraceExpirationDays;
    }

    public String getIdQualifierSanction() {
        return idQualifierSanction;
    }

    public void setIdQualifierSanction(String idQualifierSanction) {
        this.idQualifierSanction = idQualifierSanction;
    }

    public String getIdRoleCodeType() {
        return idRoleCodeType;
    }

    public void setIdRoleCodeType(String idRoleCodeType) {
        this.idRoleCodeType = idRoleCodeType;
    }

    public Date getIdScreeningDate() {
        return idScreeningDate;
    }

    public void setIdScreeningDate(Date idScreeningDate) {
        this.idScreeningDate = idScreeningDate;
    }

    public String getIdExclusionType() {
        return idExclusionType;
    }

    public void setIdExclusionType(String idExclusionType) {
        this.idExclusionType = idExclusionType;
    }

    public Date getIdSanctionDate() {
        return idSanctionDate;
    }

    public void setIdSanctionDate(Date idSanctionDate) {
        this.idSanctionDate = idSanctionDate;
    }

    public String getIdCaseType() {
        return idCaseType;
    }

    public void setIdCaseType(String idCaseType) {
        this.idCaseType = idCaseType;
    }

    public String getIdOffenseType() {
        return idOffenseType;
    }

    public void setIdOffenseType(String idOffenseType) {
        this.idOffenseType = idOffenseType;
    }

    public Date getIdDispositionDate() {
        return idDispositionDate;
    }

    public void setIdDispositionDate(Date idDispositionDate) {
        this.idDispositionDate = idDispositionDate;
    }

    public String getIdCaseNumber() {
        return idCaseNumber;
    }

    public void setIdCaseNumber(String idCaseNumber) {
        this.idCaseNumber = idCaseNumber;
    }

    public String getIdCourtName() {
        return idCourtName;
    }

    public void setIdCourtName(String idCourtName) {
        this.idCourtName = idCourtName;
    }

    public Date getIdDocketRequestDate() {
        return idDocketRequestDate;
    }

    public void setIdDocketRequestDate(Date idDocketRequestDate) {
        this.idDocketRequestDate = idDocketRequestDate;
    }

    public Date getIdDocketResponseDate() {
        return idDocketResponseDate;
    }

    public void setIdDocketResponseDate(Date idDocketResponseDate) {
        this.idDocketResponseDate = idDocketResponseDate;
    }

    public String getIdDocketStatus() {
        return idDocketStatus;
    }

    public void setIdDocketStatus(String idDocketStatus) {
        this.idDocketStatus = idDocketStatus;
    }

    public String getIdProviderSupplierType() {
        return idProviderSupplierType;
    }

    public void setIdProviderSupplierType(String idProviderSupplierType) {
        this.idProviderSupplierType = idProviderSupplierType;
    }

    public String getIdProviderTinType() {
        return idProviderTinType;
    }

    public void setIdProviderTinType(String idProviderTinType) {
        this.idProviderTinType = idProviderTinType;
    }
}
