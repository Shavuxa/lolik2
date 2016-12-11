package RPIS41.EMTSEV.wdad.learn.rmi;

import RPIS41.EMTSEV.wdad.learn.xml.XmlTask;

import java.io.Serializable;
import java.util.Calendar;
import java.util.List;


public class XmlDataManagerImpl implements XmlDataManager,Serializable {

    private final XmlTask xmlTask = new XmlTask("src\\RPIS41\\EMTSEV\\wdad\\learn\\xml\\test.xml");

    @Override
    public int earningsTotal(Officiant officicant, Calendar date) {
        return xmlTask.earningsTotal(officicant.getSecondName(), date);
    }

    @Override
    public void removeDay(Calendar date) {
        xmlTask.removeDay(date);
    }

    @Override
    public void changeOfficiantName(Officiant oldOfficiant, Officiant newOfficiant) {
        xmlTask.changeOfficiantName(oldOfficiant.getFirstname(), oldOfficiant.getSecondName(), newOfficiant.getFirstname(), newOfficiant.getSecondName());
    }

    @Override
    public List<Order> getOrders(Calendar calendar) {
        return xmlTask.getOrders(calendar);
    }

    @Override
    public Calendar lastOfficiantWorkDate(Officiant officiant) {
        return xmlTask.lastOfficiantWorkDate(officiant);
    }
}