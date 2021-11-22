package ext.acms.acm.plugins.person.model;

import com.armedia.acm.plugins.person.model.Identification;
import com.armedia.acm.plugins.person.model.Person;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.voodoodyne.jackson.jsog.JSOGGenerator;

import javax.persistence.*;
import java.util.Date;

@Entity
@DiscriminatorValue("ext.acms.acm.plugins.person.model.ExtPerson")
@JsonIdentityInfo(generator = JSOGGenerator.class)
public class ExtPerson extends Person
{
    //cm_person_legal_business_name
    @Column(name = "cm_person_legal_business_name")
    private String legalBusinessName;

    // cm_person_assc_last_name
    @Column(name = "cm_person_assc_last_name")
    private String associateLastName;

    // cm_person_assc_middle_name
    @Column(name = "cm_person_assc_middle_name")
    private String associateMiddleName;

    // cm_person_assc_first_name
    @Column(name = "cm_person_assc_first_name")
    private String associateFirstName;

    // cm_person_assc_legal_business_name
    @Column(name = "cm_person_assc_legal_business_name")
    private String associateLegalBusinessName;

    // cm_person_assc_enrollment_id
    @Column(name = "cm_person_assc_enrollment_id")
    private String associateEnrollmentId;

    // cm_person_assc_npi
    @Column(name = "cm_person_assc_npi")
    private String associateNPI;

    // cm_person_assc_tin
    @Column(name = "cm_person_assc_tin")
    private String associateTIN;

    // cm_person_assc_tin_type
    @Column(name = "cm_person_assc_tin_type")
    private String associateTinType;

    // cm_person_assc_role
    @Column(name = "cm_person_assc_role")
    private String associateRole;

    // cm_person_assc_sanc_code
    @Column(name = "cm_person_assc_sanc_code")
    private String associateSanctionCode;

    // cm_person_assc_sanc_date
    @Column(name = "cm_person_assc_sanc_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date associateSanctionDate;

    // cm_person_specialty_type
    @Column(name = "cm_person_specialty_type")
    private String providerSpecialty;

    public String getLegalBusinessName() {
        return legalBusinessName;
    }

    public void setLegalBusinessName(String legalBusinessName) {
        this.legalBusinessName = legalBusinessName;
    }

    public String getAssociateLastName() {
        return associateLastName;
    }

    public void setAssociateLastName(String associateLastName) {
        this.associateLastName = associateLastName;
    }

    public String getAssociateMiddleName() {
        return associateMiddleName;
    }

    public void setAssociateMiddleName(String associateMiddleName) {
        this.associateMiddleName = associateMiddleName;
    }

    public String getAssociateFirstName() {
        return associateFirstName;
    }

    public void setAssociateFirstName(String associateFirstName) {
        this.associateFirstName = associateFirstName;
    }

    public String getAssociateLegalBusinessName() {
        return associateLegalBusinessName;
    }

    public void setAssociateLegalBusinessName(String associateLegalBusinessName) {
        this.associateLegalBusinessName = associateLegalBusinessName;
    }

    public String getAssociateEnrollmentId() {
        return associateEnrollmentId;
    }

    public void setAssociateEnrollmentId(String associateEnrollmentId) {
        this.associateEnrollmentId = associateEnrollmentId;
    }

    public String getAssociateNPI() {
        return associateNPI;
    }

    public void setAssociateNPI(String associateNPI) {
        this.associateNPI = associateNPI;
    }

    public String getAssociateTIN() {
        return associateTIN;
    }

    public void setAssociateTIN(String associateTIN) {
        this.associateTIN = associateTIN;
    }

    public String getAssociateTinType() {
        return associateTinType;
    }

    public void setAssociateTinType(String associateTinType) {
        this.associateTinType = associateTinType;
    }

    public String getAssociateRole() {
        return associateRole;
    }

    public void setAssociateRole(String associateRole) {
        this.associateRole = associateRole;
    }

    public String getAssociateSanctionCode() {
        return associateSanctionCode;
    }

    public void setAssociateSanctionCode(String associateSanctionCode) {
        this.associateSanctionCode = associateSanctionCode;
    }

    public Date getAssociateSanctionDate() {
        return associateSanctionDate;
    }

    public void setAssociateSanctionDate(Date associateSanctionDate) {
        this.associateSanctionDate = associateSanctionDate;
    }

    public String getProviderSpecialty() {
        return providerSpecialty;
    }

    public void setProviderSpecialty(String providerSpecialty) {
        this.providerSpecialty = providerSpecialty;
    }
}
