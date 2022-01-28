package persistence;

import model.Client;
import persistence.commons.GenericDAO;

public interface ClientDAO extends GenericDAO<Client> {
    Client findById(Integer id);
}
