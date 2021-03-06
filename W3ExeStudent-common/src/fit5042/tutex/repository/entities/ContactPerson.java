package fit5042.tutex.repository.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Eddie
 */
@RequestScoped
@Named(value = "contactperson")
public class ContactPerson implements Serializable {
    
    public static final String GET_ALL_QUERY_NAME = "ContactPerson.getAll";
    
    private int contactPersonId;
    private String name;
    private String phoneNumber;
    
    private Set<Property> properties;

    public ContactPerson() {
    }

    public ContactPerson(int contactPersonId, String name, String phoneNumber) {
        this.contactPersonId = contactPersonId;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.properties = new HashSet<>();
    }

    public int getContactPersonId() {
        return contactPersonId;
    }

    public void setContactPersonId(int contactPersonId) {
        this.contactPersonId = contactPersonId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Set<Property> getProperties() {
        return properties;
    }

    public void setProperties(Set<Property> properties) {
        this.properties = properties;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + this.contactPersonId;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ContactPerson other = (ContactPerson) obj;
        if (this.contactPersonId != other.contactPersonId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return this.contactPersonId + " - " + name + " - " + phoneNumber;
    }
}
