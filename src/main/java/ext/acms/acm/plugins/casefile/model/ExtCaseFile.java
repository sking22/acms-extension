package ext.acms.acm.plugins.casefile.model;

import com.armedia.acm.plugins.casefile.model.CaseFile;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.voodoodyne.jackson.jsog.JSOGGenerator;

import javax.persistence.*;
import java.util.Date;

@Entity
@DiscriminatorValue("ext.acms.acm.plugins.casefile.model.ExtCaseFile")
@JsonIdentityInfo(generator = JSOGGenerator.class)
public class ExtCaseFile extends CaseFile
{
    //cm_case_reporting_week
    @Column(name = "cm_case_reporting_week")
    private String caseReportingWeek;

    //cm_case_report_date
    @Column(name = "cm_case_report_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date caseReportDate;

    public String getCaseReportingWeek() {
        return caseReportingWeek;
    }

    public void setCaseReportingWeek(String caseReportingWeek) {
        this.caseReportingWeek = caseReportingWeek;
    }

    public Date getCaseReportDate() {
        return caseReportDate;
    }

    public void setCaseReportDate(Date caseReportDate) {
        this.caseReportDate = caseReportDate;
    }
}
