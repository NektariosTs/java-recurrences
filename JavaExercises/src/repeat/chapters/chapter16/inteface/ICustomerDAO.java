package repeat.chapters.chapter16.inteface;

import repeat.chapters.chapter16.inteface.model.Customer;

public interface ICustomerDAO {

    void addCustomer(Customer customer);

    void updateCustomer(Long id, Customer customer);

    boolean removeCustomer(Long id);

    Customer getCustomerById(Long id);

    Customer getCustomerByPhoneNumber(String phoneNumber);

    Customer[] getCustomersByRegion(String region);

    Customer getCustomerByVat(String vat);
}
