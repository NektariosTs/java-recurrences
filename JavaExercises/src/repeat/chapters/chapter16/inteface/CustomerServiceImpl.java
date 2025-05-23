package repeat.chapters.chapter16.inteface;

import repeat.chapters.chapter16.inteface.model.Customer;

public class CustomerServiceImpl {
    private ICustomerDAO iCustomerDAO;

    public CustomerServiceImpl(ICustomerDAO iCustomerDAO) {
        this.iCustomerDAO = iCustomerDAO;
    }

    public void insertCustomer(Customer customer) throws Exception {
        try {
            if (iCustomerDAO.getCustomerByVat(customer.getVat()) != null) {
                throw new Exception("");
            }
            iCustomerDAO.addCustomer(customer);
        } catch (Exception e) {
            System.err.println("");
            throw e;
        }
    }
}
