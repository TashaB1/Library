package ru.tasha2k7.mail.library.datamodel;

import java.util.Date;

/**
 * Created by Ната on 01.02.2018.
 */
public class Journal extends AbstractModel {

    private Client client;
    private Date dateFrom;
    private Date dateBy;
    private Date dateReturn;

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Date getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(Date dateFrom) {
        this.dateFrom = dateFrom;
    }

    public Date getDateBy() {
        return dateBy;
    }

    public void setDateBy(Date dateBy) {
        this.dateBy = dateBy;
    }

    public Date getDateReturn() {
        return dateReturn;
    }

    public void setDateReturn(Date dateReturn) {
        this.dateReturn = dateReturn;
    }

    @Override
    public String toString() {
        return "Journal{" +
                "clientId=" + client +
                ", dateFrom=" + dateFrom +
                ", dateBy=" + dateBy +
                ", dateReturn=" + dateReturn +
                '}';
    }
}
